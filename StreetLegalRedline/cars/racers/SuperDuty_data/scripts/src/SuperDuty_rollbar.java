package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_rollbar extends RollBar
{
	public SuperDuty_rollbar( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty rollbar";

		description = "A very strong rollbar made of steel, finished in bright chrome. It protects the chassis from being hurt badly in the case of an upside-down accident.";

		value = tHUF2USD(549.745);
		brand_new_prestige_value = 137.07;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
