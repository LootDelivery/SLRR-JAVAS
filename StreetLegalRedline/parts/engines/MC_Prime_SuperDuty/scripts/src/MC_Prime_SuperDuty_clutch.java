package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class MC_Prime_SuperDuty_clutch extends Clutch
{
	public MC_Prime_SuperDuty_clutch( int id )
	{
		super( id );
		name = "Prime DLH clutch";
		description = "";
		brand_new_prestige_value = 58.53;

		value = tHUF2USD(138.047);
		setMaxWear(kmToMaxWear(426000.0));

		maxRPM = 13000.0;

		inertia = kgToInertia(4.5);

		check4warnings();
	}
}
