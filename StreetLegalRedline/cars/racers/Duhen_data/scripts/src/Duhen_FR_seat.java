package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FR_seat extends FrontSeat
{
	public Duhen_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Duhen SunStrip passenger's seat";

		description = "The stock passenger's seat for the SunStrips from 1.5 DVC to 2.2 DVC.";

		value = tHUF2USD(52.744);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
