package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.render.osd.dialog.*;	//Text
import java.sound.*;

import java.game.parts.*;
import java.game.parts.bodypart.*;


public class Painter extends GameType implements GameState
{
	final static int RID_PAINT_SPRAY = frontend:0x0130r;
	final static int RID_PAINT_PART = frontend:0x0131r;
	final static int RID_PAINT_DECAL = frontend:0x0132r;	

	final static int RID_PAINT_LOAD = frontend:0x0011r;	
	final static int RID_PAINT_SAVE = frontend:0x0072r;	
		 
	final static int RID_BACKGROUND = frontend:0x00C0r;
	final static float BACKGROUND_HEIGHT = 0.40;

	final static float PARTS_VP_TOP = 0.815;
	final static float PARTS_VP_LEFT = 0.226;
	final static float PARTS_VP_WIDTH = 0.696;
	final static float PARTS_VP_HEIGHT = 0.178;

	final static int CMD_SCROLL_UP = 0;
	final static int CMD_SCROLL_DOWN = 1;
	final static int CMD_SPRAY = 2;
	final static int CMD_PART = 3;
	final static int CMD_DECALS = 4;

	final static ResourceRef  PAINTBRUSH = new ResourceRef( misc.garage:0x0102r );
	final static SfxRef  SfxSPRAY = new SfxRef( GameLogic.SFX_SPRAY );
	final static SfxRef  SfxDECAL = new SfxRef( GameLogic.SFX_DECAL );
	final static SfxRef  SfxWARN = new SfxRef( frontend:0x0081r );

	final static int  RID_button_decal = misc.garage:0x0000008Cr;

	//0-63: colorbuttons hasznaljak!
	final static int  CMD_DECALBUTTONS	= 64;
	//64-68: decalsbuttons hasznaljak!
	final static int  CMD_NONE			= 100;

	final static int  CMD_BRUSHINC	= 102;
	final static int  CMD_BRUSHDEC	= 103;
	final static int  CMD_BRUSHRCW	= 104;
	final static int  CMD_BRUSHRCCW = 105;
	final static int  CMD_BRUSHFLIP = 106;
	final static int  CMD_LOADSKIN	= 107;
	final static int  CMD_SAVESKIN	= 108;
	final static int  CMD_COPYSKIN	= 109;
	final static int  CMD_C_COPY  = 110;
	final static int  CMD_C_PAINT = 111;

	final static int  MODE_NONE = 0;
	final static int  MODE_PAINTCOLOR = 1;
	final static int  MODE_PAINTPART = 2;
	final static int  MODE_PAINTDECAL = 3;
	final static int  MODE_COPY = 4;

	ControlSetState	css;

	PaintInventory	paintCans;
	int				overVehicle;	//where is the pointer?

	int				mode;
	int				lastPaintMode=MODE_PAINTPART;

	GameRef			paintCursor;
	ResourceRef		paintBrush;

	int				brushColor=0xFFFFFFFF;
	float			decalRotation;
	float			decalSize = 0.7;
	int				decalFlip;
	
	GameRef[]		decalButtons;
	RenderRef[]		decalButtonTypes = new RenderRef[5];
	RenderRef[]		decalButtonInstances = new RenderRef[5];
	ResourceRef[]	decalButtonTextures = new ResourceRef[5];
	int				showDecals;

	int				spraySfxID, spraySfxOn;

	int				handleControls;

	Osd				osd;
	int				copyGroup, paintGroup, colorsGroup, decalsGroup, brushGroup, sprayGroup, osdGroup;
	Text			moneyTxt, infoline, invLineTxt;
	
	Player			player;

	Gadget			red0, red1;

	final static int PF_REDUCED_FUNCTIONALITY = 1;
	int				flags;

	Rectangle		copy_prev;
	int				copy_texture, copy_status; // 0 copy, 1 paint
	Button			copy_button, paint_button;

