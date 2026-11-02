package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_trunk extends Trunk
{
	public Enula_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR trunk";
		description = "The stock trunk for the WR models.";

		value = tHUF2USD(140.252);
		brand_new_prestige_value = 33.17;
	}
}
