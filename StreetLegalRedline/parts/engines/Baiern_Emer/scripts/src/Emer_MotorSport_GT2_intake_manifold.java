package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;


public class Emer_MotorSport_GT2_intake_manifold extends IntakeManifold
{
	public Emer_MotorSport_GT2_intake_manifold( int id )
	{
		super( id );
		name = "Emer MotorSport Nonus GT2 intake manifold";
		description = "";
		brand_new_prestige_value = 48.01;

		value = tHUF2USD(198.910);
		setMaxWear(kmToMaxWear(630000.0));

		fuel_rail_slot_ID=10;

		efficiency = 0.89;

		check4warnings();
	}

	public void updatevariables()
	{
		mixture_ratio = 1.0;
		max_fuel_consumption = 0.0;
		max_air_consumption = 0.250;
		mixture_H = 1.0;
		time_burn = 0.1;

		Part unsafePart;
		if ( (unsafePart = partOnSlot(10)) && unsafePart instanceof AirFuelDeliverySystem)
		{
			AirFuelDeliverySystem mixture_intake = unsafePart;

			mixture_intake.updatevariables();

			mixture_ratio = mixture_intake.mixture_ratio;
			max_fuel_consumption = mixture_intake.max_fuel_consumption;
			mixture_H = mixture_intake.mixture_H;
			time_burn = mixture_intake.time_burn;
		}

		if ( (unsafePart = partOnSlot(30)) && unsafePart instanceof NOSInjectorSystem)
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

		if (the_car.make == the_car.MAKE_EMER)
		{
			if (the_car.model == Emer_models.MODEL_NONUS_STREET_GT)
			{
				FuelInjectorSystem fr = addPart( parts.engines.Baiern_Emer:0x000000DFr, "Emer_GT_II_fuel_rail", desc );
				if (desc.power < 1.0)
					fr.randomizeMixtureRatio(desc.power);
				else
				if (desc.power < 1.2)
					fr.mixture_ratio = (desc.power-1.1)/0.1*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				else
					fr.mixture_ratio = fr.optimal_mixture_ratio;
			}
			else
			if (the_car.model == Emer_models.MODEL_MOTORSPORT_NONUS_GT2)
			{
				FuelInjectorSystem fr = addPart( parts.engines.Baiern_Emer:0x000000DFr, "Emer_GT_II_fuel_rail", desc );
				if (desc.power < 1.0)
					fr.randomizeMixtureRatio(desc.power);
				else
				if (desc.power < 1.2)
					fr.mixture_ratio = (desc.power-1.0)/0.2*(fr.optimal_mixture_ratio-fr.default_mixture_ratio)+fr.default_mixture_ratio;
				else
					fr.mixture_ratio = fr.optimal_mixture_ratio;
			}
		}
	}
}
