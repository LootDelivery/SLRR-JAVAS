package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Extra_750_body extends Set
{
	public kit_Extra_750_body( int id )
	{
		super( id );
		name = "Hauler's SuperDuty Extra 750 body kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.superduty:0x000000C3r ); // RL quarterpanel 2
		inv.insertItem( cars.racers.superduty:0x000000C8r ); // RR quarterpanel 2

		inv.insertItem( cars.racers.superduty:0x000000CDr ); // L sideskirt 2
		inv.insertItem( cars.racers.superduty:0x000000CFr ); // R sideskirt 2

		inv.insertItem( cars.racers.superduty:0x000000C4r ); // F bumper 2
		inv.insertItem( cars.racers.superduty:0x000000B9r ); // R bumper 2

		inv.insertItem( cars.racers.superduty:0x000000C2r ); // hood 2
	}
}
