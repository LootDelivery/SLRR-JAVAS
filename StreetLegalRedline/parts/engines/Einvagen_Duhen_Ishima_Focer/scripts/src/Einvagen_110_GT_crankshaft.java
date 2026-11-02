package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_110_GT_crankshaft extends Crankshaft
{
	public Einvagen_110_GT_crankshaft( int id )
	{
		super( id );
		name = "Einvagen 110 GT/GTK crankshaft";
		description = "";
		brand_new_prestige_value = 20.12;

		value = tHUF2USD(50);
		setMaxWear(kmToMaxWear(311000.0));

		con_rod_slot_ID = 42;
		flywheel_slot_ID = 2;

		stroke = 90.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 7250;
		inertia = kgToInertia(10.3);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EINVAGEN)
		{
			if (the_car.model == Einvagen_models.MODEL_110_GT)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Er, "Einvagen_129er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x0000000Ar, "flywheel 2", desc );
				addPart( parts.engines.Baiern_Emer:0x00000043r, "Baiern_Kraftwerk_clutch", desc );
			}
			else
			if (the_car.model == Einvagen_models.MODEL_110_GTK)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000110r, "Einvagen_119er_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x00000045r, "flywheel", desc );
				addPart( parts.engines.Baiern_Emer:0x00000043r, "Baiern_Kraftwerk_clutch", desc );
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
