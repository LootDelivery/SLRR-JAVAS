package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_windshield extends Windshield
{
	public Enula_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR rear windshield";
		description = "The stock rear windshield for the WR models.";

		value = tHUF2USD(180.324);
		brand_new_prestige_value = 41.47;
	}
}
