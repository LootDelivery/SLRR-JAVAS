package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_D22V_block extends Block_Inline_OHC
{
	static int ST_INDIVIDUAL = -1;
	static int ST_EURO = 0;
	static int ST_LONG = 1;
	static int ST_JAPO = 2;
	int	setup_type = ST_INDIVIDUAL;

	public Duhen_D22V_block( int id )
	{
		super( id );
		name = "Duhen D22V block";
		description = "This is the stock block of the Duhen D22V and Duhen Racing D20CV engines. This metal is bored to 93.0 mm (3.66 inch) and supports a maximum stroke of about 90.0 mm (3.54 inch) depending on piston and connecting rod selection, but the default stroke is 73.0 mm (2.87 inch) to let the engine rev high to get the most out of DVC.";

		value = tHUF2USD(49);
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

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(328.0);
		time_spark_inc	= sparkAngleTo4cycleTime(370.0)-time_spark_min;
		time_spark_RPM0	= 3250;
		time_spark_RPM1	= 10000;
		RPM_limit	= 7500;

		cylinders	= 4;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		dynodata.cylinders	= 4;

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

		if (the_car.make == the_car.MAKE_DUHEN)
		{
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_2_2_DVC)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BBr, "Duhen_80er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BEr, "Duhen_crankshaft_bearing_bridge", desc );

				if (desc.power < 1.3)
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000CDr, "Duhen_D22V_transmission", desc );
				else
				{
					Transmission tr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000CAr, "Duhen_D20CV_transmission", desc );
					if (desc.power > 1.7)
						tr.end_ratio = (desc.power-1.7)/0.3*(3.366-2.666)+3.366;
					else
						tr.end_ratio = 3.366;
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000061r, "Duhen_D20CV_transmission_RWD_extension", desc );
				}

				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C0r, "Duhen_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C1r, "Duhen_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BAr, "Duhen_93er_cylinder_head", desc );
			}
			else
			if (the_car.model == Duhen_models.MODEL_RACING_SUNSTRIP_2_0_CDVC)
			{
				rpm_idle = 1250.0;
				time_spark_min	= sparkAngleTo4cycleTime(316.0);
				time_spark_inc	= sparkAngleTo4cycleTime(355.0)-time_spark_min;
				time_spark_RPM0	= 5750;
				time_spark_RPM1	= 8250;
				RPM_limit	= 9000;

				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000083r, "Duhen_73er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BEr, "Duhen_crankshaft_bearing_bridge", desc );

				Transmission tr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000CAr, "Duhen_D20CV_transmission", desc );
				if (desc.power > 1.5)
					tr.end_ratio = (desc.power-1.5)/0.3*(2.900-3.366)+3.366;
				else
					tr.end_ratio = 2.900;

				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C0r, "Duhen_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C1r, "Duhen_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BAr, "Duhen_93er_cylinder_head", desc );
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
