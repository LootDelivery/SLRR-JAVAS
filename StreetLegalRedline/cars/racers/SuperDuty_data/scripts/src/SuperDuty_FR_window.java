package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_FR_window extends Window
{
	public SuperDuty_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty passenger's window";

		description = "The stock clear passenger's window of the SuperDutys.";

		value = tHUF2USD(61.083);
		brand_new_prestige_value = 45.69;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
