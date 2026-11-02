package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FR_door extends FrontDoor
{
	public Focer_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer passenger's door";
		description = "The stock passenger's door for the Focer RC models.";

		brand_new_prestige_value = 34.29;
 		value = tHUF2USD(123.374);
	}
}
