package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_windshield extends Windshield
{
	public SuperDuty_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty rear windshield";

		description = "The factory stock rear windshield.";

		value = tHUF2USD(274.873);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