	public Painter( Player p, Osd o, Text mt, Text il, int ctrl )
	{
		createNativeInstance();

		player=p;
		osd=o;
		moneyTxt = mt;
		infoline = il;
		handleControls = ctrl;

		//initialize osd
		osd.globalHandler = this;

		Style btnUp = new Style( 0.10, 0.10, 1.0, Frontend.mediumFont, Text.ALIGN_CENTER, new ResourceRef( Osd.RID_ARROWUP ) );
		osd.createButton( btnUp, 0.94, 0.68, CMD_SCROLL_UP, "Scroll up" );

		Style btnDn = new Style( 0.10, 0.10, 1.0, Frontend.mediumFont, Text.ALIGN_CENTER, new ResourceRef( Osd.RID_ARROWDN ) );
		osd.createButton( btnDn, 0.94, 0.92, CMD_SCROLL_DOWN, "Scroll down" );

		invLineTxt = osd.createText( "1", Frontend.largeFont, Text.ALIGN_CENTER,	0.95,  0.76);
		osd.createRectangle( 0.0, 1.0-(BACKGROUND_HEIGHT/2), 2.0, BACKGROUND_HEIGHT, -1, new ResourceRef( RID_BACKGROUND ) );

		osd.hideGroup( osdGroup=osd.endGroup() );

		Style buttonStyle = new Style( 0.12, 0.12, Frontend.mediumFont, Text.ALIGN_LEFT, null );
		Menu m = osd.createMenu( buttonStyle, -0.98, 0.72, 0.12, Osd.MD_HORIZONTAL );

		red0 =	m.addItem( new ResourceRef( RID_PAINT_SPRAY ), CMD_SPRAY, "Spray paint" );
				m.addItem( new ResourceRef( RID_PAINT_PART ), CMD_PART, "Paint whole parts" );
		red1 =	m.addItem( new ResourceRef( RID_PAINT_DECAL ), CMD_DECALS, "Apply decals" );

		m = osd.createMenu( buttonStyle, -0.98, 0.88, 0.12, Osd.MD_HORIZONTAL );

		m.addItem( new ResourceRef( RID_PAINT_LOAD ), CMD_LOADSKIN, "Load paint job" );
		m.addItem( new ResourceRef( RID_PAINT_SAVE ), CMD_SAVESKIN, "Save paint job" );
		m.addItem( new ResourceRef( MW_Mod:0x0098r ), CMD_COPYSKIN, "Copy part paint" );

		osd.hideGroup( paintGroup = osd.endGroup() );

		osd.hideGroup( colorsGroup = osd.endGroup() );
		
	
		decalButtons=new GameRef[5];
		float k=-0.425, l=0.285;
		decalButtons[0] = osd.createButton( RID_button_decal,   k, 0.80, null, Frontend.mediumFont, Text.ALIGN_LEFT, this, CMD_DECALBUTTONS ); k+=l;
		decalButtons[1] = osd.createButton( RID_button_decal,   k, 0.80, null, Frontend.mediumFont, Text.ALIGN_LEFT, this, CMD_DECALBUTTONS+1 ); k+=l;
		decalButtons[2] = osd.createButton( RID_button_decal,   k, 0.80, null, Frontend.mediumFont, Text.ALIGN_LEFT, this, CMD_DECALBUTTONS+2 ); k+=l;
		decalButtons[3] = osd.createButton( RID_button_decal,   k, 0.80, null, Frontend.mediumFont, Text.ALIGN_LEFT, this, CMD_DECALBUTTONS+3 ); k+=l;
		decalButtons[4] = osd.createButton( RID_button_decal,   k, 0.80, null, Frontend.mediumFont, Text.ALIGN_LEFT, this, CMD_DECALBUTTONS+4 ); k+=l;

		osd.hideGroup( decalsGroup = osd.endGroup() );

		buttonStyle = new Style( 0.30, 0.1, Frontend.mediumFont, Text.ALIGN_LEFT, new ResourceRef(Mechanic.RID_BTN_L) );
		m = osd.createMenu( buttonStyle, -1.0, 0.15, 0 );
		m.addItem( "FLIP", CMD_BRUSHFLIP, "TAB or NUM 5 key" );
		m.addItem( "R. LEFT", CMD_BRUSHRCCW, "Q or NUM 4 key" );
		m.addItem( "R. RIGHT", CMD_BRUSHRCW, "W or NUM 6 key" );
		m.addItem( "BIGGER", CMD_BRUSHINC, "A or NUM 8 key" );
		m.addItem( "SMALLER", CMD_BRUSHDEC, "S or NUM 2 key" );

		osd.createHotkey( Input.RCDIK_TAB, Input.KEY, CMD_BRUSHFLIP, this );
		osd.createHotkey( Input.RCDIK_Q, Input.KEY, CMD_BRUSHRCCW, this );
		osd.createHotkey( Input.RCDIK_W, Input.KEY, CMD_BRUSHRCW, this );
		osd.createHotkey( Input.RCDIK_A, Input.KEY, CMD_BRUSHINC, this );
		osd.createHotkey( Input.RCDIK_S, Input.KEY, CMD_BRUSHDEC, this );

		osd.createHotkey( Input.RCDIK_NUMPAD4, Input.KEY, CMD_BRUSHRCCW, this );
		osd.createHotkey( Input.RCDIK_NUMPAD6, Input.KEY, CMD_BRUSHRCW, this );
		osd.createHotkey( Input.RCDIK_NUMPAD8, Input.KEY, CMD_BRUSHINC, this );
		osd.createHotkey( Input.RCDIK_NUMPAD2, Input.KEY, CMD_BRUSHDEC, this );
		osd.createHotkey( Input.RCDIK_NUMPAD5, Input.KEY, CMD_BRUSHFLIP, this );	

		osd.hideGroup( brushGroup = osd.endGroup() );

		m = osd.createMenu( buttonStyle, -1.0, 0.45, 0 );
		m.addItem( "BIGGER", CMD_BRUSHINC, "A or NUM 8 key" );
		m.addItem( "SMALLER", CMD_BRUSHDEC, "S or NUM 2 key" );

		osd.createHotkey( Input.RCDIK_A, Input.KEY, CMD_BRUSHINC, this );
		osd.createHotkey( Input.RCDIK_S, Input.KEY, CMD_BRUSHDEC, this );

		osd.createHotkey( Input.RCDIK_NUMPAD8, Input.KEY, CMD_BRUSHINC, this );
		osd.createHotkey( Input.RCDIK_NUMPAD2, Input.KEY, CMD_BRUSHDEC, this );

		osd.hideGroup( sprayGroup = osd.endGroup() );

		osd.createRectangle( -0.8, 0.25, 0.4, 0.7, -1, new ResourceRef(MW_Mod:0x0034r) );//frame ptx
		copy_prev = osd.createRectangle( -0.8, 0.16, 0.35, 0.45, 0, new ResourceRef(Frontend:0x013Cr) );//empty ptx

		buttonStyle = new Style( 0.2, 0.09, Frontend.largeFont, Text.ALIGN_CENTER, null );
		m = osd.createMenu( buttonStyle, -0.8, 0.45, 0 );
		copy_button = m.addItem( "COPY", CMD_C_COPY );
		paint_button = m.addItem( "PAINT", CMD_C_PAINT );

		osd.hideGroup( copyGroup = osd.endGroup() );

		//se bug workaround, fix it! (test with new carrer)
		Part dummy = new Part();

		//paint cans
		paintCans = new PaintInventory( player, PARTS_VP_LEFT, PARTS_VP_TOP, PARTS_VP_WIDTH, PARTS_VP_HEIGHT );

		paintCans.addItem( new PaintCan(  0xF5F5F5, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xB9B9B9, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x7F7F7F, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x505050, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x1D1D1D, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xDC191A, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xAE1515, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x800F0F, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x530A0A, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x250505, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xF58E08, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xC67308, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x8F5306, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x5F3704, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x251501, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xECC613, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xC0A10F, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x91790B, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x615109, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x312904, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xDDE912, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xB7C10E, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x8D950A, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x646A07, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x2E3103, 1.0 ) );

		paintCans.addItem( new PaintCan(  0x23E80E, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x1BB70D, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x158A09, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x0E5B06, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x083303, 1.0 ) );

		paintCans.addItem( new PaintCan(  0x12E9C3, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x0EBFA0, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x0A8F78, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x065B4C, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x033028, 1.0 ) );

		paintCans.addItem( new PaintCan(  0x0F3EED, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x0D32BC, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x0A2791, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x071B65, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x020B2E, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xAA0CEB, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x8F0AC6, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x690892, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x44055F, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x20022D, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xEF9DD9, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xCC59AD, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xA32D83, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x77165D, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x470836, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xBAC7E1, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x92A2B1, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x6B7680, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x464D54, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x1F2225, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xEEB70E, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xB7E77E, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xB3E6D2, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xABA685, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x97AF97, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xEEB621, 1.0 ) ); // OLD COLORS
		paintCans.addItem( new PaintCan(  0xE3E3E3, 1.0 ) );
		paintCans.addItem( new PaintCan(  0xD30C0C, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x740404, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x3A0A3C, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xE78B06, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x215504, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x8F8F8F, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x505050, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x1F1F1F, 1.0 ) );

		paintCans.addItem( new PaintCan(  0xCA730D, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x10B5D7, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x004F60, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x5B2D08, 1.0 ) );
		paintCans.addItem( new PaintCan(  0x041C5B, 1.0 ) );

	}


