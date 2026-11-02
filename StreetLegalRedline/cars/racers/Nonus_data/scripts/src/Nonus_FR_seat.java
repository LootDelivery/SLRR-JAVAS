package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_FR_seat extends FrontSeat
{
	public Nonus_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Nonus passenger's seat";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(109.457);
	}
}
