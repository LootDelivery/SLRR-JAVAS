package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_block extends Block_Inline_OHC
{
	public Einvagen_PerPro_GTA_block( int id )
	{
		super( id );
		name = "Einvagen PerPro GTA block";
		description = "This year is the 25th anniversary for the Einvagen GT series, so the company decided to let it's local tuner company - Einvagen PerPro - design an ultimate GT designated as GTA for the anniversary. This powersource is built into these models by the factory. Bored to 93.0 mm (3.66 inch) and supports a maximum stroke of about 90.0 mm (3.54 inch) depending on piston and connecting rod selection.";

		value = tHUF2USD(130);
		brand_new_prestige_value = 55.70;
		setMaxWear(kmToMaxWear(300000.0));

		bore = 93.0;

		crankshaft_slot_ID = 40;
		crankshaft_bearing_slot_ID = 97;
		transmission_slot_ID = 1;
		oil_pan_slot_ID = 37;
		cylinder_head_slot_ID = 47;

		cylinder_length_from_top = 123.66;
		crank_center_to_cylinder_top = 236.37;

		rpm_idle = 850.0;
		time_spark_min	= sparkAngleTo4cycleTime(315.0);
		time_spark_inc	= sparkAngleTo4cycleTime(355.0)-time_spark_min;
		time_spark_RPM0	= 2250;
		time_spark_RPM1	= 5500;
		RPM_limit	= 6500;

		cylinders	= 4;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		getCar_LocalVersion();

		if (the_car)
		{
			SfxTable tab;
			if (tab = the_car.getSfxTable(0))
			{
				tab.clear();
				
				tab.addItem(new ResourceRef(parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000A2r), 1500.0,  500.0, 6500.0, 0.42, 0.52);
				tab.addItem(new ResourceRef(parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000A9r), 5000.0, 3000.0,18000.0, 0.62, 1.00);		
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000Acr),  900.0,  500.0, 1350.0, 1.0, 1.0);
				tab.addItem(new ResourceRef(parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000Aer), 1500.0, 1000.0, 4500.0, 1.0, 1.0);
				tab.addItem(new ResourceRef(parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000B3r), 5500.0, 3000.0,18000.0, 1.0, 1.0);
				the_car.setSfxExhaustMinVol(0.9);

			}
		}
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EINVAGEN)
		{
			if (the_car.model == Einvagen_models.MODEL_140_GTA)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Dr, "Einvagen_PerPro_GTA_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Ar, "Einvagen_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000057r, "Einvagen_PerPro_GTA_transmission", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000049r, "Einvagen_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Ar, "Einvagen_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Cr, "Einvagen_PerPro_GTA_cylinder_head", desc );
				if (desc.power > 1.8)
				{
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000047r, "Einvagen_GTK_9psi_supercharger", desc );
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000059r, "Einvagen_supercharger_drive_belt", desc );
				}
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 14 );
		if (!p)
			return "the engine is missing the alternator.";

		return super.isDynoable();
	}
}
