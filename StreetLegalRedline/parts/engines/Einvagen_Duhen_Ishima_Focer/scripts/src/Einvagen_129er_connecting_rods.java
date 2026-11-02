package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_129er_connecting_rods extends ConnectingRod
{
	public Einvagen_129er_connecting_rods( int id )
	{
		super( id );
		name = "Einvagen 110 GT/PerPro 140 GTA connecting rods";

		description = "These connecting rods are built into the Einvagen 110 GT and PerPro 140 GTA engines. You get a pack of four rods for your money. Can be used safely up to 7250 RPM.";

		value = tHUF2USD(4*11);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(271000.0));

		piston_slot_ID = 44;

		length = 134.2;

		maxRPM = 7250;
		inertia = kgToInertia(4*0.450);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EINVAGEN)
		{
			if (the_car.model == Einvagen_models.MODEL_110_GT)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D4r, "Einvagen_110_GT_HC_pistons", desc );
			}
			else
			if (the_car.model == Einvagen_models.MODEL_140_GTA)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Cr, "Einvagen_PerPro_GTA_HC_pistons", desc );
			}
		}
	}
}