	public void show()
	{
		if( player.decals.size() <= showDecals )
			showDecals = 0;

		if( flags & PF_REDUCED_FUNCTIONALITY )
		{
			red0.disable();
			red1.disable();

			lastPaintMode = MODE_PAINTPART;
		}
		else
		{
			red0.enable();
			red1.enable();
		}


		osd.showGroup(osdGroup);
		changeMode( lastPaintMode );

		paintCans.paintColor = paintCans.getCanbyIndex( paintCans.lastCanId ).color;

		Input.cursor.addHandler(this);	//kivancsiak vagyunk ra, mit csinal az eger
		setEventMask( EVENT_CURSOR );

		if( handleControls )
		{
			Input.cursor.setPointer( Frontend.pointers, "D");
			Input.cursor.enable(1);
			Input.getAxis (1, -1);
			css = player.controller.reset();
			player.controller.activateState(ControlSet.CAMTURNSET);
		}
	}


	public void hide()
	{
		clearEventMask( EVENT_ANY );
		Input.cursor.remHandler(this);

	
		if( handleControls )
		{
			Input.cursor.setPointer( Frontend.pointers, "J");
			Input.cursor.enable(0);
			player.controller.reset(css);
		}

		changeMode(MODE_NONE);
		osd.hideGroup(osdGroup);

		infoline.changeText( null );
	}

