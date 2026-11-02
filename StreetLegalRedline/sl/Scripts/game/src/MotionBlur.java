package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.render.osd.dialog.*;	//Text
import java.sound.*;

public class MotionBlur extends GameType
{
	Thread		Refresher;
	GameRef		Came;
	RenderRef	Skydo;

	public MotionBlur( GameRef camera, RenderRef sky )
	{
		createNativeInstance();

		Came = camera;
		Skydo = sky;

		Refresher = new Thread( this, "Refresher" );
		Refresher.start();
		Refresher.setPriority(10);
	}

	public void changeSky(RenderRef sky)
	{
		Skydo = sky;
	}

	public void changeCam(GameRef camera)
	{
		Came = camera;
	}

	public void run()
	{
		for(;;)
		{
			if( Came && Skydo )
			{
				Skydo.setMatrix( Came.getPos(), null );
			}
			Refresher.sleep(1);
		}
	}

	public void destroy()
	{
		Refresher.stop();
		Refresher = null;
	}
}
