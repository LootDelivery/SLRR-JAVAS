package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Ishima_129er_connecting_rods extends ConnectingRod
{
	public Ishima_129er_connecting_rods( int id )
	{
		super( id );
		name = "Ishima Enula WR SuperTurizmo connecting rods";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*17);
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 128.8;

		maxRPM = 9500;
		inertia = kgToInertia(4*0.330);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_ISHIMA)
		{
			if (the_car.model == Ishima_models.MODEL_ENULA_WR_SUPERTURIZMO)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E5r, "Ishima_93er_HC_pistons", desc );
			}
		}
	}
}