	public void changeMode( int newMode )
	{
		if( mode != newMode )
		{
			if( mode == MODE_PAINTCOLOR )
			{
				paintCans.hide();
				osd.hideGroup( paintGroup );
				osd.hideGroup( colorsGroup );
				osd.hideGroup( sprayGroup );
				lastPaintMode=mode;
			}
			else
			if( mode == MODE_PAINTPART )
			{
				paintCans.hide();
				osd.hideGroup( paintGroup );
				osd.hideGroup( colorsGroup );
				lastPaintMode=mode;
			}
			else
			if( mode == MODE_PAINTDECAL )
			{
				clearDecalButtons();
				osd.hideGroup( paintGroup );
				osd.hideGroup( decalsGroup );
				osd.hideGroup( brushGroup );
				lastPaintMode=mode;
			}
			else
			if( mode == MODE_COPY )
			{
				osd.hideGroup( copyGroup );
				lastPaintMode=mode;
			}


			mode=newMode;

			//-----------mode ONs
			if( mode == MODE_PAINTCOLOR )
			{
				paintCans.show();
				invLineTxt.changeText( Integer.toString( paintCans.currentLine()+1 ) );
				osd.showGroup( paintGroup );
				osd.showGroup( colorsGroup );
				osd.showGroup( sprayGroup );

				paintBrush=PAINTBRUSH;
			}
			else
			if( mode == MODE_PAINTPART )
			{
				paintCans.show();
				invLineTxt.changeText( Integer.toString( paintCans.currentLine()+1 ) );
				osd.showGroup( paintGroup );
				osd.showGroup( colorsGroup );
			}
			else
			if( mode == MODE_PAINTDECAL )
			{
				setDecalButtons();

				if( !player.decals.isEmpty() )
				{
					paintBrush=player.decals.elementAt( showDecals );
				}
				else
					paintBrush=null;

				osd.showGroup( paintGroup );
				osd.showGroup( decalsGroup );
				osd.showGroup( brushGroup );
			}
			else
			if( mode == MODE_COPY )
			{
				osd.showGroup( paintGroup );
				osd.showGroup( copyGroup );

				if( copy_texture )
					copy_prev.changeTexture( new ResourceRef(copy_texture) );	
				else
					copy_prev.changeTexture( new ResourceRef(Frontend:0x013Cr) );

				Input.cursor.setPointer( Frontend.pointers, "J");
				copy_status = 0;// copy
				copy_button.disable();
				copy_button.label.txt.changeColor( 0xFFFFCB00 );
				paint_button.enable();
			}
		}
	}

