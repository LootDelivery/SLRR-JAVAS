package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;

public class Navigator
{
	final static int lda; 

	final static float DEF_ZOOM = 4.5;	//tavolsag a terkep plane-tol


	Viewport		vp;
	Dummy			localroot;
	Camera			cam;
	RenderRef[]		tiles;		//ground tile, instances
	RenderRef[]		tiletypes;	//ground tiles, types
	RenderRef		route;		//instance
	
	ResourceRef[]	meshes;		//duplicated meshes and types
	GameRef			button;

	RenderRef		rmCamera;
	GameRef			gmCamera;
	Marker			dmCamera;

	Vector			marker = new Vector();	//markers for static objects: known shops,garages, etc.
	Vector			dynamarker = new Vector();	//markers for dynamic object: player/opponent car, etc..

	float			vp_l=0.01, vp_t=0.75, vp_w=0.21, vp_h=0.23;
	float			zoom=DEF_ZOOM;
	float			offsetX, offsetZ;

	float			top, left, size;	//szukseg van ra majd az utvonalkijeloleshez
	int				mode;

//a render resourceid-k sorfolytonosan legyenek letarolva!
	public Navigator( float left, float top, float size, int ridtype, int ridmsh, int ridtex, int x, int z, int modulo )
	{
		localroot = new Dummy( GameRef.WORLDTREEROOT );

		RenderRef	base = new RenderRef( ridtype );
		ResourceRef baseTex = new ResourceRef(ridtex);//def texture
		ResourceRef baseMsh = new ResourceRef(ridmsh);//def mesh

		int	numTiles=x*z;

		tiles=new RenderRef[numTiles];
		tiletypes=new RenderRef[numTiles];

		meshes=new ResourceRef[numTiles];

		this.top=top;
		this.left=left;
		this.size=size;

		int	xi, zi;
		float offset_x=left, offset_z=top;

		rmCamera = new RenderRef( localroot, MW_Mod:0x0104r, "Camera GPS Marker" );// Camera picture
		gmCamera = new GameRef( localroot, MW_Mod:0x0105r, "0", "Camera GPS Marker Base" );// Red point driver
		dmCamera = addMarker( new RenderRef(MW_Mod:0x0108r), gmCamera );// Red point

		for( int i=0; i<numTiles; i++ )
		{
			tiletypes[i] = new RenderRef();
			tiletypes[i].duplicate( base );
			tiletypes[i].changeResource( baseTex, new ResourceRef( ridtex ) );

			meshes[i] = new ResourceRef();
			meshes[i].duplicate( baseMsh );

			tiletypes[i].changeResource( baseMsh, meshes[i] );

			tiles[i]= new RenderRef( localroot, tiletypes[i], "navigator_segment");
			tiles[i].setMatrix( new Vector3(offset_x+xi*size, -0.001, offset_z+zi*size), null );
			ridtex++;

			if( ++xi >= x )
			{ 
				xi=0; zi++; 

				ridtex+=modulo;
			}
		}
	}


	public void finalize()
	{
		for( int i=0; i<tiletypes.length; i++ )
		{
			tiles[i].destroy();
			meshes[i].destroy();
			tiletypes[i].destroy();
		}
	}

	public void setInteractive()
	{
	}

	public void show()
	{
		if( !vp )
			vp = new Viewport( 12, vp_l, vp_t, vp_w, vp_h );

		//oc=0, planetest=1
		cam = new Camera( localroot, vp, 1, 90, 1.0, 100.0, 0.2, 2.0, 0, 1 );

		//updateNavigator() will set the camera's matrix, except it's height
		changeMode( Config.gpsMode );

		vp.activate( Viewport.RENDERFLAG_CLEARDEPTH | Viewport.RENDERFLAG_CLEARTARGET );
	}

	public void ViewMap()
	{
		if( vp )
			vp.destroy();
		
		if( cam)
			cam.destroy();

		vp = new Viewport( 5, 0, 0, 1, 1 );

		//oc=0, planetest=1
		cam = new Camera( localroot, vp, 1, 90, 1.0, 100.0, 0.2, 2.0, 0, 1 );

		//updateNavigator() will set the camera's matrix, except it's height
		changeMode( Config.gpsMode );

		vp.activate( Viewport.RENDERFLAG_CLEARDEPTH | Viewport.RENDERFLAG_CLEARTARGET );
	}

	public void hide()
	{
		cam.destroy(); cam=null;
		vp.destroy(); vp=null;
	}

	public void changeMode( int newMode )
	{
		mode = newMode;
		if( cam )
			cam.setMatrix( new Vector3(0.0, zoom, 0.0),  new Ypr(0.0, -1.57, 0.0) );
	}

	public void updateNavigator( GameRef car ){ updateNavigator( car, mode ); }
	public native void updateNavigator( GameRef car, int mode );


	public void changeSize( float l, float t, float w, float h )
	{
		vp_l=l; vp_t=t; vp_w=w; vp_h=h;

		if( vp )
			vp.resize( l, t, w, h );
	}

	public void changeZoom( float z )
	{
		zoom=z;

		if( cam )
			cam.setMatrix( new Vector3(0.0, zoom, 0.0),  new Ypr(0.0, -1.57, 0.0) );
	}

	public Marker addMarker( Racer rc )
	{
		RenderRef marker=rc.getMarker();
		GameRef car=rc.car;

		return addMarker( marker, car );
	}

	public Marker addMarker( RenderRef rtype, GameRef obj )	//creates dynamic marker
	{
		RenderRef sym = new RenderRef( localroot, rtype, "marker" );

		Marker m = new DMarker( sym, obj );
		dynamarker.addElement( m );

		return m;
	}

	public Marker addMarker( RenderRef rtype, Vector3 pos, int pri )	//creates static marker
	{
		RenderRef sym = new RenderRef( localroot, rtype, "marker" );
		Vector3 mypos = new Vector3( pos );

		//majd a klampelo elvegzi...
		//mypos.mul( 0.01 );
		mypos.y=pri/100.0+0.001f;
		//sym.setMatrix( mypos, null );


		Marker m = new SMarker( sym, mypos );
		marker.addElement( m );

		return m;
	}

	public void remMarker( Marker m )
	{
		if( m )
		{
			if( m instanceof DMarker )
			{	//dynamic!
				if( dynamarker )
				{
					dynamarker.removeElement( m );
					if( m.symbol )
						m.symbol.destroy();
				}
			}
			else
			{	//static
				if( marker )
				{
					marker.removeElement( m );
					if( m.symbol )
						m.symbol.destroy();
				}
			}
		}
	}
}

