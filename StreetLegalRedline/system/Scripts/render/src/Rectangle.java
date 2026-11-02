package java.render;

import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Rectangle
{
	RectangleTemplate	rt;
	RenderRef			ins;
	Vector3				pos;
	Ypr					ori;
	ResourceRef			root;

	public Rectangle( ResourceRef r, Vector3 p, RectangleTemplate tmpl )
	{
		rt = tmpl;
		pos = p;
		root = r;

		//create the instance
		ins = new RenderRef( r, rt.dub, "Rectangle" );
		ins.setMatrix(  pos, ori );
	}

	public void changeTexture( ResourceRef newTexture )
	{
		ins.destroy();

		if( newTexture == null )
			newTexture = RectangleTemplate.defTexture;

		RectangleTemplate rt2 = new RectangleTemplate( rt.width, rt.height, newTexture );
		rt = rt2;

		ins = new RenderRef( root, rt.dub, "Rectangle" );
		ins.setMatrix( pos, ori );
	}

	public void finalize()
	{
		ins.destroy();
	}

	public void setPos( Vector3 p )
	{
		pos = p;
		ins.setMatrix( pos, ori );
	}

	public void setOri( Ypr o )
	{
		ori = o;
		ins.setMatrix( pos, ori );
	}
}
