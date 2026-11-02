package java.render.osd;

import java.render.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Menu
{
	Osd osd;
	Style sty, stySld, styKnob;
	float x, y, spacing;
	int	orientation;

	public Menu( Osd o, Style s, float x, float y, float spc )
	{
		this( o, s, x, y, spc, Osd.MD_VERTICAL );
	}

	public Menu( Osd o, Style s, float x, float y, float spc, int orientation )
	{
		osd = o;
		sty = s;
		spacing = spc;
		this.x = x;
		this.y = y;
		this.orientation = orientation;

		if( spacing == 0.0 )
			if( orientation == Osd.MD_VERTICAL )
				spacing = s.height;
			else
				spacing = s.width;
	}

	public void setStyle( Style s )
	{
		sty=s;
	}

	public void setSliderStyle( Style ss, Style sks )
	{
		stySld=ss;
		styKnob=sks;
	}

	//--------------------------------------------------------------

	public void nextLine()
	{
		addSeparator();
		addSeparator();
	}

	public void addSeparator()
	{
		if( orientation == Osd.MD_VERTICAL )
			y+=spacing/2/osd.vpHeight;
		else
			if( sty.align == Text.ALIGN_RIGHT ) 
				x-=spacing/2/osd.vpHeight;
			else
				x+=spacing/2/osd.vpHeight;
	}

	//piktogramm gomb:
	public Button addItem( ResourceRef gfx, int cmd, String tooltip )
	{
		Style sty2 = new Style( sty.width, sty.height, sty.charset, sty.align, gfx );
		Button b = osd.createButton( sty2, x, y, cmd, tooltip );
		nextLine();
		return b;
	}

	//szoveges gomb:
	public Button addItem( String text, int cmd )
	{
		Button b = osd.createButton( sty, x, y, text, cmd );
		nextLine();
		return b;
	}

	public Button addItem( String text, int cmd, String tooltip )
	{
		Button b = osd.createButton( sty, x, y, text, cmd );
		b.setToolTip( tooltip );
		nextLine();
		return b;
	}

	public Slider addItem( String text, int cmd, float value, String tooltip )
	{
		Slider s = osd.createSlider( stySld, styKnob, x, y, text, cmd, value );

		s.setToolTip( tooltip );
		nextLine();
		return s;
	}

	public Slider addItem( String text, int cmd, float value, float a, float b, int t, String tooltip )
	{
		Slider s = osd.createSlider( stySld, styKnob, x, y, text, cmd, value, a, b, t );

		s.setToolTip( tooltip );
		nextLine();
		return s;
	}


	public MultiChoice addItem( String text, int cmd, int value, Vector choices, String tooltip )
	{
		MultiChoice m = osd.createMulti( sty, x, y, text, cmd, value, choices );

		m.setToolTip( tooltip );
		nextLine();
		return m;
	}

	public MultiChoice addItem( String text, int cmd, int value, String[] choices, String tooltip )
	{
		Vector v = new Vector( choices.length );
		for( int i=0; i<choices.length; i++ )
			v.addElement( choices[i] );

		MultiChoice m = osd.createMulti( sty, x, y, text, cmd, value, v );

		m.setToolTip( tooltip );
		nextLine();
		return m;
	}
}

