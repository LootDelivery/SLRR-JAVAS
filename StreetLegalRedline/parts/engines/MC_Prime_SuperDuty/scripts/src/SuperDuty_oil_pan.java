package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class SuperDuty_oil_pan extends OilPan
{
	public SuperDuty_oil_pan( int id )
	{
		super( id );
		name = "Hauler's SuperDuty oil pan";
		description = "";
		brand_new_prestige_value = 43.01;

		value = tHUF2USD(44.268);
		setMaxWear(kmToMaxWear(300000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
