package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_mirror extends Mirror
{
	public Enula_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR right mirror";
		description = "The stock right mirror for the WR models.";

		value = tHUF2USD(50.090);
		brand_new_prestige_value = 41.47;
	}
}
