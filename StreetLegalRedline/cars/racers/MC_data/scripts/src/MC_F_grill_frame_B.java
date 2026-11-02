package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.*;


public class MC_F_grill_frame_B extends Part
{
	public MC_F_grill_frame_B( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "MC front grill frame B";
		description = "";
		brand_new_prestige_value = 42.49;

		value = tHUF2USD(35.579);
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.mc:0x000000A9r, "F splitter", actcolor, optical, power );
			addPart( cars.racers.mc:0x000000B5r, "FL indicator", actcolor, optical, power );
			addPart( cars.racers.mc:0x000000C0r, "FR indicator", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.mc:0x000000A9r, "F splitter", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.mc:0x000000B5r, "FL indicator", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.mc:0x000000C0r, "FR indicator", actcolor, optical, power );
		}
	}
}
