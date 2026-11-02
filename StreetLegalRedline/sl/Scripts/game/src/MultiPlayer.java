package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.render.osd.dialog.*;	//Text
import java.sound.*;
import java.game.parts.*;

import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.*;

/********************************************
*			MultiPlayer v1.0				*
*		By Miran & Wichur VIII.2007			*
********************************************/

public class MultiPlayer extends Scene implements GameState
{

	final static int  	CMD_BACK	= 0;
	final static int  	CMD_START	= 1;
	final static int  	CMD_ABOUT	= 2;

	final static int	CMD_NAME1	= 10;
	final static int	CMD_NAME2	= 11;
	final static int	CMD_TRACK	= 12;
	final static int	CMD_CAR1	= 13;
	final static int	CMD_CAR2	= 14;
	final static int	CMD_SAVE1	= 15;
	final static int	CMD_SAVE2	= 16;
	final static int	CMD_MODIFY1 = 17;
	final static int	CMD_MODIFY2 = 18;
	final static int	CMD_INFO1	= 19;
	final static int	CMD_INFO2	= 20;

	final static int	CMD_CATALOG		= 30;
	final static int	CMD_INFO		= 31;
	final static int	CMD_MECHANIC	= 32;
	final static int	CMD_TUNE		= 33;
	final static int	CMD_PAINT		= 34;

	int bgVideoActive, SizeCar1, SizeCar2, TempInt;
	
	final static String		Player1_Name, Player2_Name;
	int			actGroup, MainGroup, ModifyGroup, CurrentPlayer;
	Text		CurrentTrackNameText, CurrentTrackDescription;
	TextBox		CurrentTrackDescriptionText, Player1_CarInfoText, Player2_CarInfoText;
	Rectangle	CurrentTrackImage;
	Style		Menu_Button, Menu_Left, Menu_Right, Menu_Center, Menu_Left_Small;
	Button		Start_Button, Player1_Name_Button, Player2_Name_Button, Player1_Car_Button, Player2_Car_Button, Player1_Save_Button, Player2_Save_Button, Player1_Modify_Button, Player2_Modify_Button, Player1_Info_Button, Player2_Info_Button;
	Menu		m;
	Text		infoline;
	
	String		Name, Power, Nitro, Mass, DriveType;
	Block		engine;

	GameRef		Car1Scene, Car2Scene;
	RenderRef	SceneLight, Car1SceneLight, Car2SceneLight;
	Camera		Car1Cam, Car2Cam;
	Viewport	Car1vp, Car2vp;
	Thread		CamThread;
	Ypr			CamYpr;
	Vector3		CamVector1, CamVector2;

	Osd			osd;
	Mechanic mechanic;
	Painter painter;
	GameState		parentState;
	
	public MultiPlayer()
	{
		createNativeInstance();
	}


    public void enter( GameState prevState )
    {
		Frontend.loadingScreen.show();

		osd = new Osd();
		osd.globalHandler = this;

		setEventMask( EVENT_TIME );

		createOSDObjects();
		osd.show();

		Input.cursor.enable(1);
		setEventMask( EVENT_CURSOR );

		if( !parentState )
			parentState=prevState;

		if( !prevState instanceof Garage )
		{
			new SfxRef( GameLogic.SFX_ENTERGARAGE ).play();
		}

		//filmik w tle
		GfxEngine.openVideo("Data\\Fmv\\Prime.avi", 1, 1 );

		Frontend.loadingScreen.display();
	}

	public void exit( GameState nextState )
	{
		Frontend.loadingScreen.show();

		HideCars();

		clearEventMask( EVENT_ANY );
		removeAllTimers();
		Input.cursor.enable(0);

		osd.hide();

		//osd background renderer cleanup
		if( bgVideoActive )
			GfxEngine.closeVideo();


		Frontend.loadingScreen.display();
	}

