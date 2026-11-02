package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_F_windshield extends Windshield
{
	public Focer_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer front windshield";
		description = "The stock front windshield for the Focer RC models.";

		brand_new_prestige_value = 34.29;
		value = tHUF2USD(227.767);
	}
}
