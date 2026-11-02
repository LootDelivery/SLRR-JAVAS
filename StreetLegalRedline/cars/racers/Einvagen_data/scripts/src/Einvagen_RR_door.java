package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_RR_door extends RearDoor
{
	public Einvagen_RR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT rear right door";
		description = "The stock rear right door for the GT models.";

		value = tHUF2USD(45.435);
		brand_new_prestige_value = 23.25;
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.einvagen:0x000000CAr, "RR window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.einvagen:0x000000CAr, "RR window", actcolor, optical, power );
		}

		// parts that have multiple appearance //
		if ( optical <= 1.0 )
		{
		} else
		{

		}

	}
}
