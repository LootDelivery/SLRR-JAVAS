package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class steering_wheel_Volante_red extends SteeringWheel
{
	public steering_wheel_Volante_red( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Ulante steering wheel";
		description = "This  is the red version of this standard 350 mm (13.8 inch) sports steering wheel. It's compatible with all cars.";

		value = tHUF2USD(32);
		brand_new_prestige_value = 38.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 5.0;
	}
}
