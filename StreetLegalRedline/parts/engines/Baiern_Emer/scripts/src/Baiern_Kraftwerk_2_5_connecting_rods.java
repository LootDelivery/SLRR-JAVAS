package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;

public class Baiern_Kraftwerk_2_5_connecting_rods extends ConnectingRod
{
	public Baiern_Kraftwerk_2_5_connecting_rods( int id )
	{
		super( id );
		name = "Baiern Kraftwerk 2.5 connecting rods";
		description = "These steel rods weigh 500 grams (17.6 ounces) per piece and come in a pack of 6. \n The length is 143.0 mm (5.63 inch) so you can use it with both short and high pistons from 50.0 mm (1.97 inch) to 90.0 mm (3.54 inch).";

		value = tHUF2USD(6*4);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(278000.0));

		piston_slot_ID = 39;

		length = 142.5;

		maxRPM = 10000.0;
		inertia = kgToInertia(6*0.500);

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
				addPart( parts.engines.Baiern_Emer:0x00000054r, "Baiern_Kraftwerk_2_5_HC_pistons", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_COUPESPORT_TURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000054r, "Baiern_Kraftwerk_2_5_HC_pistons", desc );
			}
		}
	}
}
