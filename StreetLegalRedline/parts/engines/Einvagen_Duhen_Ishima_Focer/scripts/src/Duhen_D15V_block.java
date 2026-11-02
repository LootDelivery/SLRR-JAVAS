package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_inline.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_D15V_block extends Block_Inline_OHC
{
	public Duhen_D15V_block( int id )
	{
		super( id );
		name = "Duhen D15V block";
		description = "This is the stock block of the SunStrip 1.5DVC engine. This metal is bored to 80.8 mm (3.18 inch) and supports a maximum stroke of about 90.0 mm (3.54 inch) depending on piston and connecting rod selection, but the default stroke is 73.0 mm (2.87 inch) to let the engine rev high to get the most out of DVC.";

		value = tHUF2USD(39);
		brand_new_prestige_value = 55.70;
		setMaxWear(kmToMaxWear(240000.0));

		bore = 80.8;

		crankshaft_slot_ID = 40;
		crankshaft_bearing_slot_ID = 97;
		transmission_slot_ID = 1;
		oil_pan_slot_ID = 37;
		cylinder_head_slot_ID = 47;

		cylinder_length_from_top = 123.66;
		crank_center_to_cylinder_top = 236.37;

		rpm_idle = 1000.0;
		time_spark_min	= sparkAngleTo4cycleTime(321.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 3750;
		time_spark_RPM1	= 7750;
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

		if (the_car.make == the_car.MAKE_DUHEN)
		{
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_1_5_DVC)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000083r, "Duhen_73er_crankshaft", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BEr, "Duhen_crankshaft_bearing_bridge", desc );

				if (desc.power < 1.5)
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BFr, "Duhen_D15V_transmission", desc );
				else
				{
					Transmission tr = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000CAr, "Duhen_D20CV_transmission", desc );
					if (desc.power > 1.8)
						tr.end_ratio = (desc.power-1.8)/0.2*(2.900-3.366)+3.366;
					else
						tr.end_ratio = 2.900;
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000061r, "Duhen_D20CV_transmission_RWD_extension", desc );
				}

				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C0r, "Duhen_oil_pan", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C1r, "Duhen_alternator", desc );
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000BCr, "Duhen_80er_cylinder_head", desc );
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
