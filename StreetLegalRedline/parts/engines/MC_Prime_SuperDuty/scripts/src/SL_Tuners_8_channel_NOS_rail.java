package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class SL_Tuners_8_channel_NOS_rail extends NOSInjectorSystem
{
	public SL_Tuners_8_channel_NOS_rail( int id )
	{
		super( id );
		name = "SL Tuners 8 channel ported N2O system";
		description = "A ported nitrous oxidizer intake system for the vee-8 blocks. This system will add 50 to 375 HP to your engine depending on tuning level and calibration. It has eight 0.37 inch injectors and comes with an adjustable electronic module to ensure you achieve the best performance.";

		value = tHUF2USD(650);
		brand_new_prestige_value = 138.62;
		setMaxWear(kmToMaxWear(1000000.0));

		maxconsumption		= 8.16; // 1080 lbs/hr
		minconsumption		= 1.088; // 144 lbs/hr
		nitro_consumption	= minconsumption;
		nitro_minRPM		= 2250.0;
		nitro_maxRPM		= 6000.0;
		nitro_minThrottle	= 0.9;

		check4warnings();
	}
}
