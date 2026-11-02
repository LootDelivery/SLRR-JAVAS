package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Ishima_75er_crankshaft extends Crankshaft
{
	public Ishima_75er_crankshaft( int id )
	{
		super( id );
		name = "Ishima IshiBox 2.0 crankshaft";
		description = "A high-tech light - 7.5 kgs (16.5 pounds) - and very strong dinamically balanced 75.0 mm (2.95 inch) stroker crankshaft for the IshiBox 2.0 engines. \n This shaft withstands 10000 peak RPM!";

		value = tHUF2USD(38);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 75.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(7.500);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_ISHIMA)
		{
			if (the_car.model == Ishima_models.MODEL_ENULA_WRY)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E4r, "Ishima_146er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x00000045r, "flywheel", desc );
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WRZ)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E4r, "Ishima_146er_connecting_rods", desc );
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
