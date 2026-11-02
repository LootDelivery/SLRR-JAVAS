package java.render;

import java.render.osd.dialog.*;
import java.render.osd.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

//csak egy hatterkep, plusz a felirat
class SimpleLoadingDialog extends LoadingDialog
{
	ResourceRef		pic;

	public SimpleLoadingDialog( int myflags, ResourceRef pic )
	{
		super( myflags );
		this.pic = pic;
	}

	public void show()
	{
		//visuals
		ResourceRef loadingTexture = pic;
		loadingTexture.cache();

		//patch: arrol is le kellene szedniuk..
		if( pic == Frontend.defLoadingPic )
			loadingString = null;

		osd.createBG( loadingTexture );
		
		super.show();
	}
}