	native void doPaint( GameRef cursor, int color, int brush, int temp, float rot, float size, int flip );
	native void paintPart( GameRef cursor, int color );
	native void xPaint( GameRef part );

	public void beginPaint( int cursor_id )
	{
		paintCursor=new GameRef( cursor_id );
		enableControlHook();
	}

	public void endPaint()
	{
		disableControlHook();
		paintCursor=null;
	}

	public void setDecalButtons()
	{
		int	max = player.decals.size();

		clearDecalButtons();

		for( int i=0; i<decalButtons.length; i++ )
		{
			//a gomb tipus (kicsi)
			RenderRef	base = new RenderRef( misc.garage:0x0083r );
	
			if( max > showDecals+i )
			{
				//duplikaljuk a tipust, hogy a texturamodositas egyedi legyen
				decalButtonTypes[i] = new RenderRef();
				decalButtonTypes[i].duplicate( base );

				ResourceRef baseTex = new ResourceRef(misc.garage:0x0103r);//a gomb tipus default texturaja
				ResourceRef rr = player.decals.elementAt( showDecals+i ); //az uj textura
				//lecsereljuk!
				decalButtonTypes[i].changeResource( baseTex, rr );
				decalButtonTextures[i] = rr;

				decalButtonInstances[i] = new RenderRef(decalButtons[i], decalButtonTypes[i].id(), "decal button");
				decalButtons[i].queueEvent( null, GameType.EVENT_COMMAND, "render " + decalButtonInstances[i].id() );
			}
			else
			{
				decalButtonTypes[i] = null;//base;
			}

		}

		invLineTxt.changeText( Integer.toString( (showDecals+1)/decalButtons.length+1 ) );
	}

