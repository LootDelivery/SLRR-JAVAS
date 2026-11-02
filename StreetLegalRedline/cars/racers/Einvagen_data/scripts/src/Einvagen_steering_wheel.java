package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_steering_wheel extends SteeringWheel
{
	public Einvagen_steering_wheel( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Einvagen GT steering wheel";
		description = "The stock 41.0 cm (16.1 inch) steering wheel for the GT models. It's made of medium quality plastic on a metal frame. Does not assure too much prestige, but who cares if you get an easter egg in return. Here it is: EV123456.";

		diameter = 410.0;
		value = tHUF2USD(22.253);
		brand_new_prestige_value = 23.25;
	}
}
