package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_steering_wheel extends SteeringWheel
{
	public Nonus_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Nonus steering wheel";
		description = "";
		brand_new_prestige_value = 53.89;

		diameter = 380.0;
		value = tHUF2USD(43.783);
	}
}
