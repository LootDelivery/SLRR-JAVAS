package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_FR_seat extends FrontSeat
{
	public Enula_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Enula WR passenger's seat";
		description = "The stock passenger's seat for the WR models.";

		value = tHUF2USD(100.180);
		brand_new_prestige_value = 41.47;
	}
}