	public void clearDecalButtons()
	{
		for( int i=0; i<decalButtons.length; i++ )
		{
			if( decalButtonInstances[i] )
			{
				decalButtonInstances[i].destroy();
				decalButtonInstances[i]=null;
			}
			if( decalButtonTypes[i] )
			{
				decalButtonTypes[i].destroy();
				decalButtonTypes[i]=null;
			}
			if( decalButtonTextures[i] )
			{
				decalButtonTextures[i].unload();
				decalButtonTextures[i] = null;
			}
		}
	}


		
	public void handleEvent( GameRef obj_ref, int event, String param )
	{
		int	tok = -1;

		if( event == EVENT_CURSOR )
		{
			int	ec = param.token( ++tok ).intValue();

			int	cursor_id = param.token( ++tok ).intValue();

			if (ec == GameType.EC_LCLICK)
			{
				int	obj_id = param.token( ++tok ).intValue();	//ignored now
				Vector3 obj_pos = new Vector3(param.token( ++tok ).floatValue(),
											  param.token( ++tok ).floatValue(),
											  param.token( ++tok ).floatValue());
				Vector3 worldpos = new Vector3(param.token( ++tok ).floatValue(),
											  param.token( ++tok ).floatValue(),
											  param.token( ++tok ).floatValue());
				GameRef dest = obj_ref;
				int cat = dest.getInfo(GameType.GII_CATEGORY);

				if (mode==MODE_PAINTPART )
				{	
					if( cat == GIR_CAT_PART || cat == GIR_CAT_VEHICLE )
					{
						SfxSPRAY.play(worldpos, 0.0, 1.0, 1.0, 0); 
						paintPart( new GameRef( cursor_id ), paintCans.paintColor|0xFF000000 );
					}
				}
				else
				if (mode==MODE_PAINTDECAL)
				{	
					if( cat == GIR_CAT_PART || cat == GIR_CAT_VEHICLE )
					{
						if( paintBrush )
						{
							SfxDECAL.play(worldpos, 0.0, 1.0, 1.0, 0); 
							doPaint( new GameRef( cursor_id), brushColor, paintBrush.id(), 0, decalRotation, decalSize, decalFlip );

							//itt biztos hogy Decal tipusu, es a player.decals-ban van
							if( !(-- ((Decal)paintBrush).stickies ) )
							{
								player.decals.removeElement( paintBrush );
								paintBrush=null;

								int	max = player.decals.size();	//kiurult sor?
								if( showDecals >= decalButtons.length && showDecals >= max)
									showDecals-=decalButtons.length;
						
								setDecalButtons();
								infoline.changeText( null );
							}
							else
							{
								infoline.changeText( ((Decal)paintBrush).stickies + " stickies left" );	//mirrored!
							}
						}
					}
				}
				else
				if( mode == MODE_COPY )
				{
					if( copy_status == 0)// Copy
					{
						Object part = obj_ref.getScriptInstance();
						if( part instanceof Part || part instanceof Chassis ) // clicked object is part or chassis
						{
							copy_texture = part.getTexture();
							
							if( copy_texture )
								copy_prev.changeTexture( new ResourceRef(copy_texture) );	
							else
							{
								SfxWARN.play();
								copy_prev.changeTexture( new ResourceRef(Frontend:0x013Cr) );
								
							}

							//infoline.changeText(copy_texture); //Debug
						}
					}
					else // Paint
					{
						Object part = obj_ref.getScriptInstance();
						if( part instanceof Part || part instanceof Chassis ) // clicked object is part or chassis
						{
							int tmp_texture = part.getTexture();// check is this part paintable
							
							if( copy_texture && tmp_texture )
							{
								SfxDECAL.play(worldpos, 0.0, 1.0, 1.0, 0);

								ResourceRef temp_texture = new ResourceRef();
								temp_texture.duplicate(new ResourceRef(copy_texture));

								part.setTexture( temp_texture.id() );

							}
							else
								SfxWARN.play();
						}
					}
				}
			}
			else
			if (ec == GameType.EC_LDOWN)
			{
				if( overVehicle )
				{
					if (mode==MODE_PAINTCOLOR)
					{
						Vector3 worldpos = Input.cursor.getPickedPos();
						spraySfxID = SfxSPRAY.play( worldpos, 0.0, 1.0, 1.0, SfxRef.SFX_LOOP | SfxRef.SFX_NOAUTOSTOP, Input.cursor.id() );  //start looped sfx
						spraySfxOn=1;
						beginPaint( cursor_id );
					}
				}
			} 
			else
			if (ec == GameType.EC_LUP)
			{
				if (mode==MODE_PAINTCOLOR)
				{
					if( spraySfxOn )
					{
						SfxSPRAY.stop( spraySfxID );  //end looped sfx
						spraySfxOn=0;
					}
					endPaint();
				}
			}
			else
			if (ec == GameType.EC_HOVER)
			{
				GameRef part, dest = new GameRef(param.token( ++tok ).intValue());
				int		objectChanged;

				Object p = dest.getScriptInstance();
				if( p instanceof Part )
				{
					if( !overVehicle )
					{
						overVehicle=1;
						objectChanged=1;
					}
				}
				else
				{
					if( overVehicle )
					{
						overVehicle=0;
						objectChanged=1;
					}
				}

				if (mode==MODE_PAINTDECAL)
				{
					if( objectChanged )
					{
						if( overVehicle )
						{
							beginPaint( cursor_id );
						}
						else
						{
							endPaint();
							//flush texture
							if( player.car )
								xPaint( player.car );
						}
					}
				}
			}
			else
			if (ec == GameType.EC_RDRAGBEGIN)
			{
				//enable camera control with mouse
				//player.controller.user_Add( Input.AXIS_LOOK_UPDOWN,	ControlSet.MOUSE, 1,	-1.0f, 1.0f, -1.0f, 1.0f);
				//player.controller.user_Add( Input.AXIS_LOOK_LEFTRIGHT,	ControlSet.MOUSE, 0,	-1.0f, 1.0f, -1.0f, 1.0f);
				//disable cursor movement
				player.controller.user_Del( Input.AXIS_CURSOR_X,	ControlSet.MOUSE, 0 );
				player.controller.user_Del( Input.AXIS_CURSOR_Y,	ControlSet.MOUSE, 1 );
				Input.cursor.cursor.queueEvent(  null, GameType.EVENT_COMMAND, "lock" );
			} 
			else
			if (ec == GameType.EC_RDRAGEND)
			{
				//disable camera control with mouse
				//player.controller.user_Del( Input.AXIS_LOOK_UPDOWN,	ControlSet.MOUSE, 1 );
				//player.controller.user_Del( Input.AXIS_LOOK_LEFTRIGHT,	ControlSet.MOUSE, 0 );
				//enable cursor movement
				player.controller.user_Add( Input.AXIS_CURSOR_X,	ControlSet.MOUSE, 0,	-1.0f, 1.0f, -1.0f, 1.0f);
				player.controller.user_Add( Input.AXIS_CURSOR_Y,	ControlSet.MOUSE, 1,	-1.0f, 1.0f, -1.0f, 1.0f);
				Input.cursor.cursor.queueEvent(  null, GameType.EVENT_COMMAND, "unlock" );
			} 

		}
	}


