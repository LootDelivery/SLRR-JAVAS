package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_FR_seat extends FrontSeat
{
	public SuperDuty_FR_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Hauler's SuperDuty passenger's seat";

		description = "The stock passenger's seat for the SuperDutys. It's as comfortable as an arm-chair to ensure pleasure for the longest trips hauling stuff from one place to another. Look forward for an easter egg.";

		value = tHUF2USD(152.707);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
