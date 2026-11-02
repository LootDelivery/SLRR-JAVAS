package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FL_door extends FrontDoor
{
	public Focer_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer driver's door";
		description = "The stock driver's door for the Focer RC models.";

		brand_new_prestige_value = 34.29;
		value = tHUF2USD(123.374);
	}
}
