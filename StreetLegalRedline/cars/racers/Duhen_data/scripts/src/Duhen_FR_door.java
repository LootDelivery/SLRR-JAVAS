package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FR_door extends FrontDoor
{
	public Duhen_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip passenger's door";

		description = "The stock passenger's door for all SunStrips.";

		value = tHUF2USD(68.567);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
