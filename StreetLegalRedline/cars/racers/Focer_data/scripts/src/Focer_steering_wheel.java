package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_steering_wheel extends SteeringWheel
{
	public Focer_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Focer steering wheel";
		diameter = 428.0;
		description = "";
		brand_new_prestige_value = 34.29;

		value = tHUF2USD(37.961);
	}
}
