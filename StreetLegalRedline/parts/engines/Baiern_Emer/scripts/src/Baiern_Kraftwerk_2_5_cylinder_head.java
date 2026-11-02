package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;
 

public class Baiern_Kraftwerk_2_5_cylinder_head extends DOHC_CylinderHead
{
	public Baiern_Kraftwerk_2_5_cylinder_head( int id )
	{
		super( id );
		name = "Baiern Kraftwerk 2.5 cylinder head";
		description = "This head uses 4 valves for each 6 cylinders supported with long and strong titanium valve springs to let you choose valve lifts up to 25.4 mm (1.0 inch)! \n The combustion chamber has a 20.7 mm (0.82 inch) high dome. The valve head diameters are 30.0 mm (1.18 inch) on the intake side and 27.0 mm (1.06 inch) on the exhaust side.";

		value = tHUF2USD(6*25+210);
		brand_new_prestige_value = 48.54;
		setMaxWear(kmToMaxWear(317000.0));

		intake_manifold_slot_ID = 11;
		exhaust_header_slot_ID = 13;
		camshaft_bearing_slot_ID = 24;
		cover_slot_ID = 18;

		exhaust_camshaft_slot_ID = 4;
		intake_camshaft_slot_ID = 5;

		intake_valve_diam = 31.0;
		number_of_intake_valves_per_cylinder = 2.0;
		exhaust_valve_diam = 29.5;
		number_of_exhaust_valves_per_cylinder = 2.0;

		cc_dome_safe_clearance = 18.7;
		maxRPM = 20000.0;
		inertia = kgToInertia(6*0.3);

		T_loss = 80.0;
		Vmin = 80.74; // in cc //

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_BAIERN)
		{
			if (the_car.model == Baiern_models.MODEL_COUPESPORT)
			{
				addPart( parts.engines.Baiern_Emer:0x00000059r, "Baiern_Kraftwerk_2_5_exhaust_camshaft", desc );
				addPart( parts.engines.Baiern_Emer:0x0000005Ar, "Baiern_Kraftwerk_2_5_intake_camshaft", desc );
				addPart( parts.engines.Baiern_Emer:0x00000058r, "Baiern_camshaft_bearing_bridge", desc );
				addPart( parts.engines.Baiern_Emer:0x0000004Fr, "Baiern_Kraftwerk_2_5_cylinder_head_cover", desc );
				addPart( parts.engines.Baiern_Emer:0x00000047r, "Baiern_camshaft_drive_belt", desc );
				addPart( parts.engines.Baiern_Emer:0x0000004Ar, "Baiern_Kraftwerk_2_5_intake_manifold", desc );
				addPart( parts.engines.Baiern_Emer:0x0000004Cr, "Baiern_Kraftwerk_2_5_exhaust_header", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_COUPESPORT_TURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000059r, "Baiern_Kraftwerk_2_5_exhaust_camshaft", desc );
				addPart( parts.engines.Baiern_Emer:0x0000005Ar, "Baiern_Kraftwerk_2_5_intake_camshaft", desc );
				addPart( parts.engines.Baiern_Emer:0x00000058r, "Baiern_camshaft_bearing_bridge", desc );
				addPart( parts.engines.Baiern_Emer:0x00000076r, "Baiern_Kraftwerk_2_5_Turbo_cylinder_head_cover", desc );
				addPart( parts.engines.Baiern_Emer:0x00000047r, "Baiern_camshaft_drive_belt", desc );
				addPart( parts.engines.Baiern_Emer:0x0000004Ar, "Baiern_Kraftwerk_2_5_intake_manifold", desc );
				addPart( parts.engines.Baiern_Emer:0x0000007Br, "Baiern_Kraftwerk_Turbo_exhaust_header", desc );
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 22 );
		if (!p)
			return "the engine is missing the camshaft drive belt.";

		return super.isDynoable();
	}
}
