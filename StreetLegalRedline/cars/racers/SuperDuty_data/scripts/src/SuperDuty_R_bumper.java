package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_bumper extends Bumper
{
	public SuperDuty_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty 500 rear bumper";

		description = "The stock rear bumper of the SuperDuty.";

		value = tHUF2USD(159.662);
		brand_new_prestige_value = 50.84;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
