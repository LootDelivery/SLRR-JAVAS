package java.render.osd;

import java.render.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class StringInput extends Gadget
{
	String	inputString;
	Text	inputText;

	public StringInput( Osd osd ,Rectangle r, PhysicsRef p, int c, Object h  )
	{
		super( osd, p, r, c, h );
	}

	public void click()
	{
		osd.actGadget=this;
		inputText.changeText( inputString + "_" );
	}

	public void sendMessage()
	{
		osd.stringValue = inputString;
		super.sendMessage();
	}

	public void setValue( String s )
	{
		inputString = s;
		inputText.changeText( inputString );
	}

	public int key( int ascii )
	{
		if( !inputString )
			inputString = "";

		if( inputString.length() < 16 || ascii == 8 || ascii == 13 || ascii == 27 )//hossz limit
		{
			if( ascii == 27 )	//escape
			{
				osd.actGadget=null;
				inputString = null;
				inputText.changeText( null );
			}
			else
			if( ascii == 13)	//enter
			{
				osd.actGadget=null;
				inputText.changeText( inputString );
				sendMessage();
			}
			else				//normal keys (incl backspace)
			{
				inputString = inputString.append( ascii );
				inputText.changeText( inputString + "_" );
			}

			return 1;
		}

		return 0;
	}
}
