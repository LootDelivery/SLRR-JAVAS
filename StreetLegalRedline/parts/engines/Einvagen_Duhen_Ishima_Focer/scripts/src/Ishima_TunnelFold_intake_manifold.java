package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class Ishima_TunnelFold_intake_manifold extends IntakeManifold
{
	public Ishima_TunnelFold_intake_manifold( int id )
	{
		super( id );
		name = "Ishima TunnelFold intake manifold";
		description = "";
		brand_new_prestige_value = 51.26;

		value = tHUF2USD(70);
		setMaxWear(kmToMaxWear(510000.0));

		fuel_rail_slot_ID=25;

		efficiency = 0.80;
	}

	public void updatevariables()
	{
		mixture_ratio = 1.0;
		max_fuel_consumption = 0.0;
		max_air_consumption = 0.2;
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

		if ( (unsafePart = partOnSlot(23)) && unsafePart instanceof NOSInjectorSystem)
		{
			NOSInjectorSystem nos_intake = unsafePart;

			nos_intake.updatevariables();

			nitro_H = nos_intake.nitro_H;
			nitro_cooling = nos_intake.nitro_cooling;
			nitro_consumption = nos_intake.nitro_consumption;
			nitro_minRPM = nos_intake.nitro_minRPM;
			nitro_maxRPM = nos_intake.nitro_maxRPM;
			nitro_minThrottle = nos_intake.nitro_minThrottle;
		}
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_ISHIMA)
		{
			if (the_car.model == Ishima_models.MODEL_ENULA_WRY)
			{
				FuelInjectorSystem fr;
				if (desc.power < 1.3)
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F3r, "Ishima_FN_rail_fuel_rail", desc );
					if (desc.power < 1.0)
						fr.randomizeMixtureRatio(desc.power);		
					else
						fr.mixture_ratio = (desc.power-1.0)/0.3*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				}
				else
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000B8r, "SL_Tuners_methanol_fuel_rail", desc );
					if (desc.power < 1.5)
						fr.mixture_ratio = (desc.power-1.3)/0.2*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
					else
						fr.mixture_ratio = fr.optimal_mixture_ratio;
				}
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WRZ)
			{
				FuelInjectorSystem fr;
				if (desc.power < 1.3)
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F3r, "Ishima_FN_rail_fuel_rail", desc );
					if (desc.power < 1.0)
						fr.randomizeMixtureRatio(desc.power);		
					else
						fr.mixture_ratio = (desc.power-1.0)/0.3*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				}
				else
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000B8r, "SL_Tuners_methanol_fuel_rail", desc );
					if (desc.power < 1.5)
						fr.mixture_ratio = (desc.power-1.3)/0.2*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
					else
						fr.mixture_ratio = fr.optimal_mixture_ratio;
				}
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WR_SUPERTURIZMO)
			{
				FuelInjectorSystem fr;
				if (desc.power < 1.2)
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F3r, "Ishima_FN_rail_fuel_rail", desc );
					if (desc.power < 1.0)
						fr.randomizeMixtureRatio(desc.power);		
					else
						fr.mixture_ratio = (desc.power-1.0)/0.2*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				}
				else
				{
					fr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000B8r, "SL_Tuners_methanol_fuel_rail", desc );
					if (desc.power < 1.5)
						fr.mixture_ratio = (desc.power-1.2)/0.3*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
					else
						fr.mixture_ratio = fr.optimal_mixture_ratio;
				}
			}
		}
	}
}
