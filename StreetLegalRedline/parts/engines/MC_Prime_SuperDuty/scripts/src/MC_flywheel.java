package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class MC_flywheel extends Flywheel
{
	public MC_flywheel( int id )
	{
		super( id );
		name = "MC GT/GT-B/GTLE flywheel";
		description = "";
		brand_new_prestige_value = 57.34;

		value = tHUF2USD(59.023);
		setMaxWear(kmToMaxWear(760000.0));

		maxRPM = 9000.0;

		clutch_slot_ID = 4;

		inertia = kgToInertia(20.0);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_MC)
		{
			if (the_car.model == MC_models.MODEL_GT)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000103r, "MC_clutch", desc );
			}
			else
			if (the_car.model == MC_models.MODEL_GTB)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000103r, "MC_clutch", desc );
			}
			else
			if (the_car.model == MC_models.MODEL_GTLE)
			{
				addPart( parts.engines.MC_Prime_SuperDuty:0x00000103r, "MC_clutch", desc );
			}
		}
	}
}
