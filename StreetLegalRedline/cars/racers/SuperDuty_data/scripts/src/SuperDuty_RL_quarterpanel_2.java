package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_RL_quarterpanel_2 extends Quarterpanel
{
	public SuperDuty_RL_quarterpanel_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty Extra 750 left quarterpanel";

		description = "The stock rear left quarterpanel of the SuperDuty Extra 750. It has street-legal space for tyres measuring 33.5 inch outer diameter and 17.5 inch width. Maximum sizes achievable may vary with modifying rear track, rim offset and ground clearance.";

		value = tHUF2USD(606.416);
		brand_new_prestige_value = 60.19;
		setMaxWear(kmToMaxWear(450000.0));
	}
        public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			
			addPart( cars.racers.superduty:0x000000B8r, "L taillights", actcolor, optical, power );
		} else
		{
			
			if ( optical >= random() ) addPart( cars.racers.superduty:0x000000B8r, "L taillights", actcolor, optical, power );
		}
	}  	



}
