package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_hood_2 extends Hood
{
	public SuperDuty_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty Extra 750 hood";

		description = "The reworked stock hood for the SuperDuty family. It supports the ram-intake of the supercharged V8 of the Extra 750 but looks great on a SD 500, too.";

		value = tHUF2USD(873.239);
		brand_new_prestige_value = 60.19;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
