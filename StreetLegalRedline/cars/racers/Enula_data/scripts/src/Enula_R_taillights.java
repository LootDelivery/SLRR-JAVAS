package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_taillights extends Taillights
{
	public Enula_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR right taillights";
		description = "The stock right taillights for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 41.47;
	}
}
