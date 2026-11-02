package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class Baiern_88er_crankshaft extends Crankshaft
{
	public Baiern_88er_crankshaft( int id )
	{
		super( id );
		name = "Baiern Devils 6SFi 3.6 crankshaft";
		description = "A heavy - 12.3 kgs (27.1 pounds) - and ultra strong 88.0 mm (3.46 inch) stroker dinamically balanced shaft matching the bearing measures of the Baiern Kraftwerk crank to assure compatibility and tunging capability. As this crankshaft is so strong, it's weight can be reduced by dipping some balancer - about 3.5 kgs (7.7 pounds) - to maintain about 9000 peak RPM, but the stock 8000 peak should be enough for almost everyone, and you also keep durability. SL Tuners offers a full titanium replacement for this part but that's much more expensive.";

		value = tHUF2USD(49);
		brand_new_prestige_value = 84.30;
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 9;
		flywheel_slot_ID = 37;

		stroke = 88.0;
		main_bearing_diam = 0.0;
		con_bearing_diam = 0.0;

		maxRPM = 9000.0;
		inertia = kgToInertia(12.300);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_BAIERN)
		{
			if (the_car.model == Baiern_models.MODEL_COUPESPORT_GT_III)
			{
				addPart( parts.engines.Baiern_Emer:0x00000056r, "Baiern_Devils_6SFi_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x0000000Ar, "Baiern_Devils_6SFi_3_6_flywheel", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_DEVILSPORT)
			{
				addPart( parts.engines.Baiern_Emer:0x00000056r, "Baiern_Devils_6SFi_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x0000000Ar, "Baiern_Devils_6SFi_3_6_flywheel", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_DEVILSPORT_TURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000056r, "Baiern_Devils_6SFi_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x0000000Ar, "Baiern_Devils_6SFi_3_6_flywheel", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_DEVILSPORT_BITURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000056r, "Baiern_Devils_6SFi_connecting_rods", desc );
				addPart( parts.engines.Baiern_Emer:0x0000000Ar, "Baiern_Devils_6SFi_3_6_flywheel", desc );
			}
		}
	}
}
