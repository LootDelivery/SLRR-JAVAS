package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_F_windshield extends Windshield
{
	public SuperDuty_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty front windshield";

		description = "The stock front windshield of the SuperDutys. It totally eliminates UV rays and features easter egg FWS-516-756.";

		value = tHUF2USD(366.497);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
