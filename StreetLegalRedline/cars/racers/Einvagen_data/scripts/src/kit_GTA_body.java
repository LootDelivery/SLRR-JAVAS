package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GTA_body extends Set
{
	public kit_GTA_body( int id )
	{
		super( id );
		name = "Einvagen GTA body kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.einvagen:0x000000C6r ); // Rf wing
		inv.insertItem( cars.racers.einvagen:0x000000C4r ); // R wing
	}
}
