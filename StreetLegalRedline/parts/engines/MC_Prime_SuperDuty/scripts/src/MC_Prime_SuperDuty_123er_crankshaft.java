package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_123er_crankshaft extends Crankshaft
{
	public MC_Prime_SuperDuty_123er_crankshaft( int id )
	{
		super( id );
		name = "Prime DLH long stroker crankshaft";
		description = "";
		brand_new_prestige_value = 51.61;

		value = tHUF2USD(93.121);
		setMaxWear(kmToMaxWear(526000.0));

		maxRPM = 9000.0;

		con_rod_slot_ID = 40;
		flywheel_slot_ID = 6;

		stroke = 123.5;
		main_bearing_diam = 45.05;
		con_bearing_diam = 45.05;

		inertia = kgToInertia(15.8);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x00000083r, "flywheel", desc );
		addPart( parts.engines.MC_Prime_SuperDuty:0x0000004Cr, "104x123er connecting rods", desc );
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