	public void createOSDObjects()
	{
	// Players' names:
		if(!Player1_Name)
		{
			Player1_Name = "Player 1";
			Player2_Name = "Player 2";
		}
		GameLogic.player.name = Player1_Name;
		GameLogic.player2.name = Player2_Name;

	// Create Styles:
		Menu_Button = new Style( 0.12, 0.12, Frontend.mediumFont, Text.ALIGN_CENTER, null );
		Menu_Left = new Style( 0.30, 0.13, Frontend.mediumFont, Text.ALIGN_LEFT, Osd.RRT_TEST );
		Menu_Right = new Style( 0.30, 0.13, Frontend.mediumFont, Text.ALIGN_RIGHT, Osd.RRT_TEST );
		Menu_Center = new Style( 0.30, 0.13, Frontend.mediumFont, Text.ALIGN_CENTER, Osd.RRT_TEST );
		Menu_Left_Small = new Style( 0.30, 0.13, Frontend.smallFont, Text.ALIGN_LEFT, Osd.RRT_TEST );

	// Always visable elements:
		osd.createHeader( "MULTI PLAYER" );
		osd.createBG( new ResourceRef(frontend:0x0016r) );

		osd.endGroup();

	// Main Osd Group:
		m = osd.createMenu( Menu_Right, 0.98, -0.83, 0 );
		m.addItem( "ABOUT", CMD_ABOUT );

		m = osd.createMenu( Menu_Left, -0.98, 0.85, 0 );
		m.addItem( "BACK", CMD_BACK );
		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL|Osd.HK_STATIC, CMD_BACK, this );// ESC key = CMD_BACK

		m = osd.createMenu( Menu_Right, 0.98, 0.85, 0 );
		Start_Button = m.addItem( "START", CMD_START );

	// Text boxes, Track section;
		m = osd.createMenu( Menu_Center, 0.65, -0.7, 0, Osd.MD_HORIZONTAL );
		m.addItem( "TRACK", CMD_TRACK, "Click to change" );

		CurrentTrackNameText = osd.createText( "- NO TRACK SELECTED -", Frontend.smallFont, Text.ALIGN_CENTER, 0.66, -0.2 ); CurrentTrackNameText.changeColor(0xFFC0C0C0);// "Unselected" gray

		osd.createRectangle( -0.65, 0.05, 0.64, 1.4, -1, new ResourceRef(MW_Mod:0x0034r) );//player 1 frame ptx
		osd.createRectangle( 0.0, 0.05, 0.64, 1.4, -1, new ResourceRef(MW_Mod:0x0034r) );//player 2 frame ptx	
		osd.createRectangle( 0.65, 0.07, 0.64, 0.42, -1, new ResourceRef(MW_Mod:0x0030r) );//map description frame ptx
		CurrentTrackImage = osd.createRectangle( 0.65, -0.44, 0.64, 0.42, -1, new ResourceRef(MW_Mod:0x0030r) );//map image frame ptx

		if (TrackSelect.TrackSelected == 1)
		{
			CurrentTrackNameText.changeText(TrackSelect.MapName);
			CurrentTrackImage.changeTexture( new ResourceRef(TrackSelect.MapImage) );
		}

	// Player 2 Car section:
		m = osd.createMenu( Menu_Center, -0.65, -0.7, 0, Osd.MD_VERTICAL );
		Player2_Name_Button = m.addItem( Player2_Name, CMD_NAME2, "Click to change name" );

		m = osd.createMenu( Menu_Left, -0.96, -0.58, 0, Osd.MD_HORIZONTAL );
		Player2_Car_Button = m.addItem( "Car:", CMD_CAR2, "Click to change car" );

		m = osd.createMenu( Menu_Button, -0.92, 0.68, 0, Osd.MD_HORIZONTAL );
		Player2_Modify_Button = m.addItem( new ResourceRef( frontend:0x0129r ), CMD_MODIFY2, "Modify this car" );
		Player2_Info_Button = m.addItem( new ResourceRef( frontend:0x0124r ), CMD_INFO2, "Details of this car" );
		Player2_Save_Button = m.addItem( new ResourceRef( frontend:0x0072r ), CMD_SAVE2, "Save this car to file" );

		Player2_CarInfoText = osd.createTextBox( "", Frontend.smallFont, Text.ALIGN_LEFT, -0.94, 0.14, 0.58 ); Player2_CarInfoText.changeColor(0xFFC0C0C0);// "Unselected" gray

	// Player 1 Car section:
		m = osd.createMenu( Menu_Center, 0.0, -0.7, 0, Osd.MD_VERTICAL );
		Player1_Name_Button = m.addItem( Player1_Name, CMD_NAME1, "Click to change name" );

		m = osd.createMenu( Menu_Left, -0.31, -0.58, 0, Osd.MD_HORIZONTAL );
		Player1_Car_Button = m.addItem( "Car:", CMD_CAR1, "Click to change car" );

		m = osd.createMenu( Menu_Button, -0.27, 0.68, 0, Osd.MD_HORIZONTAL );
		Player1_Modify_Button = m.addItem( new ResourceRef( frontend:0x0129r ), CMD_MODIFY1, "Modify this car" );
		Player1_Info_Button = m.addItem( new ResourceRef( frontend:0x0124r ), CMD_INFO1, "Details of this car" );
		Player1_Save_Button = m.addItem( new ResourceRef( frontend:0x0072r ), CMD_SAVE1, "Save this car to file" );

