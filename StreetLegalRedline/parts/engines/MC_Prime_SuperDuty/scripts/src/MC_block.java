package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.block.block_vee.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_block extends Block_Vee_OHC
{
	public MC_block( int id )
	{
		super( id );
		name = "MC GT engine block";
		description = "";

		brand_new_prestige_value = 69.86;
		value = tHUF2USD(354.141);
		setMaxWear(kmToMaxWear(420000.0));

		bore = 107.0;

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
		RPM_limit	= 6500;

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

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_HAULER_S_HEAVEN)
		{
			if (the_car.model == Hauler_s_models.MODEL_SUPERDUTY_500)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FEr, "MC_crankshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000100r, "MC_flywheel", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FFr, "MC_connecting_rods", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000103r, "MC_clutch", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000101r, "MC_pistons", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Br, "SuperDuty_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000095r, "SuperDuty_oil_pan", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000ADr, "SuperDuty_500_H4L_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000AFr, "SuperDuty_500_H4R_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Ar, "SuperDuty_DOHC_camshaft_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000096r, "SuperDuty_alternator", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000097r, "SuperDuty_alternator_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000104r, "MC_GT_transmission", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B0r, "SuperDuty_L_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000C7r, "MC_L_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000003r, "MC_L_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BBr, "SuperDuty_L_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BDr, "SuperDuty_L_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B2r, "SuperDuty_R_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FDr, "MC_R_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FCr, "MC_R_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BAr, "SuperDuty_R_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BCr, "SuperDuty_R_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x00000088r, "supercharger driver pulley", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BEr, "SuperDuty_Extra_750_intake_manifold", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B8r, "SuperDuty_E750_supercharger", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000087r, "roots type supercharger drive belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A3r, "SuperDuty_500_carburetors", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A5r, "SuperDuty_airbox", desc );
			}
			else
			if (the_car.model == Hauler_s_models.MODEL_SUPERDUTY_EXTRA_750)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FEr, "MC_crankshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000100r, "MC_flywheel", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FFr, "MC_connecting_rods", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000103r, "MC_clutch", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000101r, "MC_pistons", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Br, "SuperDuty_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000095r, "SuperDuty_oil_pan", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000ADr, "SuperDuty_500_H4L_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000AFr, "SuperDuty_500_H4R_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Ar, "SuperDuty_DOHC_camshaft_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000096r, "SuperDuty_alternator", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000097r, "SuperDuty_alternator_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000099r, "SuperDuty_Extra_750_transmission", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B0r, "SuperDuty_L_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000C7r, "MC_L_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000003r, "MC_L_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BBr, "SuperDuty_L_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BDr, "SuperDuty_L_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B2r, "SuperDuty_R_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FDr, "MC_R_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FCr, "MC_R_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BAr, "SuperDuty_R_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BCr, "SuperDuty_R_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x00000088r, "supercharger driver pulley", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BEr, "SuperDuty_Extra_750_intake_manifold", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B8r, "SuperDuty_E750_supercharger", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000087r, "roots type supercharger drive belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A3r, "SuperDuty_500_carburetors", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A5r, "SuperDuty_airbox", desc );
			}
		}
		else
		if (the_car.make == the_car.MAKE_MC)
		{
			if (the_car.model == MC_models.MODEL_GT)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FEr, "MC_crankshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Br, "SuperDuty_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000095r, "SuperDuty_oil_pan", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000ADr, "SuperDuty_500_H4L_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000AFr, "SuperDuty_500_H4R_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Ar, "SuperDuty_DOHC_camshaft_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A1r, "SuperDuty_500_intake_manifold", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000096r, "SuperDuty_alternator", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000097r, "SuperDuty_alternator_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000104r, "MC_GT_transmission", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B0r, "SuperDuty_L_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000C7r, "MC_L_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000003r, "MC_L_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BBr, "SuperDuty_L_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BDr, "SuperDuty_L_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B2r, "SuperDuty_R_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FDr, "MC_R_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FCr, "MC_R_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BAr, "SuperDuty_R_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BCr, "SuperDuty_R_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A3r, "SuperDuty_500_carburetors", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A5r, "SuperDuty_airbox", desc );
			}
			else
			if (the_car.model == MC_models.MODEL_GTB)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FEr, "MC_crankshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Br, "SuperDuty_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000095r, "SuperDuty_oil_pan", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000ADr, "SuperDuty_500_H4L_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000AFr, "SuperDuty_500_H4R_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Ar, "SuperDuty_DOHC_camshaft_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BEr, "SuperDuty_Extra_750_intake_manifold", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000096r, "SuperDuty_alternator", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000097r, "SuperDuty_alternator_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000104r, "MC_GT_transmission", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B0r, "SuperDuty_L_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000C7r, "MC_L_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000003r, "MC_L_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BBr, "SuperDuty_L_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BDr, "SuperDuty_L_cylinder_head_cover", desc );


				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B2r, "SuperDuty_R_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FDr, "MC_R_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000FCr, "MC_R_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BAr, "SuperDuty_R_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BCr, "SuperDuty_R_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A3r, "SuperDuty_500_carburetors", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A5r, "SuperDuty_airbox", desc );
			}
			else
			if (the_car.model == MC_models.MODEL_GTLE)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000105r, "MC_GTLE_crankshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Br, "SuperDuty_crankshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000095r, "SuperDuty_oil_pan", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000ADr, "SuperDuty_500_H4L_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000AFr, "SuperDuty_500_H4R_cylinder_head", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x0000009Ar, "SuperDuty_DOHC_camshaft_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BEr, "SuperDuty_Extra_750_intake_manifold", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000096r, "SuperDuty_alternator", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000097r, "SuperDuty_alternator_drive_belt", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000107r, "MC_GTLE_transmission", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B0r, "SuperDuty_L_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B3r, "SuperDuty_L_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B4r, "SuperDuty_L_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BBr, "SuperDuty_L_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BDr, "SuperDuty_L_cylinder_head_cover", desc );


				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B2r, "SuperDuty_R_exhaust_header", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B5r, "SuperDuty_R_intake_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000B7r, "SuperDuty_R_exhaust_camshaft", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BAr, "SuperDuty_R_camshaft_bearing_bridge", desc );
				addPart( parts.engines.MC_Prime_SuperDuty:0x000000BCr, "SuperDuty_R_cylinder_head_cover", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A3r, "SuperDuty_500_carburetors", desc );

				addPart( parts.engines.MC_Prime_SuperDuty:0x000000A5r, "SuperDuty_airbox", desc );
			}
		}
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
