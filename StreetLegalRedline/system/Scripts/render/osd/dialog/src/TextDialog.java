package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;

public class TextDialog extends Dialog
{
	String	text;

	public TextDialog( Controller ctrl, int myFlags, String myTitle, String myButtons, String mybody )
	{
		super( ctrl, myFlags|DF_DARKEN, myTitle, myButtons );
		text=mybody;
	}

	public TextDialog( Controller ctrl, int myFlags, String myTitle, String myButtons, String mybody, float size, float aspect )
	{
		super( ctrl, myFlags|DF_DARKEN, myTitle, myButtons, size, aspect );
		text=mybody;
	}

	public void show()
	{
		if( text )
		{
			float x = -0.85;
			float y = -0.70;
			float width = 1.7;

			osd.createTextBox( text, Frontend.mediumFont, Text.ALIGN_CENTER, x, y, width );
		}
		super.show();
	}
}

