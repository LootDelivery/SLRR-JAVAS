package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_L_taillights extends Taillights
{
	public Enula_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR left taillights";
		description = "The stock left taillights for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 41.47;
	}
}
