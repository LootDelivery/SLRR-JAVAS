package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;

public class SplashScreen extends GameType implements GameState
{
	Osd				osd;
	ResourceRef		pic;

	public SplashScreen( ResourceRef pic )
	{
		createNativeInstance();
		this.pic = pic;
	}

	public void enter( GameState prevState )
	{
		osd=new Osd();
		osd.createBG( pic );
		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL|Osd.HK_STATIC, Input.AXIS_CANCEL, this );
		osd.show();

		setEventMask( EVENT_TIME );

		addTimer( 3, 1 );
	}

    public void handleEvent( GameRef obj_ref, int event, int param )
    {
		osdCommand( Input.AXIS_CANCEL );
	}

	public void exit( GameState nextState )
	{
		clearEventMask( EVENT_ANY );
		osd.hide();
	}

	public void osdCommand( int cmd )
	{
		if( cmd == Input.AXIS_CANCEL )
			GameLogic.changeActiveSection( new MainMenu() );
	}
}
