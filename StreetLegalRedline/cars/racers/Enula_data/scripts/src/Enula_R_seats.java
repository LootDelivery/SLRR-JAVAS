package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_seats extends RearSeat
{
	public Enula_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR rear seats";
		description = "The stock rear seats for the WRY and WRZ models. These seats were removed from the WR SuperTurizmo to reduce weight at the rear of the car.";

		value = tHUF2USD(100.180);
		brand_new_prestige_value = 33.17;
	}
}
