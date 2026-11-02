package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Baiern_Kraftwerk_2_5_flywheel extends Flywheel
{
	public Baiern_Kraftwerk_2_5_flywheel( int id )
	{
		super( id );
		name = "Baiern Kraftwerk 2.5 flywheel";
		description = "This flywheel is heavy - 10.0 kgs (22.0 pounds) - and has almost infinite lifetime. Unfortunately this is due to its thickness and the steel based material on its relatively small contact surface (280 sq.cm = 42.5 sq.inch). \n These alltogether mean the clutch can easily slip if the engine is too powerful. This is the weak point of the Baiern engines. As Emer Japanese-German Automobiles used the Baiern Kraftwerk as the base of their Nonus Street GT engines, most parts are compatible with the Baiern drive-train.";

		value = tHUF2USD(41);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(320000.0));

		clutch_slot_ID = 36;

		maxRPM = 9000.0;
		inertia = kgToInertia(10.0);

		check4warnings();
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_BAIERN)
		{
			if (the_car.model == Baiern_models.MODEL_COUPESPORT)
			{
				addPart( parts.engines.Baiern_Emer:0x00000043r, "Baiern_Kraftwerk_clutch", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_COUPESPORT_TURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000043r, "Baiern_Kraftwerk_clutch", desc );
			}
			return;
		}

		addPart( parts.engines.Baiern_Emer:0x00000043r, "Baiern_Kraftwerk_clutch", desc );
	}
}
