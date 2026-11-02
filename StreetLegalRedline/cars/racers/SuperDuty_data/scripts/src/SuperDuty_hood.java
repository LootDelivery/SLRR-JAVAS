package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_hood extends Hood
{
	public SuperDuty_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty hood";

		description = "The stock hood of the SuperDuty 500.";

		value = tHUF2USD(549.745);
		brand_new_prestige_value = 45.69;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
