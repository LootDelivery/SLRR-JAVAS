package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;

class PaintCan
{
	int			color;
	float		capacity;

	public PaintCan( int color, float capacity )
	{
		int i;
		this.color=color;
		this.capacity=capacity;
	}
}
