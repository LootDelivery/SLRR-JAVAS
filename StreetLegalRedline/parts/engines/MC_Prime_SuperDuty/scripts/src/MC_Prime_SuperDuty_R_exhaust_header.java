package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class MC_Prime_SuperDuty_R_exhaust_header extends ExhaustHeader
{
	public MC_Prime_SuperDuty_R_exhaust_header( int id )
	{
		super( id );
		name = "Prime DLH right exhaust header";
		description = "";
		brand_new_prestige_value = 64.51;

		value = tHUF2USD(66.401);
		setMaxWear(kmToMaxWear(330000.0));

		efficiency = 0.9;

		check4warnings();
	}
}
