package java.render;

import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Text
{
	final static int RID_CONSOLE5		= frontend:0x000000B2r;
	final static int RID_CONSOLE10		= frontend:0x00000023r;
	final static int RID_SL28			= frontend:0x0000002Er;
	final static int RID_SLII11			= frontend:0x00000138r;
	final static int RID_SLII17			= frontend:0x00000139r;
	final static int RID_SLII24			= frontend:0x00000025r;
	final static int RID_SL14			= frontend:0x0000008Cr;
	final static int RID_SIMPLE20		= frontend:0x00000020r;
	final static int RID_SIMPLE40		= frontend:0x00000022r;

	final static int RID_SYM_POINTERS	= frontend:0x0000003cr;

	//final mirrored from "c3DLow_public.h",  'enum TextAlign'
	final static int ALIGN_LEFT = 2;
	final static int ALIGN_CENTER = 1;
	final static int ALIGN_RIGHT = 0;

	final static int DEF_COLOR = 0xFFFFFFFF;

	String		text;
	RenderRef	renderinst = new RenderRef();

	//absolute position
	public Text( ResourceRef parent, ResourceRef charset, String text_, float x, float z )
	{
		create( parent, charset, x, z );
		changeText( text_ );
	}

	//abs pos,with line offset
	public Text( ResourceRef parent, ResourceRef charset_ref, String text_, float x, float z, int line, Viewport vp )
	{
		this( parent, charset_ref, text_, x, z+line*2*( (1.2*getFontSize( charset_ref ))/(Config.video_y*vp.getHeight()) ) );
	}

	//big petch ahogy mukodik!!!! ki tud jobbat?
	public static int getFontSize( ResourceRef charset_ref )
	{
		int			font_size;

		if( charset_ref.id() == RID_SLII24 )
			font_size=24;
		else
		if( charset_ref.id() == RID_SLII17 )
			font_size=15;
		else
		if( charset_ref.id() == RID_SLII11 )
			font_size=10;
		else
		if( charset_ref.id() == RID_SIMPLE40 )
			font_size=40;
		else
		if( charset_ref.id() == RID_SIMPLE20 )
			font_size=20;
		else
		if( charset_ref.id() == RID_SL14 )
			font_size=14;
		else
		if( charset_ref.id() == RID_SL28 )
			font_size=28;
		else
		if( charset_ref.id() == RID_CONSOLE10 )
			font_size=10;
		else
		if( charset_ref.id() == RID_CONSOLE5 )
			font_size=7;
		else
			font_size=20;


		return font_size;
	}

	public native void create( ResourceRef parent, ResourceRef charset, float x, float z );
	public void finalize()
	{
		//a native create allitja be ezt az adattagot
		renderinst.destroy();
	}

	public native void changeColor( int color );
	public native void changeAlign( int align );
	public native void setPos( float x, float z );
	public native Vector3 getPos();
	public native void update();

	public void changeText( String text_ )
	{
		text=text_;
		update();
	}

	public static float getHeight( ResourceRef font, Viewport vp )
	{
		return 2*getFontSize( font )/(Config.video_y*vp.getHeight());
	}
	public static float getWidth( String str, ResourceRef font, Viewport vp )
	{
		return 2*getWidthPixels( str, font )/(Config.video_x*vp.getWidth());
	}
	public static native float getWidthPixels( String str, ResourceRef font );
}

