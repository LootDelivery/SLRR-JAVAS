package java.render.osd;

import java.render.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;

public class Style
{
	float		width, height, aspect;
	ResourceRef charset;
	int			align;
	ResourceRef background;

	float		rWidth, rHeight;
	RectangleTemplate	rt;

	public Style( float w, float h, ResourceRef c, int a, ResourceRef b )
	{
		this( w, h, 4.0/3.0, c, a, b );
	}

	public Style( float w, float h, float as, ResourceRef c, int a, ResourceRef b )
	{
		width = w;
		height = h;
		charset = c;
		align = a;
		background = b;
		aspect=as;

		rWidth = width*Osd.SCALE_FS*aspect;
		rHeight = height*Osd.SCALE_FS;

		width/=aspect;

		if( b )
			rt = new RectangleTemplate( rWidth, rHeight, background );
	}
}
