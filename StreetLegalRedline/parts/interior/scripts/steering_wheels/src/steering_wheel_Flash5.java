package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class steering_wheel_Flash5 extends SteeringWheel
{
	public steering_wheel_Flash5( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Flash-4 steering wheel";
		description = "This is a standard 350 mm (13.8 inch) sports steering wheel compatible with all cars. It supports two custom trigger buttons.";

		value = tHUF2USD(45);
		brand_new_prestige_value = 50.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
