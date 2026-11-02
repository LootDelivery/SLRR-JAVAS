package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;
import java.render.osd.dialog.*;
import java.sound.*;

public class ClubInfo extends GameType implements GameState
{
	// resource ID constants
	final static int  RID_BG = frontend:0x009Fr; //, A0, A1

	GameState		parentState;

	Osd				osd;

	final static int  CMD_BACK = 0;
	final static int  CMD_DBG0 = 1;
	final static int  CMD_DBG1 = 2;
	final static int  CMD_DBG2 = 3;
	final static int  CMD_DBG3 = 4;
	final static int  CMD_DBG4 = 5;
	final static int  CMD_DBG5 = 6;
	final static int  CMD_INFO = 7;


	public ClubInfo()
	{
		createNativeInstance();
	}

	public void enter( GameState prevState )
	{
		if( !parentState )
			parentState=prevState;

		osd = new Osd();
		osd.globalHandler = this;

		createOSDObjects();
		osd.show();

		Input.cursor.enable(1);

		setEventMask( EVENT_CURSOR );
	}

	public void exit( GameState nextState )
	{
		clearEventMask( EVENT_ANY );
		Input.cursor.enable(0);
		osd.hide();
	}

	public void osdCommand( int cmd )
	{
		if( cmd == CMD_BACK )
		{
			GameLogic.changeActiveSection( parentState );
		}
		else
		if( cmd == CMD_INFO )
		{
			new WarningDialog( GameLogic.player.controller, Dialog.DF_MODAL|Dialog.DF_DEFAULTBG|Dialog.DF_WIDE, "ADDITIONAL INFO", 
				" \n Your name and position is marked RED. Club members marked YELLOW are ready to be challenged at daytime. \n The higher prestige you have, the more club members will like to race with you, day or night. Prestige grows as you won races and loose the police in a chase, but decreases if you loose a race or the police fines you. \n Night races affect your ranking besides your prestige but prepare, night race prizes are very high." ).display();
		}
		else
		if( cmd >= CMD_DBG0 && cmd <= CMD_DBG3 )
		{
			int player = GameLogic.findRacer(GameLogic.player);
			if( player < GameLogic.speedymen.length-1 )
			{
				if( cmd >= CMD_DBG2 )
				{	//day
					if( GameLogic.canChallenge( GameLogic.player, GameLogic.speedymen[player+1] ))
					{
						if( cmd == CMD_DBG2	)
							GameLogic.challenge( player, player+1, 0, 1, 0 );
						else
							GameLogic.challenge( player, player+1, 0, 0, 0 );
					}
				}
				else
				{	//night
					if( cmd == CMD_DBG0	)
						GameLogic.challenge( player, player+1, 0, 1, 1 );
					else
						GameLogic.challenge( player, player+1, 0, 0, 1 );
				}
				GameLogic.changeActiveSection( this );
			}
		}
	}


	public void createOSDObjects()
	{
		osd.createBG( new ResourceRef(RID_BG+GameLogic.player.club) );

		osd.createHeader( "CLUB INFORMATION" );
		osd.createText( GameLogic.CLUBNAMES[GameLogic.player.club],	Frontend.mediumFont, Text.ALIGN_RIGHT, 0.98, -0.98 );

		//menu background stripe
		osd.createRectangle( 1.32, -0.82, 1.2, 0.22, -1, new ResourceRef(frontend:0x0024r) );
		
		Style buttonStyle = new Style( 0.12, 0.12, Frontend.mediumFont, Text.ALIGN_RIGHT, null );
		Menu m = osd.createMenu( buttonStyle, 0.98, -0.82, 0, Osd.MD_HORIZONTAL );

		m.addItem( new ResourceRef( Osd.RID_BACK ), CMD_BACK, "GO BACK TO GARAGE" );
		m.addSeparator();
		m.addItem( new ResourceRef( frontend:0x0124r ), CMD_INFO, "ADDITIONAL INFO" );
		if( Config.majomParade )
		{
			m.addSeparator();
			m.addSeparator();
			m.addItem( new ResourceRef( Osd.RID_ARROWUP ), CMD_DBG0, "[CHEAT] NIGHT RACE NEXT OPPONENT (WIN)" );
			m.addItem( new ResourceRef( Osd.RID_ARROWUP ), CMD_DBG1, "[CHEAT] NIGHT RACE NEXT OPPONENT (LOOSE)" );
			m.addSeparator();
			m.addItem( new ResourceRef( Osd.RID_ARROWUP ), CMD_DBG2, "[CHEAT] DAY RACE NEXT OPPONENT (WIN)" );
			m.addItem( new ResourceRef( Osd.RID_ARROWUP ), CMD_DBG3, "[CHEAT] DAY RACE NEXT OPPONENT (LOOSE)" );
		}

		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL|Osd.HK_STATIC, CMD_BACK, this );

		int color;
		int base=GameLogic.player.club*GameLogic.CLUBMEMBERS;
		for( int i=0; i<GameLogic.CLUBMEMBERS; i++ )
		{
			if( GameLogic.speedymen[base+i] == GameLogic.player )
				color=0xFFFF5555;
			else
				if( GameLogic.canChallenge( GameLogic.player, GameLogic.speedymen[base+i] ))
					color=0xFFFFFF55;
				else
					color=0xFFFFFFFF;

			osd.createText( (GameLogic.CLUBMEMBERS-i) + ". ", Frontend.mediumFont, Text.ALIGN_RIGHT,					-0.80,  0.68-i*0.07).changeColor( color );
			osd.createText( GameLogic.speedymen[base+i].name, Frontend.mediumFont, Text.ALIGN_LEFT,						-0.80,  0.68-i*0.07).changeColor( color );

			int	prestige = GameLogic.speedymen[base+i].prestige*Racer.PRESTIGE_SCALE;
			osd.createText( "prestige: " + prestige, Frontend.mediumFont, Text.ALIGN_LEFT,	 0.05,  0.68-i*0.07).changeColor( color );
		}
	}	
}
