package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Shimutshibu_72er_crankshaft extends Crankshaft
{
	public Shimutshibu_72er_crankshaft( int id )
	{
		super( id );
		name = "Shimutshibu Focer RC200/300 crankshaft";
		description = "A high-tech light - 7.8 kgs (17.2 pounds) - and very strong dinamically balanced 72.0 mm (2.83 inch) stroker crankshaft for the Shimutshibu RC engines. \n This shaft withstands 8750 peak RPM!";

		value = tHUF2USD(30);
		brand_new_prestige_value = 30.76;
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 72.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 8750.0;
		inertia = kgToInertia(7.800);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_SHIMUTSHIBU)
		{
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_200)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F6r, "Shimutshibu_149er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x00000045r, "flywheel", desc );
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_300)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F6r, "Shimutshibu_149er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x00000045r, "flywheel", desc );
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_WRC)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F6r, "Shimutshibu_149er_connecting_rods", desc );
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
