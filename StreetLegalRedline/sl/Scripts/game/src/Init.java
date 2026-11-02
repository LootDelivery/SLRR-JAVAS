package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;

public class Init extends GameType
{
	GameLogic	gameLogic;

	public Init( int obsolete_id )
	{
		Sound.init();

		Frontend.init();
		Frontend.loadingScreen.show();

		Input.initControllers( this, "save/controls/active_control_set" );
		Input.enablePointingDevice();
	
		gameLogic = new GameLogic();
	}

	public void finalize()
	{
		gameLogic.finalize();

		Input.disablePointingDevice();
		Input.destroyControllers();
		Frontend.destroy();

		super.finalize();
	}
}