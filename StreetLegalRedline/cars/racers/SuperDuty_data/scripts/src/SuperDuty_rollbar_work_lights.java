package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_rollbar_work_lights extends DecorativeBodyPart
{
	public SuperDuty_rollbar_work_lights( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Hauler's SuperDuty work lights";
		description = "Some more light from above you. Gives excellent lighting at night.";

		value = tHUF2USD(76.654);
		brand_new_prestige_value = 98.23;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
