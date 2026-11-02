package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;

public class YesNoDialog extends TextDialog
{
	public YesNoDialog( Controller ctrl, int myflags, String mytitle, String mybody )
	{
		super( ctrl, myflags, mytitle, "YES;NO", mybody );
		escapeCmd = 1;	//NO
	}

	public YesNoDialog( Controller ctrl, int myflags, String mytitle, String mybody, float size, float aspect )
	{
		super( ctrl, myflags, mytitle, "YES;NO", mybody, size, aspect );
		escapeCmd = 1;	//NO
	}
}

