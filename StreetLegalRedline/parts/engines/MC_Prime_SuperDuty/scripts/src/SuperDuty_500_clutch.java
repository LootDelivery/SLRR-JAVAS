package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class SuperDuty_500_clutch extends Clutch
{
	public SuperDuty_500_clutch( int id )
	{
		super( id );
		name = "Hauler's SuperDuty 500 clutch";
		description = "";
		brand_new_prestige_value = 58.53;

		value = tHUF2USD(108.047);
		setMaxWear(kmToMaxWear(400000.0));

		maxRPM = 8000.0;

		inertia = kgToInertia(6.5);

		check4warnings();
	}
}
