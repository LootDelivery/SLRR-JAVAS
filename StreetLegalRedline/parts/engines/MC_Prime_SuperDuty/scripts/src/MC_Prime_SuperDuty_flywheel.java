package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_flywheel extends Flywheel
{
	public MC_Prime_SuperDuty_flywheel( int id )
	{
		super( id );
		name = "Prime DLH flywheel";
		description = "";
		brand_new_prestige_value = 57.34;

		value = tHUF2USD(59.023);
		setMaxWear(kmToMaxWear(760000.0));

		maxRPM = 17000.0;

		clutch_slot_ID = 4;

		inertia = kgToInertia(13.0);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.MC_Prime_SuperDuty:0x00000084r, "clutch", desc );
	}
}
