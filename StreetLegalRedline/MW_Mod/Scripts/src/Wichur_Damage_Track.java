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

public class Wichur_Damage_Track extends Track
{	
	final static String MapName = "Damage Track";
	final static String MapDescription = "\n \n \n This map is included in Wichur's Maps Pack. \n \n Wichur's Map Pack is first official \n addon tracks for Redline.";
	final static String MapAuthor = "Author: Wichur";
	final static ResourceRef MapImage = new ResourceRef(MW_Mod:0x0050r);
	final static float	TS_Version = 1.0;

	public Wichur_Damage_Track()
	{
		posStart = new Vector3( 0.0, -2.12, 0.0 );
		oriStart = new Ypr( -1.0, 0.0, 0.0 );

		map = new GroundRef( Maps.DamageTrack:0x00000001r );
	}

	public void StartMap()
	{
		GameLogic.changeActiveSection( new Wichur_Damage_Track() );
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