	public void control( float t )
	{
		if( mode == MODE_PAINTDECAL )
		{
			if( paintBrush )
				doPaint( paintCursor, brushColor, paintBrush.id(), 1, decalRotation, decalSize, decalFlip);
		}
		else
		if( mode == MODE_PAINTCOLOR )
		{
			Vector3 worldpos = Input.cursor.getPickedPos();
			spraySfxID = SfxSPRAY.play( worldpos, 0.0, 1.0, 1.0, SfxRef.SFX_LOOP | SfxRef.SFX_NOAUTOSTOP, Input.cursor.id() );  //update looped sfx

			doPaint( paintCursor, paintCans.paintColor|0x66000000, paintBrush.id(), 0, decalRotation, decalSize, decalFlip);
		}
	}

	public void osdCommand( int cmd )
	{
		if( cmd == CMD_LOADSKIN )
		{
				VehicleSkinFileReqDialog d = new VehicleSkinFileReqDialog( player.controller, Dialog.DF_FREEZE|Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "LOAD PAINT JOB", "LOAD", GameLogic.skinSaveDir, "*" );

				if( d.display() == 0 )
				{
					String filename = GameLogic.skinSaveDir + d.fileName;
					player.car.loadSkin( filename );
				}
		}
		else
		if( cmd == CMD_SAVESKIN )
		{
			VehicleSkinFileReqDialog d = new VehicleSkinFileReqDialog( player.controller, Dialog.DF_FREEZE|Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.FRF_SAVE, "SAVE PAINT JOB", "SAVE", GameLogic.skinSaveDir, "*" );

			if( d.display() == 0 )
			{
				String filename = GameLogic.skinSaveDir + d.fileName;
				if (File.exists(filename))
				{
					File.delete( filename );
					File.delete( filename + ".*" );
				}

				player.car.saveSkin( filename );

				new WarningDialog( player.controller, Dialog.DF_FREEZE|Dialog.DF_MODAL|Dialog.DF_DEFAULTBG, "SAVE PAINT JOB", "Paint job has been saved." ).display();
			}

		}
		else
		if( cmd == CMD_SCROLL_UP )
		{
			if( mode == MODE_PAINTCOLOR || mode == MODE_PAINTPART )
			{
				paintCans.upScroll();
				invLineTxt.changeText( Integer.toString( paintCans.currentLine()+1 ) );
			}
			else
			if( mode == MODE_PAINTDECAL )
			{
				int	max = player.decals.size();
				if( max > decalButtons.length )
				{
					if( showDecals >= decalButtons.length )
					{
						showDecals-=decalButtons.length;
					}
					else
					{
						showDecals=(max-1)-((max-1)%decalButtons.length);
					}
					setDecalButtons();
				}
			}
		}
		else
		if( cmd == CMD_SCROLL_DOWN )
		{
			if( mode == MODE_PAINTCOLOR || mode == MODE_PAINTPART )
			{
				paintCans.downScroll();
				invLineTxt.changeText( Integer.toString( paintCans.currentLine()+1 ) );
			}
			else
			if( mode == MODE_PAINTDECAL )
			{
				int	max = player.decals.size();
				if( max > decalButtons.length )
				{
					if( showDecals+decalButtons.length < max )
					{
						showDecals+=decalButtons.length;
					}
					else
					{
						showDecals=0;
					}
					setDecalButtons();
				}
			}
		}
		else
		if( cmd == CMD_C_COPY )
		{
			copy_button.disable();
			copy_button.label.txt.changeColor( 0xFFFFCB00 );
			paint_button.enable();

			copy_status = 0;
			Input.cursor.setPointer( Frontend.pointers, "J"); //Default arrow
		}
		else
		if( cmd == CMD_C_PAINT )
		{
			copy_button.enable();
			paint_button.disable();
			paint_button.label.txt.changeColor( 0xFFFFCB00 );

			copy_status = 1;
			Input.cursor.setPointer( Frontend.pointers, "D"); // spray
		}
		else
		if( cmd == CMD_COPYSKIN )
		{
			changeMode( MODE_COPY );
		}
		if( cmd == CMD_SPRAY )
		{
			changeMode( MODE_PAINTCOLOR );
		}
		else
		if( cmd == CMD_PART )
		{
			changeMode( MODE_PAINTPART );
		}
		else
		if( cmd == CMD_DECALS )
		{
			changeMode( MODE_PAINTDECAL );
		}
		else
		if( cmd == CMD_BRUSHRCCW )
		{
			decalRotation -= 0.025;
		}
		else
		if( cmd == CMD_BRUSHRCW )
		{
			decalRotation += 0.025;
		}
		else
		if( cmd == CMD_BRUSHINC )
		{
			if( decalSize < 4.2 )
				decalSize+= 0.025;
		}
		else
		if( cmd == CMD_BRUSHDEC )
		{
			if( decalSize > 0.05 )
				decalSize-= 0.025;
		}
		else
		if( cmd == CMD_BRUSHFLIP )
		{
			decalFlip=1-decalFlip;
		}
		else
		if( cmd >= CMD_DECALBUTTONS && cmd <= CMD_DECALBUTTONS + decalButtons.length )
		{
			int	decalIndex = showDecals+cmd-CMD_DECALBUTTONS;
			if( player.decals.size() > decalIndex )
			{
				paintBrush=player.decals.elementAt( decalIndex );
				infoline.changeText( ((Decal)paintBrush).stickies + " stickies left" );	//mirrored!
			}
		}
	}
}

