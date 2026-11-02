package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_RR_door extends RearDoor
{
	public Enula_RR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR rear right door";
		description = "The stock rear right door for the street-legal WR models.";

		value = tHUF2USD(130.234);
		brand_new_prestige_value = 41.47;
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.enula:0x00000118r, "RR window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.enula:0x00000118r, "RR window", actcolor, optical, power );
		}

		// parts that have multiple appearance //
		if ( optical <= 1.0 )
		{
		} else
		{

		}

	}
}
