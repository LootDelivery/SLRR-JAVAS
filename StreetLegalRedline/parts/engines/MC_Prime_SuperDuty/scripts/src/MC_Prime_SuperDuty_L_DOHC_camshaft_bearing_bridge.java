package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class MC_Prime_SuperDuty_L_DOHC_camshaft_bearing_bridge extends SlidingEnginePart
{
	public MC_Prime_SuperDuty_L_DOHC_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Prime DLH left camshaft bearing bridge";
		description = "";
		brand_new_prestige_value = 57.34;

		value = tHUF2USD(59.023);
		setMaxWear(kmToMaxWear(426000.0));

		check4warnings();
	}
}
