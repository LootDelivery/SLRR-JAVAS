package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class SuperDuty_R_camshaft_bearing_bridge extends SlidingEnginePart
{
	public SuperDuty_R_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Hauler's SuperDuty right camshaft bearing bridge";
		description = "";
		brand_new_prestige_value = 57.34;

		value = tHUF2USD(59.023);
		setMaxWear(kmToMaxWear(400000.0));

		check4warnings();
	}
}
