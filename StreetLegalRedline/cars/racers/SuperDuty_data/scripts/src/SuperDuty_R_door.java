package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_door extends HatchDoor
{
	public SuperDuty_R_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty flatbed hatch door";

		description = "The stock hatch door for the flatbed of the SuperDuty trucks.";

		value = tHUF2USD(702.452);
		brand_new_prestige_value = 34.27;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
