package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_F_bumper_2 extends Bumper
{
	public SuperDuty_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty Extra 750 front bumper";

		description = "The stock front bumper for the Extra 750 supporting fresh air intake passage at the bottom and a pair of integrated 50W white-beam halogen foglights.";

		value = tHUF2USD(242.566);
		brand_new_prestige_value = 60.19;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
