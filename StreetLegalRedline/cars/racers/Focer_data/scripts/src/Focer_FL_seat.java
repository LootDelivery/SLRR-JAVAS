package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FL_seat extends FrontSeat
{
	public Focer_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;

		name = "Focer driver's seat";
		description = "The stock driver's seat for the Focer RC models.";

		brand_new_prestige_value = 34.29;
		value = tHUF2USD(94.903);
	}
}
