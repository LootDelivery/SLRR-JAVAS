package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_L_mirror extends Mirror
{
	public Enula_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR left mirror";
		description = "The stock left mirror for the WR models.";

		value = tHUF2USD(50.090);
		brand_new_prestige_value = 41.47;
	}
}
