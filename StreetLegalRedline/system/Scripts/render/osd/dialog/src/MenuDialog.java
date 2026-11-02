package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;


public class MenuDialog extends Dialog
{
	String		info;
	String[]	labels;

	public MenuDialog( Controller ctrl, int myFlags, String myTitle, String info, String[] myLabels )
	{
		super( ctrl, myFlags|DF_DARKEN, myTitle, null );
		labels = myLabels;
		this.info = info;
	}

	public void show()
	{
		float	y = -0.5;

		if( info )
		{
			osd.createText( info, Frontend.mediumFont, Text.ALIGN_CENTER, 0.0, y );
			y+=0.2;
		}

		Style butt1 = new Style( 0.45, 0.10, Frontend.mediumFont, Text.ALIGN_CENTER, new ResourceRef(frontend:0x00D8r) );
		Menu m = osd.createMenu( butt1, 0.0, y, 0 );

		for ( int i=0; i<labels.length; i++ )
			m.addItem( labels[i], i+1 );

		m.addSeparator();

		butt1 = new Style( 0.25, 0.12, Frontend.mediumFont, Text.ALIGN_CENTER, new ResourceRef(frontend:0x00D8r) );
		m.setStyle( butt1 );
		m.addItem( "CANCEL", 0 );

		super.show();
	}

	public void	osdCommand( int cmd )
	{
		if( cmd < labels.length+1 )
		{
			result=cmd;
			notify();
		}
	}

}
