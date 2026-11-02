package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_steering_wheel extends SteeringWheel
{
	public Enula_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Enula WR steering wheel";
		description = "The stock 38.0 cm (15.0 inch) steering wheel for the WR models.";

		diameter = 380.0;
		value = tHUF2USD(40.071);
		brand_new_prestige_value = 41.47;
	}
}
