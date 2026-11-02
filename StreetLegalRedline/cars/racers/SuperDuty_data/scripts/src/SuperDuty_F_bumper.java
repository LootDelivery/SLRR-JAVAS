package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_F_bumper extends Bumper
{
	public SuperDuty_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty 500 front bumper";

		description = "The stock front bumper for the Extra 750.";

		value = tHUF2USD(177.403);
		brand_new_prestige_value = 50.84;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
