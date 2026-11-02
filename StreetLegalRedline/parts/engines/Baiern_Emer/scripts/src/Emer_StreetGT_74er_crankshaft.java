package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Emer_StreetGT_74er_crankshaft extends Crankshaft
{
	public Emer_StreetGT_74er_crankshaft( int id )
	{
		super( id );
		name = "Emer StreetGT crankshaft";
		description = "";
		brand_new_prestige_value = 28.81;

		value = tHUF2USD(49);
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 74.5;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(12.000);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EMER)
		{
			if (the_car.model == Emer_models.MODEL_NONUS_STREET_GT)
			{
				addPart( parts.engines.Baiern_Emer:0x00000094r, "Emer_Nonus_146er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x0000000Ar, "Baiern_Devils_6SFi_3_6_flywheel", desc );
					addPart( parts.engines.Baiern_Emer:0x00000043r, "Baiern_Kraftwerk_clutch", desc ); // utolagos felszereles, hogy ne kelljen elronditani a Baiern motor addStockParts-at - Sala //
			}
		}
	}
}
