package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class steering_wheel_Lexes_blue extends SteeringWheel
{
	public steering_wheel_Lexes_blue( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Lexes steering wheel";
		description = "This is the blue version of this standard 350 mm (13.8 inch) sports steering wheel. It's compatible with all cars.";

		value = tHUF2USD(27);
		brand_new_prestige_value = 30.00;

		setMaxWear(kmToMaxWear(500000.0));

		diameter = 380.0;
		hub_depth = 3.5;
	}
}
