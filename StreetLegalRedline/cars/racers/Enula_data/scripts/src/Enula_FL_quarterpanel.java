package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_FL_quarterpanel extends Quarterpanel
{
	public Enula_FL_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR front left quarterpanel";
		description = "The stock front left quarterpanel for the WRY and WRZ models.";

		value = tHUF2USD(250.449);
		brand_new_prestige_value = 33.17;
	}
}
