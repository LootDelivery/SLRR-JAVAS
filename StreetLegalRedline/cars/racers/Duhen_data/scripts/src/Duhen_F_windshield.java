package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_F_windshield extends Windshield
{
	public Duhen_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip front windshield";

		description = "The stock front windshield for all SunStrips.";

		value = tHUF2USD(126.586);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
