package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_L_headlights extends Headlights
{
	public Enula_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR left headlights";
		description = "The stock left headlights for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 41.47;
	}
}
