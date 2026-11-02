package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_bumper_2 extends Bumper
{
	public SuperDuty_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty Extra 750 rear bumper";

		description = "The reworked stock rear bumper of the SuperDuty supporting the 100mm single exhaust system.";

		value = tHUF2USD(218.310);
		brand_new_prestige_value = 60.19;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
