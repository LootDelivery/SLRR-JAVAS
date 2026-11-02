package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_headlights extends Headlights
{
	public Enula_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR right headlights";
		description = "The stock right headlights for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 41.47;
	}
}
