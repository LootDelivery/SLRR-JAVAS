package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class MC_Prime_SuperDuty_oil_pan extends OilPan
{
	public MC_Prime_SuperDuty_oil_pan( int id )
	{
		super( id );
		name = "Prime DLH oil pan";
		description = "";
		brand_new_prestige_value = 43.01;

		value = tHUF2USD(44.268);
		setMaxWear(kmToMaxWear(426000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
