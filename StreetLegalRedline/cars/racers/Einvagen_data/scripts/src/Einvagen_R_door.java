package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;



public class Einvagen_R_door extends HatchDoor
{
	public Einvagen_R_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT hatch door";
		description = "The stock hatch door for the GT models.";

		value = tHUF2USD(100.973);
		brand_new_prestige_value = 22.80;
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.einvagen:0x000000C3r, "R windshield", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.einvagen:0x000000C3r, "R windshield", actcolor, optical, power );
		}
	}
}
