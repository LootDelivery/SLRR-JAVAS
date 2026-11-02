package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_L_sideskirt extends Sideskirt
{
	public Enula_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WRY/WRZ left sideskirt";
		description = "The stock left sideskirt for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 49.76;
	}
}
