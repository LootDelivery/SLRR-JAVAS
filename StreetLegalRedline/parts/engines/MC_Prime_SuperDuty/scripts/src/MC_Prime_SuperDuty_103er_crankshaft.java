package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_103er_crankshaft extends Crankshaft
{
	public MC_Prime_SuperDuty_103er_crankshaft( int id )
	{
		super( id );
		name = "Prime DLH crankshaft";
		description = "";
		brand_new_prestige_value = 51.61;

		value = tHUF2USD(53.121);
		setMaxWear(kmToMaxWear(526000.0));

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		maxRPM = 10000.0;

		stroke = 103.0;
		main_bearing_diam = 45.05;
		con_bearing_diam = 45.05;

		inertia = kgToInertia(15.0);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x00000083r, "flywheel", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x00000055r, "104x103er connecting rods", desc );
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 11 );
		if (!p)
			return "the engine is missing the camshaft drive belt.";

		p = partOnSlot( 3 );
		if (!p)
			return "the alternator is missing the drive belt.";

		return super.isDynoable();
	}
}
