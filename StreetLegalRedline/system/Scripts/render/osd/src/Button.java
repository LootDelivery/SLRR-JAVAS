package java.render.osd;

import java.render.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Button extends Gadget
{
	public Button( Osd osd ,Rectangle r, PhysicsRef p, int c, Object h  )
	{
		super( osd, p, r, c, h );
	}

	public void drop( GameRef what )
	{
		osd.dropObject = what;
		sendMessage();
		osd.dropObject = null;
	}

	public void drop( Gadget what )
	{
		osd.dropGadget = what;
		sendMessage();
		osd.dropGadget = null;
	}

	public void click()
	{
		sendMessage();
	}
}
