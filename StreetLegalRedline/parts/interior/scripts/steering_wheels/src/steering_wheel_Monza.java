package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class steering_wheel_Monza extends SteeringWheel
{
	public steering_wheel_Monza( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Monzo steering wheel";
		description = "This is a standard 350 mm (13.8 inch) sports steering wheel compatible with all cars.";

		value = tHUF2USD(35);
		brand_new_prestige_value = 40.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
