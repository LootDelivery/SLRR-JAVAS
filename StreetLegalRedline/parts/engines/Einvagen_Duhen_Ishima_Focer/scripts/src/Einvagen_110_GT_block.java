package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_110_GT_block extends Block_Inline_OHC
{
	public Einvagen_110_GT_block( int id )
	{
		super( id );
		name = "Einvagen 110 GT/GTK block";
		description = "";
		brand_new_prestige_value = 55.70;
 
		value = tHUF2USD(60);
		setMaxWear(kmToMaxWear(210000.0));

		bore = 80.0;

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
			if (the_car.model == Einvagen_models.MODEL_110_GT)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D3r, "Einvagen_110_GT_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Ar, "Einvagen_crankshaft_bearing_bridge", desc );
				if (desc.power > 1.5)
				{
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000057r, "Einvagen_PerPro_GTA_transmission", desc );
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000062r, "Einvagen_PerPro_GTA_transmission_RWD_extension", desc );
				}
				else
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D6r, "Einvagen_110_GT_transmission", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000049r, "Einvagen_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Ar, "Einvagen_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D8r, "Einvagen_110_GT_cylinder_head", desc );
			}
			else
			if (the_car.model == Einvagen_models.MODEL_110_GTK)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D3r, "Einvagen_110_GT_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Ar, "Einvagen_crankshaft_bearing_bridge", desc );
				if (desc.power > 1.3)
				{
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000057r, "Einvagen_PerPro_GTA_transmission", desc );
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000062r, "Einvagen_PerPro_GTA_transmission_RWD_extension", desc );
				}
				else
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D7r, "Einvagen_110_GTK_transmission", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000049r, "Einvagen_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Ar, "Einvagen_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D8r, "Einvagen_110_GT_cylinder_head", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000047r, "Einvagen_GTK_9psi_supercharger", desc );
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
