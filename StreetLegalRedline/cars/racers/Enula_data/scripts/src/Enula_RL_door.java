package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_RL_door extends RearDoor
{
	public Enula_RL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR rear left door";
		description = "The stock rear left door for the street-legal WR models.";

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
			addPart( cars.racers.enula:0x00000117r, "RL window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.enula:0x00000117r, "RL window", actcolor, optical, power );
		}
	}
}