class PaintInventory extends VisualInventory
{
	int	paintColor;
	int	lastCanId;

	public PaintInventory( Player player, float left, float top, float width, float height )
	{
		super( player, left, top, width, height, 1 );
	//	super( player );

	//	initVisuals( left, top, width, height );
	}

//	public void leftClick( int id  )
//	{
//		if( id >= items.size() )	//sohasem legyen ures!!
//			id = items.size()-1;
//		
//		lastCanId=id;
//
//		PaintCan pc = getCanbyIndex( id );
//		paintColor = pc.color;
//
//		new SfxRef( Frontend.SFX_MENU_SELECT ).play(); 
//	}

//	public void leftDragNDrop( GameRef draggedOnto,	GameRef draggedItem )
//	{
//	}

	public void panelLeftClick( int index  )
	{
		index += currentLine()*partsPerLine;

		if( index < items.size() )	//sohasem legyen ures!!
		{		
			lastCanId=index;

			PaintCan pc = getCanbyIndex( index );
			paintColor = pc.color;

			new SfxRef( Frontend.SFX_MENU_SELECT ).play();
		}
	}

	public void panelSwap( int index_a, Gadget dropped )
	{
	}

	public void panelDragNDrop( int index, GameRef dropped )
	{
	}



	public int addItem( PaintCan p )
	{
		if( !items.size() )
			paintColor=p.color;

		return super.addItem( p );
	}
}

//
class VehicleSkinFileReqDialog extends FileRequesterDialog
{
	public VehicleSkinFileReqDialog( Controller ctrl, int myflags, String mytitle, String OKButtonText, String path, String mask )
	{
		super( ctrl, myflags, mytitle, OKButtonText, path, mask );
	}

	public int validator( String filename )
	{
		return Vehicle.fileCheck_Skin( filename );
	}
}
