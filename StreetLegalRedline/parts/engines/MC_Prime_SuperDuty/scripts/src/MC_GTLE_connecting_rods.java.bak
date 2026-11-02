package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_GTLE_connecting_rods extends ConnectingRod
{
	public MC_GTLE_connecting_rods( int id )
	{
		super( id );
		name = "MC GTLE connecting rods";
		description = "";
		brand_new_prestige_value = 71.68;

		value = tHUF2USD(73.779);
		setMaxWear(kmToMaxWear(443000.0));

		maxRPM = 9250.0;

		piston_slot_ID = 42;

		length = 150.00;

		inertia = kgToInertia(8*0.750);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_MC)
		{
			if (the_car.model == MC_models.MODEL_GTLE)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000102r, "MC_GTB_pistons", desc );
			}
		}
	}
}
