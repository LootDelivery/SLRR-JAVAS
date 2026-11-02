package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_hood extends Hood
{
	public Enula_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR hood";
		description = "The stock hood for the WRY and WRZ models.";

		value = tHUF2USD(360.647);
		brand_new_prestige_value = 33.17;
	}
}
