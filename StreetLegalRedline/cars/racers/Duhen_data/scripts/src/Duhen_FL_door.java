package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FL_door extends FrontDoor
{
	public Duhen_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip driver's door";

		description = "The stock driver's door for all SunStrips.";

		value = tHUF2USD(68.567);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
