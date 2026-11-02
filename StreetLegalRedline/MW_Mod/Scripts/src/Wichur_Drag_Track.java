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

public class Wichur_Drag_Track extends Track
{	
	final static String MapName = "Drag Track";
	final static String MapDescription = "\n \n \n This map is included in Wichur's Maps Pack. \n \n Wichur's Map Pack is first official \n addon tracks for Redline.";
	final static String MapAuthor = "Author: Wichur";
	final static ResourceRef MapImage = new ResourceRef(MW_Mod:0x0052r);
	final static float	TS_Version = 1.0;

	public Wichur_Drag_Track()
	{
		posStart = new Vector3( 27.0, 0.65, -36.0 );
		oriStart = new Ypr( 1.8, 0.0, 0.0 );

		map = new GroundRef( Maps.DragTrack:0x00000001r );
	}

	public void StartMap()
	{
		GameLogic.changeActiveSection( new Wichur_Drag_Track() );
	}

	public void enter( GameState prev_state )
	{
		Frontend.loadingScreen.show();
		GfxEngine.flush();

		map.addWaterLimit(new Vector3(0.0,-0.100, 0.0), new Vector3(0.0,0.0,1.0));

		super.enter( prev_state );
		player.car.wakeUp();

		//refreshCamera(); // Dupa...
	}

	public void exit( GameState next_state )
	{
		super.exit( next_state );
	}
}


