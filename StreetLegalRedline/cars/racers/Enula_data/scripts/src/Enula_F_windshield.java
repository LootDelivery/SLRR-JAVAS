package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_F_windshield extends Windshield
{
	public Enula_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR front windshield";
		description = "The stock front windshield for the WR models.";

		value = tHUF2USD(240.432);
		brand_new_prestige_value = 41.47;
	}
}
