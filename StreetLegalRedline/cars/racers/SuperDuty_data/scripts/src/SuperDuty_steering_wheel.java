package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_steering_wheel extends SteeringWheel
{
	public SuperDuty_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Hauler's SuperDuty stock steering wheel";

		description = "The stock 44.0 cm (17.0 inch) diameter steering wheel of Hauler's SuperDuty 500 and SuperDuty Extra 750. It's coated with fine black Canadian leather, and has a good grip. On the center cap you can see the Hauler's logo."; // a hatoldalon pedig easter egg:H-500-750 //

		diameter = 440.0;

		value = tHUF2USD(61.083);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
