package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Ishima_IshiBox_block extends Block_Inline_OHC
{
	public Ishima_IshiBox_block( int id )
	{
		super( id );
		name = "Ishima IshiBox block";
		description = "";
		brand_new_prestige_value = 85.15;

		value = tHUF2USD(130);
		setMaxWear(kmToMaxWear(300000.0));

		bore = 93.0;

		crankshaft_slot_ID = 40;
		crankshaft_bearing_slot_ID = 97;
		transmission_slot_ID = 1;
		oil_pan_slot_ID = 37;
		cylinder_head_slot_ID = 47;

		cylinder_length_from_top = 123.66;
		crank_center_to_cylinder_top = 236.37;

		rpm_idle = 750.0;
		time_spark_min	= sparkAngleTo4cycleTime(326.0);
		time_spark_inc	= sparkAngleTo4cycleTime(348.0)-time_spark_min;
		time_spark_RPM0	= 3000;
		time_spark_RPM1	= 9000;
		RPM_limit	= 7500;

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

		if (the_car.make == the_car.MAKE_ISHIMA)
		{
			if (the_car.model == Ishima_models.MODEL_ENULA_WRY)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000DEr, "Ishima_75er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E8r, "Ishima_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E1r, "Faktun_Group_Tran6_transmission", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E6r, "Ishima_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E7r, "Ishima_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E9r, "Ishima_WR_head_cylinder_head", desc );
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WRZ)
			{
				rpm_idle = 750.0;
				time_spark_min	= sparkAngleTo4cycleTime(326.0);
				time_spark_inc	= sparkAngleTo4cycleTime(348.0)-time_spark_min;
				time_spark_RPM0	= 1000;
				time_spark_RPM1	= 9000;
				RPM_limit	= 7500;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000DEr, "Ishima_75er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E8r, "Ishima_crankshaft_bearing_bridge", desc );
				Transmission tranny = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E1r, "Faktun_Group_Tran6_transmission", desc );
				tranny.end_ratio = 3.700;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E6r, "Ishima_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E7r, "Ishima_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E9r, "Ishima_WR_head_cylinder_head", desc );
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WR_SUPERTURIZMO)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E0r, "Ishima_90er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E8r, "Ishima_crankshaft_bearing_bridge", desc );
				Transmission tranny = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E1r, "Faktun_Group_Tran6_transmission", desc );
				tranny.end_ratio = 2.680;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E6r, "Ishima_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E7r, "Ishima_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E9r, "Ishima_WR_head_cylinder_head", desc );
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
