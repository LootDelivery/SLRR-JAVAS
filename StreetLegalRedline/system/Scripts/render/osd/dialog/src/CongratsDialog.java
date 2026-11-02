package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;


public class CongratsDialog extends Dialog
{
	GameRef	buttonOk;
	int		bgID;

	public CongratsDialog( Controller ctrl, int myflags, int bgID_ )
	{
		super( ctrl, myflags|DF_DARKEN, null, null );
		bgID=bgID_;
	}

	public void show()
	{
		osd.createBG( new ResourceRef(bgID) );

		Style buttonStyle = new Style( 0.45, 0.12, Frontend.mediumFont, Text.ALIGN_RIGHT, new ResourceRef(frontend:0x00D8r) );

		//button = new Button[1];
		/*button[0] =*/ osd.createButton( buttonStyle, 1.0, 0.88, "OK", 0 );
		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL, osd.defSelection, this );

		super.show();
	}
}
