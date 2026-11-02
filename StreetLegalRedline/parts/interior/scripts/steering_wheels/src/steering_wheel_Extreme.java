package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class steering_wheel_Extreme extends SteeringWheel
{
	public steering_wheel_Extreme( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Extreme steering wheel";
		description = "This is an extreme shaped 320 mm (12.6 inch) sports steering wheel compatible with all cars. It supports two custom trigger buttons.";

		value = tHUF2USD(47.5);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 350.0;
		hub_depth = 5.0;
	}
}
