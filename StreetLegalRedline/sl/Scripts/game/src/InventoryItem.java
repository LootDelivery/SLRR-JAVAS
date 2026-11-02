package java.game;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.*;	//Text
import java.render.osd.*;	//Text
import java.sound.*;

public class InventoryItem
{
	Inventory inventory;
	Dummy	localroot;	//local root to prevent crossrendering of button & part

	public InventoryItem( Inventory inv )
	{
		inventory = inv;
		localroot= new Dummy( inventory, GameRef.WORLDTREEROOT );
	}

	public String getInfo()
	{
		//this should be abstract
	}
}
