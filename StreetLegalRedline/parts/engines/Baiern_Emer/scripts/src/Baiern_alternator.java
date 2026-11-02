package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Baiern_alternator extends EnginePart
{
	public Baiern_alternator( int id )
	{
		super( id );
		name = "Baiern alternator";
		description = "This part generates the electrical power needed for igniting the air fuel mixture in the engine. It is driven by a belt that connects to the crankshaft. \n In short race conditions you may dismount this part to produce some more horsepower because the battery holds enough charge for ignition, but only for some minutes.";

		value = tHUF2USD(19);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(300000.0));

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
				addPart( parts.engines.Baiern_Emer:0x00000048r, "Baiern_alternator_drive_belt", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_COUPESPORT_TURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000048r, "Baiern_alternator_drive_belt", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_COUPESPORT_GT_III)
			{
				addPart( parts.engines.Baiern_Emer:0x00000048r, "Baiern_alternator_drive_belt", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_DEVILSPORT)
			{
				addPart( parts.engines.Baiern_Emer:0x00000048r, "Baiern_alternator_drive_belt", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_DEVILSPORT_TURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000048r, "Baiern_alternator_drive_belt", desc );
			}
			else
			if (the_car.model == Baiern_models.MODEL_DEVILSPORT_BITURBO)
			{
				addPart( parts.engines.Baiern_Emer:0x00000048r, "Baiern_alternator_drive_belt", desc );
			}
		}
	}

	public String isDynoable()
	{
		Part p;

		p = partOnSlot( 42 );
		if (!p)
			return "the alternator is missing the drive belt.";

		return super.isDynoable();
	}
}
