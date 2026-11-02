package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_FR_door extends FrontDoor
{
	public Enula_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR passenger's door";
		description = "The stock passenger's door for the WR models.";

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
			addPart( cars.racers.enula:0x00000107r, "FR window", actcolor, optical, power );
			addPart( cars.racers.enula:0x0000013Ar, "R mirror", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.enula:0x00000107r, "FR window", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.enula:0x0000013Ar, "R mirror", actcolor, optical, power );
		}

		// parts that have multiple appearance //
		if ( optical <= 1.0 )
		{
		} else
		{

		}

	}
}
