package java.render;

import java.io.*;
import java.util.*;
import java.util.resource.*;

public class RectangleTemplate
{
	RenderRef dub = new RenderRef();
	ResourceRef newMsh = new RenderRef();
	float	width, height;

	final static RenderRef defType = new RenderRef( frontend:0x00D7r );
	final static ResourceRef defTexture = new ResourceRef( frontend:0x00AFr );
	final static ResourceRef defMesh = new ResourceRef(frontend:0x00D9r);

	public RectangleTemplate( float w, float h, ResourceRef texture )
	{
		width = w;
		height = h;

		if( texture && texture != Osd.RRT_NONE )
		{
			//etalon solid alpha textured negyzet tipus
			RenderRef	base = defType;

			//duplikaljuk a tipust, hogy a modositasok erintetlenul hagyjak
			dub.duplicate( base );

			//textura:
			ResourceRef baseTex = defTexture;

			//csere!
			dub.changeResource( baseTex, texture );

			//mesh:
			ResourceRef baseMsh = defMesh;
			newMsh.duplicate( baseMsh );
			newMsh.scaleMesh( w, h, 1.0 );

			//csere
			dub.changeResource( baseMsh, newMsh );
		}

	}

	public void finalize()
	{
		newMsh.destroy();
		dub.destroy();
	}
}
