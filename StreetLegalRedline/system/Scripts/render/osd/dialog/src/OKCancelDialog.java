package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;


public class OKCancelDialog extends TextDialog
{
	public OKCancelDialog( Controller ctrl, int myflags, String mytitle, String mybody )
	{
		super( ctrl, myflags, mytitle, "OK;Cancel", mybody );
	}
	public OKCancelDialog( Controller ctrl, int myflags, String mytitle, String mybody, float size, float aspect )
	{
		super( ctrl, myflags, mytitle, "OK;Cancel", mybody, size, aspect );
	}
}
