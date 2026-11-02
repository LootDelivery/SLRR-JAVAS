package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_FL_door extends FrontDoor
{
	public Nonus_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus front left door";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(142.294);
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.nonus:0x00000091r, "L mirror", actcolor, optical, power );
			addPart( cars.racers.nonus:0x00000095r, "FL window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.nonus:0x00000091r, "L mirror", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.nonus:0x00000095r, "FL window", actcolor, optical, power );
		}

		// parts that have multiple appearance //
		if ( optical <= 1.0 )
		{
		} else
		{

		}

	}
}
