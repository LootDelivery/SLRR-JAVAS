package java.render;

import java.render.*;
import java.util.resource.*;

public class Camera extends RenderRef
{
	final static float	DEF_AOV			= 90.0;
	final static float	DEF_DMIN		= 0.1;
	final static float	DEF_DMAX		= 100.0;
	final static float	DEF_LODBIAS		= 1.0;
	final static float	DEF_LODAMP		= 1.0;
	final static int	DEF_CULLING		= 1;
	final static int	DEF_PLANETEST	= 0;

	//release() may be used with this!
	public Camera( int id ){ super( id ); }


	public Camera( ResourceRef parent, Viewport vp, int pri ){ this( parent, vp, pri, DEF_AOV, DEF_DMIN, DEF_DMAX, DEF_LODBIAS, DEF_LODAMP, DEF_CULLING, DEF_PLANETEST); }
	public Camera( ResourceRef parent, Viewport vp, int pri, float aov, float dmin, float dmax ){ this( parent, vp, pri, aov, dmin, dmax, DEF_LODBIAS, DEF_LODAMP, DEF_CULLING, DEF_PLANETEST ); }

	public Camera( ResourceRef parent, Viewport vp, int pri, float aov, float dmin, float dmax, float lodBias, float lodAmp, int oc, int pt ){ super();  create( parent, vp, pri, aov*0.5, dmin, dmax, lodBias, lodAmp, oc, pt ); }

	//gc megszunteti:
	public void finalize()
	{ 
		destroy();
		super.finalize(); 
	}

	public native void create( ResourceRef parent, Viewport vp, int pri, float aov, float dmin, float dmax, float lodBias, float lodAmp, int oc, int pt );
	public native void destroy();

	public native void activate( Viewport vp, int pri );
	public native void deactivate( Viewport vp );
}
