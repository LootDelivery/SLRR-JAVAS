package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_104er_engine_block extends Block_Vee_OHC
{
	public MC_Prime_SuperDuty_104er_engine_block( int id )
	{
		super( id );
		name = "Prime DLH engine block";
		description = "";
		brand_new_prestige_value = 69.86;

		value = tHUF2USD(206.582);
		setMaxWear(kmToMaxWear(620000.0));

		bore = 104.0;

		cylinder_length_from_top = 133.43;
		crank_center_to_cylinder_top = 280.60;

		crankshaft_slot_ID = 8;
		transmission_slot_ID = 5;
		crankshaft_bearing_slot_ID = 99;
		oil_pan_slot_ID = 9;

		L_cylinder_head_slot_ID = 45;
		R_cylinder_head_slot_ID = 46;
		intake_manifold_slot_ID = 14;

		rpm_idle = 900.0;
		time_spark_min	= sparkAngleTo4cycleTime(325.0);
		time_spark_inc	= sparkAngleTo4cycleTime(340.0)-time_spark_min;
		time_spark_RPM0	= 2500;
		time_spark_RPM1	= 6250;
		RPM_limit	= 8000;

		cylinders	= 8;

		check4warnings();
	}

	public void updatevariables()
	{
		super.updatevariables();

		if (the_car)
		{
			SfxTable tab;
			if (tab = the_car.getSfxTable(0))
			{
								tab.clear();
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000A0r),  900.0,  500.0, 1800.0, 0.42, 0.42);
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000A2r), 2000.0, 1000.0, 3000.0, 0.42, 0.52);
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000A4r), 3000.0, 2000.0, 5500.0, 0.62, 0.72);
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000A9r), 5500.0, 3500.0,18000.0, 0.82, 1.00);
			}

			if (tab = the_car.getSfxTable(1))
			{
				tab.clear();
			}

			if (tab = the_car.getSfxTable(2))
			{
				tab.clear();
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000ABr),  900.0*2,  750.0, 1350.0, 1.0, 1.0);
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000ACr), 1500.0*2, 1000.0, 2300.0, 1.0, 1.0);
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000AEr), 2500.0*2, 1600.0, 3500.0, 1.0, 1.0);
				tab.addItem(new ResourceRef(parts.engines.MC_Prime_SuperDuty:0x000000B1r), 3000.0*2, 2500.0,18000.0, 1.0, 1.0);
				the_car.setSfxExhaustMinVol(0.9);
			}
		}
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x0000003Er, "103er crankshaft", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x0000004Ar, "crankshaft bearing bridge", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000048r, "oil pan", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000040r, "L DOHC cylinder head", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000041r, "R DOHC cylinder head", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000043r, "DOHC camshaft drive belt", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x0000004Br, "intake manifold converter", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000047r, "alternator", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000049r, "alternator drive belt", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000089r, "transmission", desc );
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 20 );
		if (!p)
			return "the engine is missing the alternator.";

		return super.isDynoable();
	}
}
