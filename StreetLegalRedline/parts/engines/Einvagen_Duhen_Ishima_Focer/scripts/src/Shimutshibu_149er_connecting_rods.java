package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Shimutshibu_149er_connecting_rods extends ConnectingRod
{
	public Shimutshibu_149er_connecting_rods( int id )
	{
		super( id );
		name = "Shimutshibu Focer connecting rods";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*17);
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 140.0;

		maxRPM = 9250;
		inertia = kgToInertia(4*0.330);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_SHIMUTSHIBU)
		{
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_200)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F7r, "Shimutshibu_95er_HC_pistons", desc );
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_300)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F8r, "Shimutshibu_95er_LC_pistons", desc );
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_WRC)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F8r, "Shimutshibu_95er_LC_pistons", desc );
			}
		}
	}
}
