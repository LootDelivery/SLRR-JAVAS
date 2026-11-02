package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class MC_Prime_SuperDuty_intake_manifold_converter extends IntakeManifold
{
	public MC_Prime_SuperDuty_intake_manifold_converter( int id )
	{
		super( id );
		name = "Vee-8 intake manifold converter";
		description = "";
		brand_new_prestige_value = 86.01;

		value = tHUF2USD(88.535);
		setMaxWear(kmToMaxWear(426000.0));

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x0000008Ar, "2x4 barrel intake manifold", desc );
	}

	public void updatevariables()
	{
		IntakeManifold im = getIntakeManifold();

		if (im)
		{
			im.updatevariables();
			efficiency = im.efficiency;
			mixture_ratio = im.mixture_ratio;
			max_fuel_consumption = im.max_fuel_consumption;
			max_air_consumption = im.max_air_consumption;
			mixture_H = im.mixture_H;
			time_burn = im.time_burn;
		}
		else
		{
			efficiency = 0.0;
			mixture_ratio = 1.0;
			max_fuel_consumption = 0.0;
			max_air_consumption = 0.0;
			mixture_H = 1.0;
			time_burn = 0.1;
		}
	}

	public Part getIntakeManifold()
	{
		Part unsafePart;
	
		if ( (unsafePart = partOnSlot(19)) && unsafePart instanceof IntakeManifold )
			return (IntakeManifold)unsafePart;

		return null;
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 19 );
		if (!p)
			return "the intake is missing.";

		return super.isDynoable();
	}
}
