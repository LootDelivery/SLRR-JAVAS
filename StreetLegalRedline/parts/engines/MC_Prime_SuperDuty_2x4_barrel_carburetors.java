package java.game.parts.engines.MC_Prime_SuperDuty;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_2x4_barrel_carburetors extends FuelInjectorSystem
{
	public MC_Prime_SuperDuty_2x4_barrel_carburetors( int id )
	{
		super( id );
		name = "Prime DLH carburetors";
		description = "";
		brand_new_prestige_value = 58.53;

		value = tHUF2USD(208.047);
		setMaxWear(kmToMaxWear(226000.0));

		mixture_ratio		= 13.5;
		max_fuel_consumption	= 0.06;
		fuel_type		= FT_DIESEL;
		calcStuffs();

		check4warnings();
	}

	public void updatevariables()
	{
		max_air_consumption	= 0.6;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(11)) && unsafePart instanceof AirFilter )
		{
			AirFilter air_intake = unsafePart;

			air_intake.updatevariables();

			max_air_consumption = air_intake.max_air_consumption;
		}

		super.updatevariables();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x00000086r, "oval air filter", desc );
	}
}
