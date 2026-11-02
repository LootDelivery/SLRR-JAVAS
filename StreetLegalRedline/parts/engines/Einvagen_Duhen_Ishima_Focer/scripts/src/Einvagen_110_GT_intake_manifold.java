package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class Einvagen_110_GT_intake_manifold extends IntakeManifold
{
	public Einvagen_110_GT_intake_manifold( int id )
	{
		super( id );
		name = "Einvagen 110 GT intake manifold";
		description = "This intake features 4 big bored even length tunnels and a 15.0 litre (920 cui) airbox to support the engine with enough fresh air.";

		value = tHUF2USD(60);
		brand_new_prestige_value = 33.53;
		setMaxWear(kmToMaxWear(510000.0));

		fuel_rail_slot_ID=25;

		efficiency = 0.80;
	}

	public void updatevariables()
	{
		mixture_ratio = 1.0;
		max_fuel_consumption = 0.0;
		max_air_consumption = 0.150;
		mixture_H = 1.0;
		time_burn = 0.1;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(25)) && unsafePart instanceof AirFuelDeliverySystem)
		{
			AirFuelDeliverySystem mixture_intake = unsafePart;

			mixture_intake.updatevariables();

			mixture_ratio = mixture_intake.mixture_ratio;
			max_fuel_consumption = mixture_intake.max_fuel_consumption;
			mixture_H = mixture_intake.mixture_H;
			time_burn = mixture_intake.time_burn;
		}
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EINVAGEN)
		{
			if (the_car.model == Einvagen_models.MODEL_110_GT)
			{
				FuelInjectorSystem fr;
				if (desc.power > 1.5)
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000B8r, "SL_Tuners_methanol_fuel_rail", desc );
					fr.mixture_ratio = (desc.power-1.5)/0.5*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				}
				else
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Er, "Einvagen_PerPro_GTA_fuel_rail", desc );
					if (desc.power < 1.0)
						fr.randomizeMixtureRatio(desc.power);
					else
					if (desc.power <= 1.5)
						fr.mixture_ratio = (desc.power-1.0)/0.5*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				}
			}
			else
			if (the_car.model == Einvagen_models.MODEL_110_GTK)
			{
				FuelInjectorSystem fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Er, "Einvagen_PerPro_GTA_fuel_rail", desc );
				if (desc.power < 1.0)
					fr.randomizeMixtureRatio(desc.power);
				else
				if (desc.power < 1.25)
					fr.mixture_ratio = (desc.power-1.0)/0.25*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				else
					fr.mixture_ratio = fr.optimal_mixture_ratio;
			}
		}
	}
}
