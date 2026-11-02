package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_steering_wheel extends SteeringWheel
{
	public Prime_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Prime DLH 500 steering wheel";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(77.051);
	}
}
