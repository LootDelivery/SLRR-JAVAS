package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Duhen_139er_connecting_rods extends ConnectingRod
{
	public Duhen_139er_connecting_rods( int id )
	{
		super( id );
		name = "Duhen D22V connecting rods";

		description = "These connecting rods are built into the Duhen D22V engines. You get a pack of four high-tech rods for your money that can be used safely up to 9250 RPM.";

		value = tHUF2USD(4*17);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(370000.0));

		piston_slot_ID = 44;

		length = 142.5;

		maxRPM = 9250;
		inertia = kgToInertia(4*0.330);
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_DUHEN)
		{
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_2_2_DVC)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000008Br, "Duhen_93er_HC_pistons", desc );
			}
		}
	}
}
