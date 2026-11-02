package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;
import java.render.osd.dialog.*; //Dialog Window

import java.game.parts.*;
import java.game.parts.enginepart.*;

public class MP1_Drift_Track extends Track
{	
	final static String MapName = "MP1 Drift Track";
	final static String MapDescription = "\n Second official addon track for Redline. \n  Author say about it: \n \n 'It's finished in 33%' \n and \n 'I created it only for study how it working' \n \n but he no made any track more.";
	final static String MapAuthor = "Author: Dave_69";
	final static ResourceRef MapImage = new ResourceRef(MW_Mod:0x0049r);
	final static float	TS_Version = 1.0;

	public MP1_Drift_Track()
	{
		posStart = new Vector3( -215.0, -0.36, 165.0 );
		oriStart = new Ypr( -1.0, 0.0, 0.0 );

		map = new GroundRef( Maps.MP1:0x00000001r );
	}

	public void StartMap()
	{
		GameLogic.changeActiveSection( new MP1_Drift_Track() );
	}

	public void enter( GameState prev_state )
	{
		Frontend.loadingScreen.show();
		GfxEngine.flush();

		super.enter( prev_state );
	}

	public void exit( GameState next_state )
	{
		super.exit( next_state );
	}
}


