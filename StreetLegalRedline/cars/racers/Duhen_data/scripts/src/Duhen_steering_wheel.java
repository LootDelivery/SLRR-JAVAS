package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_steering_wheel extends SteeringWheel
{
	public Duhen_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Duhen SunStrip steering wheel";

		description = "The stock 42 cm (16.5 inch) steering wheel for all Duhen SunStrip. It features an embossed Duhen Corp. logo on the center of the wheel.";

		diameter = 420.0;

		value = tHUF2USD(21.098);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000.0));
	}
}
