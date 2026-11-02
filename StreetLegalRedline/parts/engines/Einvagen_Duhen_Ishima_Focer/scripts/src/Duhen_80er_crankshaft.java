package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_80er_crankshaft extends Crankshaft
{
	public Duhen_80er_crankshaft( int id )
	{
		super( id );
		name = "Duhen D22V crankshaft";
		description = "A high-tech light - 7.9 kgs (17.4 pounds) - and very strong dinamically balanced 73.0 mm (2.87 inch) stroker crankshaft for most of the Duhen blocks. \n This shaft withstands 10000 peak RPM!";

		value = tHUF2USD(40);
		brand_new_prestige_value = 20.12;
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 80.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9750.0;
		inertia = kgToInertia(7.900);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_DUHEN)
		{
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_2_2_DVC)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000B0r, "Duhen_139er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x00000045r, "flywheel", desc );
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 4 );
		if (!p)
			return "the engine is missing the camshaft drive belt.";

		return super.isDynoable();
	}
}
