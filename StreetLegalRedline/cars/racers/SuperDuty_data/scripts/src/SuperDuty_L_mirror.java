package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_L_mirror extends Mirror
{
	public SuperDuty_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty left mirror";

		description = "The stock left mirror for the SuperDutys.";

		value = tHUF2USD(76.354);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
