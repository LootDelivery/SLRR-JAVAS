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

public class Wichur_Drift_Track extends Track
{	
	final static String MapName = "Drift Track";
	final static String MapDescription = "\n \n \n This map is included in Wichur's Maps Pack. \n \n Wichur's Map Pack is first official \n addon tracks for Redline.";
	final static String MapAuthor = "Author: Wichur";
	final static ResourceRef MapImage = new ResourceRef(MW_Mod:0x0051r);
	final static float	TS_Version = 1.0;

	public Wichur_Drift_Track()
	{
		posStart = new Vector3( 103.7, 10.4, -141.2 );
		oriStart = new Ypr( -0.4, 0.0, 0.0 );

		map = new GroundRef( Maps.DriftTrack:0x00000001r );
	}

	public void StartMap()
	{
		GameLogic.changeActiveSection( new Wichur_Drift_Track() );
	}

	public void enter( GameState prev_state )
	{
		Frontend.loadingScreen.show();
		GfxEngine.flush();

		map.addWaterLimit(new Vector3(0.0,-0.100, 0.0), new Vector3(0.0,0.0,1.0));

		super.enter( prev_state );
	}

	public void exit( GameState next_state )
	{
		super.exit( next_state );
	}
}