		Player1_CarInfoText = osd.createTextBox( "", Frontend.smallFont, Text.ALIGN_LEFT, -0.29, 0.14, 0.58 ); Player1_CarInfoText.changeColor(0xFFC0C0C0);// "Unselected" gray

		ShowCars();
		RefreshOsd();
		actGroup = MainGroup = osd.endGroup();

	// Modify Osd Group:
		infoline=osd.createText( null, Frontend.mediumFont, Text.ALIGN_RIGHT, 0.97, 0.54);

		m = osd.createMenu( Menu_Button, 0.3, -0.835, 0, Osd.MD_HORIZONTAL );
		m.addItem( new ResourceRef( frontend:0x0125r ), CMD_CATALOG, "Browse the Catalog" );
		m.addItem( new ResourceRef( frontend:0x0124r ), CMD_INFO, "Details of this car" );
		m.addSeparator();
		m.addSeparator();
		m.addItem( new ResourceRef( frontend:0x0129r ), CMD_MECHANIC, "Install/Remove parts" );
		m.addItem( new ResourceRef( frontend:0x0128r ), CMD_TUNE, "Fine tune specific parts" );
		m.addItem( new ResourceRef( frontend:0x012Cr ), CMD_PAINT,"Body paint" );
		m.addSeparator();
		m.addSeparator();
		m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_BACK, "End modify car" );

		osd.hideGroup( ModifyGroup = osd.endGroup() );
	}

	public void RefreshOsd()
	{
	// Start Button:
		Start_Button.disable();
		if(GameLogic.player.car && GameLogic.player2.car && TrackSelect.TrackSelected==1) // Players has cars and is track selected
			Start_Button.enable();

	// Player 1
		Player1_Modify_Button.disable();
		Player1_Info_Button.disable();
		Player1_Save_Button.disable();

		Name = "- NO CAR SELECTED -";
		Power = "N/A";
		Nitro = "N/A";
		Mass = "N/A";
		DriveType = "N/A"; 

		if( GameLogic.player.car )
		{
			GameLogic.player.car.setParent( Car1Scene );
			GameLogic.player.car.setMatrix( null, null ); // Set at 0,0,0, center of view 
			GameLogic.player.car.command( "stop" );
			GameLogic.player.car.command( "reset" );
			GameLogic.player.car.command( "setsteer -0.6" );

			SizeCar1 = GameLogic.player.car.getInfo( GameType.GII_SIZE )/42; // Set camera distance

			Name = "Dummy Car";
			DriveType = driveType(GameLogic.player.car.getInfo( GII_CAR_DRIVETYPE ));

			if( GameLogic.player.car.chassis )
			{
				Name = GameLogic.player.car.chassis.vehicleName;
				
				TempInt = GameLogic.player.car.chassis.tank_nitro;
				Nitro = TempInt + " pounds";
				if(TempInt==0) Nitro = "No installed";

				TempInt = GameLogic.player.car.chassis.getMass();
				Mass = TempInt+" kg";

				if( GameLogic.player.car.iteratePartsInit() )
				{
					Part part;
					while( part = GameLogic.player.car.iterateParts() )
					{
						if ( part instanceof Block )
						{
							engine = part;
							Power = Float.toString(engine.dynodata.maxHP, "%1.0f HP");
							break;
						}
					}
				}

				Player1_Modify_Button.enable();
				Player1_Info_Button.enable();
				Player1_Save_Button.enable();
			}
		}

		Player1_CarInfoText.changeText("Name: "+Name+" \n \n  Power: "+Power+" \n Nitro: "+Nitro+" \n \n Mass: "+Mass+" \n \n Drive Type: "+DriveType);

	// Player 2
		Player2_Modify_Button.disable();
		Player2_Info_Button.disable();
		Player2_Save_Button.disable();

		Name = "- NO CAR SELECTED -";
		Power = "N/A";
		Nitro = "N/A";
		Mass = "N/A";
		DriveType = "N/A"; 

		if( GameLogic.player2.car )
		{
			GameLogic.player2.car.setParent( Car2Scene );
			GameLogic.player2.car.setMatrix( null, null ); // Set at 0,0,0, center of view 
			GameLogic.player2.car.command( "stop" );
			GameLogic.player2.car.command( "reset" );
			GameLogic.player2.car.command( "setsteer -0.6" );

			SizeCar2 = GameLogic.player2.car.getInfo( GameType.GII_SIZE )/42; // Set camera distance

			Name = "Dummy Car";
			DriveType = driveType(GameLogic.player2.car.getInfo( GII_CAR_DRIVETYPE ));

			if( GameLogic.player2.car.chassis )
			{
				Name = GameLogic.player2.car.chassis.vehicleName;
				
				TempInt = GameLogic.player2.car.chassis.tank_nitro;
				Nitro = TempInt + " pounds";
				if(TempInt==0) Nitro = "No installed";

				TempInt = GameLogic.player2.car.chassis.getMass();
				Mass = TempInt+" kg";

				if( GameLogic.player2.car.iteratePartsInit() )
				{
					Part part;
					while( part = GameLogic.player2.car.iterateParts() )
					{
						if ( part instanceof Block )
						{
							engine = part;
							Power = Float.toString(engine.dynodata.maxHP, "%1.0f HP");
							break;
						}
					}
				}

				Player2_Modify_Button.enable();
				Player2_Info_Button.enable();
				Player2_Save_Button.enable();
			}
		}

		Player2_CarInfoText.changeText("Name: "+Name+" \n \n  Power: "+Power+" \n Nitro: "+Nitro+" \n \n Mass: "+Mass+" \n \n Drive Type: "+DriveType);
	}

	public String driveType( int type )
	{
		if( type == 0 )
			return "No wheel drive";
		else if( type == 1 )
			return "All wheel drive";
		else if( type == 2 )
			return "Front wheel drive";
		else if( type == 3 )
			return "Rear wheel drive";
		else if( type == 4 )
			return "Cross wheel drive";

		return "Uncommon";
	}

	public void osdCommand( int cmd )
	{
		if( cmd == CMD_BACK )
		{
			GameLogic.changeActiveSection( parentState );
		}
		if( cmd == CMD_START )
		{
			HideCars();

			GameLogic.player.driverID = new RenderRef(GameLogic.HUMAN_PLAYER);
			GameLogic.player2.driverID = new RenderRef(GameLogic.HUMAN_PLAYER);

			GameLogic.gameMode = GameLogic.GM_MULTIPLAYER;
			TrackSelect.MapBox.elementData[TrackSelect.CurrentMapNumber].StartMap();
		}
		else
		if( cmd == CMD_NAME1 )
		{
			StringRequesterDialog d = new StringRequesterDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.SIF_NOEMPTY, "Enter Player 1 name:", Player1_Name );
			if( d.display() == 0 )
			{
				Player1_Name = d.input;
				Player1_Name_Button.changeLabelText( Player1_Name );
			}
		}
		else
		if( cmd == CMD_NAME2 )
		{
			StringRequesterDialog d = new StringRequesterDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.SIF_NOEMPTY, "Enter Player 2 name:", Player2_Name );
			if( d.display() == 0 )
			{
				Player2_Name = d.input;
				Player2_Name_Button.changeLabelText( Player2_Name );
			}
		}
		else
		if( cmd == CMD_CAR1 )
		{
			GameLogic.changeActiveSection( new CarSelect(GameLogic.player) );
		}
		else
		if( cmd == CMD_CAR2 )
		{
			GameLogic.changeActiveSection( new CarSelect(GameLogic.player2) );
		}
		else
		if( cmd == CMD_INFO1 )
		{
			GameLogic.changeActiveSection( new CarInfo( GameLogic.player.car ) );
		}
		else
		if( cmd == CMD_INFO2 )
		{
			GameLogic.changeActiveSection( new CarInfo( GameLogic.player2.car ) );
		}
		else
		if (cmd == CMD_SAVE1)
		{
			MultiSaveDialog d = new MultiSaveDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.FRF_SAVE, "SAVE CAR", "SAVE CAR", GameLogic.carSaveDir, "*" );

			if( d.display() == 0 )
			{
				String filename = GameLogic.carSaveDir + d.fileName;
				if (File.exists(filename))
				{
					File.delete( filename );
					File.delete( filename + ".*" );
				}

				GameLogic.player.car.save( filename );
				new WarningDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "SAVE CAR", GameLogic.player.name + " car has been saved." ).display();
			}
		}
		else
		if (cmd == CMD_SAVE2)
		{
			MultiSaveDialog d = new MultiSaveDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.FRF_SAVE, "SAVE CAR", "SAVE CAR", GameLogic.carSaveDir, "*" );

			if( d.display() == 0 )
			{
				String filename = GameLogic.carSaveDir + d.fileName;
				if (File.exists(filename))
				{
					File.delete( filename );
					File.delete( filename + ".*" );
				}

				GameLogic.player.car.save( filename );
				new WarningDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "SAVE CAR", GameLogic.player.name + " car has been saved." ).display();
			}
		}
		else
		if( cmd == CMD_MODIFY1 )
		{
			changeGroup( ModifyGroup );
						
			painter =  new Painter( GameLogic.player, osd, null, infoline, 1 );
			mechanic = new Mechanic( GameLogic.player, osd, null, infoline, 1 );

			CurrentPlayer = 0;

			mechanic.show();
		}
		else
		if( cmd == CMD_TRACK )
		{
			GameLogic.changeActiveSection( new TrackSelect(1) );
		}
		else
		if( cmd == CMD_INFO )
		{
			if(CurrentPlayer == 0)
				GameLogic.changeActiveSection( new CarInfo( GameLogic.player.car ) );

		}
	}

	public void run()
	{
		if( Car1Cam && Car2Cam )
		{
			for(;;)
			{
				CamYpr = new Ypr( System.currentTime()*0.5f,-0.4,0 ); 
				CamVector1 = new Vector3( 0.0, 0.0, SizeCar1 );
				CamVector1.rotate( CamYpr );

				CamVector2 = new Vector3( 0.0, 0.0, SizeCar2 );
				CamVector2.rotate( CamYpr );

				Car1Cam.setMatrix( CamVector1, CamYpr );
				Car2Cam.setMatrix( CamVector2, CamYpr );

				CamThread.sleep(35);
			}
		}
	}

	public void ShowCars()
	{
		Car2Scene = new Dummy( WORLDTREEROOT );
		Car2vp = new Viewport( 12, 0.019, 0.24, 0.314, 0.31 );
		Car2vp.activate( Viewport.RENDERFLAG_CLEARDEPTH | Viewport.RENDERFLAG_CLEARTARGET );
		Car2Cam = new Camera( Car2Scene, Car2vp, 0 );

		SceneLight = new RenderRef(maps.skydome:0x0024r);
		SceneLight.setLight( 0x00DC6464, 0x00646464, 0x00C8C8C8);
		Car2SceneLight = new RenderRef( Car2Scene, SceneLight, "Light for Player2 Car" );

		Car1Scene = new Dummy( WORLDTREEROOT );
		Car1vp = new Viewport( 12, 0.344, 0.24, 0.314, 0.31 );
		Car1vp.activate( Viewport.RENDERFLAG_CLEARDEPTH | Viewport.RENDERFLAG_CLEARTARGET );
		Car1Cam = new Camera( Car1Scene, Car1vp, 0 );

	// Same light as in Car2Scene
		Car1SceneLight = new RenderRef( Car1Scene, SceneLight, "Light for Player1 Car" );
		

		CamThread = new Thread( this, "Cam Animate Refresher" );
		CamThread.start();
	}

	public void HideCars()
	{
		if( GameLogic.player.car )
		{	
			GameLogic.player.car.command( "start" );
			GameLogic.player.car.setParent( GameLogic.player );
		}
		if( GameLogic.player2.car ) 
		{	
			GameLogic.player2.car.command( "start" );
			GameLogic.player2.car.setParent( GameLogic.player2 );
		}

		if(CamThread) CamThread.stop(); CamThread=null;

		if(Car1Cam) Car1Cam.destroy(); Car1Cam=null;
		if(Car1vp) Car1vp.destroy(); Car1vp=null;
		if(Car1Scene) Car1Scene.destroy(); Car1Scene=null;
		if(Car1SceneLight) Car1SceneLight.destroy(); Car1SceneLight=null;

		if(Car2Cam) Car2Cam.destroy(); Car2Cam=null;
		if(Car2vp) Car2vp.destroy(); Car2vp=null;
		if(Car2Scene) Car2Scene.destroy(); Car2Scene=null;
		if(Car2SceneLight) Car2SceneLight.destroy(); Car2SceneLight=null;
	}

	public void show()
	{
		super.show();
		osd.show();
	}

	public void hide()
	{
		osd.hide();
		super.hide();
	}

	public void changeGroup(int group)
	{
		if( actGroup != group )
		{
			if (actGroup >= 0)
			{
				osd.hideGroup (actGroup);
			}

			actGroup = group;

			if (actGroup >= 0)
			{
				osd.showGroup (actGroup);
				osd.changeSelection2( -1, 0 );
			}
		}
	}
}

class MultiSaveDialog extends FileRequesterDialog
{
	public MultiSaveDialog( Controller ctrl, int myflags, String mytitle, String OKButtonText, String path, String mask )
	{
		super( ctrl, myflags, mytitle, OKButtonText, path, mask );
		if( myflags & FRF_SAVE )
			osd.defSelection = 5;
	}

	public int validator( String filename )
	{
		return Vehicle.fileCheck( filename );
	}
}
