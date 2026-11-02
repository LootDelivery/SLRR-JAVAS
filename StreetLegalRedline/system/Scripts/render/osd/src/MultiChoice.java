package java.render.osd;

import java.render.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class MultiChoice extends Gadget
{
	Hotkey		hkl, hkr;

	Vector		choices;

	int		value;
	Text	ccText;

	int		offset;

	public MultiChoice( Osd osd, Rectangle r, PhysicsRef p, Vector chs, int c, Object h  )
	{
		super( osd, p, r, c, h );

		choices = chs;
	}

	public void focus()
	{
		super.focus();

		//osd.actGadget = this;
		hkl = osd.createHotkey( Input.AXIS_MENU_LEFT, Input.VIRTUAL|Osd.HK_STATIC, Osd.CMD_MENU_DEC|Osd.PRIVATEEVENT, null );
		hkr = osd.createHotkey( Input.AXIS_MENU_RIGHT, Input.VIRTUAL|Osd.HK_STATIC, Osd.CMD_MENU_INC|Osd.PRIVATEEVENT, null );
	}
	public void unfocus()
	{
		super.unfocus();

		osd.hotkey.removeElement( hkl ); hkl.inactivate(); hkl=null;
		osd.hotkey.removeElement( hkr ); hkr.inactivate(); hkr=null;
		//osd.actGadget = null;
	}

	public void increase()
	{
		setValue( value+1 );
		sendMessage();
	}

	public void decrease()
	{
		setValue( value-1 );
		sendMessage();
	}

	public void sendMessage()
	{
		osd.multiValue = value;
		super.sendMessage();
	}

	public void click()
	{
		int cmp = value;

		setValue( value+1 );

		if( cmp == value )
		{
			setValue( offset );
		}
		sendMessage();
	}

	public void setValue( int v )
	{
		if( choices )
		{
			if( v >= choices.size()+offset )
				value = choices.size()-1+offset;
 			else
			if( v < offset )
				value = offset;
			else
				value = v;

			ccText.changeText( choices.elementAt(value-offset) );
		}
	}

}
