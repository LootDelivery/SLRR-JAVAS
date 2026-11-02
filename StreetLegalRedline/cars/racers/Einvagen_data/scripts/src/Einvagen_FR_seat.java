package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FR_seat extends FrontSeat
{
	public Einvagen_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Einvagen GT passenger's seat";
		description = "The stock passenger's seat for the GT models.";

		value = tHUF2USD(55.633);
		brand_new_prestige_value = 23.25;
	}
}
