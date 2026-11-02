package java.render.osd.dialog;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;
import java.render.osd.*;

class LoadingDialog extends Dialog
{
	String			loadingString = "LOADING...";
	Text			loadingText;

	public LoadingDialog( int myflags )
	{
		super( null, myflags, null, null );
	}

	public void show()
	{
		//button
		Style buttonStyle = new Style( 2.0, 2.0, Frontend.mediumFont, Text.ALIGN_CENTER, null /*Osd.RRT_TEST*/ );

		//button = new Button[1];
		/*button[0] =*/ osd.createButton( buttonStyle, 0.0, 0.0, " ", 0 );
		osd.createHotkey( Input.AXIS_CANCEL, Input.VIRTUAL, 0, this );

		//visuals
		Frontend.largeFont.cache();

		if( loadingString )
			loadingText = osd.createText( loadingString, Frontend.largeFont, Text.ALIGN_RIGHT, 0.9, 0.8 );

		super.show();

		GfxEngine.forceRendering();
	}
}
