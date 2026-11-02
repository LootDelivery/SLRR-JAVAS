package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_RR_door extends RearDoor
{
	public Focer_RR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rear right door";
		description = "";
		brand_new_prestige_value = 34.29;

		value = tHUF2USD(123.374);
	}
}
