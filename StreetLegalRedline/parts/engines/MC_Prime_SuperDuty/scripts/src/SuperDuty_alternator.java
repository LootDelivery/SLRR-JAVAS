package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class SuperDuty_alternator extends Part
{
	public SuperDuty_alternator( int id )
	{
		super( id );
		name = "Hauler's SuperDuty alternator";
		description = "";
		brand_new_prestige_value = 24.37;

		value = tHUF2USD(25.085);
		setMaxWear(kmToMaxWear(400000.0));

		check4warnings();
	}
}
