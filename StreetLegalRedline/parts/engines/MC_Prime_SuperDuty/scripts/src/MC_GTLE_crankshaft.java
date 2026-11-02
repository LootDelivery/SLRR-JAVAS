package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_GTLE_crankshaft extends Crankshaft
{
	public MC_GTLE_crankshaft( int id )
	{
		super( id );
		name = "MC GTLE crankshaft";
		description = "";
		brand_new_prestige_value = 51.61;

		value = tHUF2USD(53.121);
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		maxRPM = 9500.0;

		stroke = 113.0;
		main_bearing_diam = 45.05;
		con_bearing_diam = 45.05;

		inertia = kgToInertia(18.0);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_MC)
		{
			if (the_car.model == MC_models.MODEL_GTLE)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000100r, "MC_flywheel", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000106r, "MC_GLE_connecting_rods", desc );
			}
		}
	}
}
