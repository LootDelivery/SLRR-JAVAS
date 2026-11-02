package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_windshield extends Windshield
{
	public Duhen_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip rear windshield";

		description = "The stock rear windshield for all SunStrips.";

		value = tHUF2USD(94.940);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
