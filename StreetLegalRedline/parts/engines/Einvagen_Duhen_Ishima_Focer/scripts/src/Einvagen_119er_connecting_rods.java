package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_119er_connecting_rods extends ConnectingRod
{
	public Einvagen_119er_connecting_rods( int id )
	{
		super( id );
		name = "Einvagen 110 GTK connecting rods";

		description = "These connecting rods are built into the Einvagen 110 GTK supercharged engines. You get a pack of four rods for your money. Can be used safely up to 7500 RPM.";

		value = tHUF2USD(4*11);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(271000.0));

		piston_slot_ID = 44;

		length = 125.0;

		maxRPM = 7500;
		inertia = kgToInertia(4*0.445);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EINVAGEN)
		{
			if (the_car.model == Einvagen_models.MODEL_110_GTK)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D5r, "Einvagen_110_GTK_pistons", desc );
			}
		}
	}
}
