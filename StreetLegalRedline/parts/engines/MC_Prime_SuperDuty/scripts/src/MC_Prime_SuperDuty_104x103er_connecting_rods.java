package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_104x103er_connecting_rods extends ConnectingRod
{
	public MC_Prime_SuperDuty_104x103er_connecting_rods( int id )
	{
		super( id );
		name = "Prime DLH connecting rods";
		description = "";
		brand_new_prestige_value = 71.68;

		value = tHUF2USD(73.779);
		setMaxWear(kmToMaxWear(413000.0));

		maxRPM = 11000.0;

		piston_slot_ID = 42;

		length = 146.69+19.1-12;

		inertia = kgToInertia(8*0.450);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x00000056r, "104x103er HC pistons", desc );
	}
}
