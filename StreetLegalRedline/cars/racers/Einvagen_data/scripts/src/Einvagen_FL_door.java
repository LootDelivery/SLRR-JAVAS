package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FL_door extends FrontDoor
{
	public Einvagen_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT driver's door";
		description = "The stock driver's door for the GT models.";

		value = tHUF2USD(72.323);
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
			addPart( cars.racers.einvagen:0x000000B2r, "FL window", actcolor, optical, power );
			addPart( cars.racers.einvagen:0x000000BBr, "L mirror", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.einvagen:0x000000B2r, "FL window", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.einvagen:0x000000BBr, "L mirror", actcolor, optical, power );
		}
	}
}
