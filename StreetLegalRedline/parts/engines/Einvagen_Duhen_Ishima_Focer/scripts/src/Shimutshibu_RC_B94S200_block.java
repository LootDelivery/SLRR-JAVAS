package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Shimutshibu_RC_B94S200_block extends Block_Inline_OHC
{
	public Shimutshibu_RC_B94S200_block( int id )
	{
		super( id );
		name = "Shimutshibu RC-B94S200 block";
		description = "";
		brand_new_prestige_value = 85.15;

		value = tHUF2USD(130);
		setMaxWear(kmToMaxWear(300000.0));

		bore = 94.0;

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
		time_spark_RPM1	= 7500;
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

		if (the_car.make == the_car.MAKE_SHIMUTSHIBU)
		{
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_200)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F5r, "Shimutshibu_72er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FBr, "Shimutshibu_crankshaft_bearing_bridge", desc );
				Transmission tranny = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FAr, "Shimutshibu_RC_T5600R1_transmission", desc );
				tranny.end_ratio = 3.955;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FCr, "Shimutshibu_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FDr, "Shimutshibu_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FEr, "Shimutshibu_RC_DDSA1C_cylinder_head", desc );
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_300)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F5r, "Shimutshibu_72er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FBr, "Shimutshibu_crankshaft_bearing_bridge", desc );
				Transmission tranny = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FAr, "Shimutshibu_RC_T5600R1_transmission", desc );
				tranny.end_ratio = 3.355;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FCr, "Shimutshibu_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FDr, "Shimutshibu_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FFr, "Shimutshibu_RC_DDSB3C_cylinder_head", desc );
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_WRC)
			{
				rpm_idle = 750.0;
				time_spark_min	= sparkAngleTo4cycleTime(336.0);
				time_spark_inc	= sparkAngleTo4cycleTime(365.0)-time_spark_min;
				time_spark_RPM0	= 3000;
				time_spark_RPM1	= 7250;
				RPM_limit	= 7500;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F5r, "Shimutshibu_72er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FBr, "Shimutshibu_crankshaft_bearing_bridge", desc );
				Transmission tranny = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FAr, "Shimutshibu_RC_T5600R1_transmission", desc );
				tranny.end_ratio = 2.955;
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FCr, "Shimutshibu_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FDr, "Shimutshibu_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000100r, "Shimutshibu_RC_DDSB8C_cylinder_head", desc );
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
