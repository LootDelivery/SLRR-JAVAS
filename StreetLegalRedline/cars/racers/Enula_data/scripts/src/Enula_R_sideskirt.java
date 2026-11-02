package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_sideskirt extends Sideskirt
{
	public Enula_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WRY/WRZ right sideskirt";
		description = "The stock right sideskirt for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 49.76;
	}
}
