package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_hood extends Hood
{
	public Nonus_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus hood";
		description = "";
		brand_new_prestige_value = 43.11;

		value = tHUF2USD(324.045);
	}
}
