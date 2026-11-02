package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;


//simpleloading, de atkapcsolja a billentyuzetet hogy biztosan menu modban fusson (azaz az enterrel el lehessen nyomni!)
public class CsDialog extends SimpleLoadingDialog
{
	public CsDialog( Controller ctrl, int myflags, ResourceRef background )
	{
		super( myflags|DF_FULLSCREEN, background );
		controller = ctrl;
	}
}

