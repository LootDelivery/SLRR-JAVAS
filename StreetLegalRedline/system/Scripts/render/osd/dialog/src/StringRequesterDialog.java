package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;



public class StringRequesterDialog extends OKCancelDialog
{
	String input;

	public StringRequesterDialog( Controller ctrl, int myflags, String mytitle, String init )
	{
		super( ctrl, myflags, mytitle, "OK;Cancel", null );

		input = init;
	}

	public void show()
	{
		Style sty = new Style( 0.75, 0.12, Frontend.mediumFont, Text.ALIGN_CENTER, new ResourceRef(frontend:0x00D8r) );

		osd.createStringInput( sty, 0.0, 0.0, null, 12345, input );

		super.show();
	}

	public void	osdCommand( int cmd )
	{
		if( cmd==12345 )
		{
			input = osd.stringValue;

			if( !((flags&SIF_NOEMPTY) && input.length() == 0) )
			{
				if( !osd.actGadget )		//ha most veszti el a fokuszt
					osdCommand( 0 );	//OK generated
			}
		}
		else
		{
			if( cmd==0 )	//OK de-generated?
			{
				if( ((flags&SIF_NOEMPTY) && input.length() == 0) )
				{
					return;	//nem hagyjuk az ureset!
				}
			}

			super.osdCommand( cmd );
		}
	}
}

