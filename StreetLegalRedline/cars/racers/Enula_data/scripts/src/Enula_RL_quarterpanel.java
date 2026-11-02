package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_RL_quarterpanel extends Quarterpanel
{
	public Enula_RL_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WRY/WRZ rear left quarterpanel";
		description = "The stock rear left quarterpanel for the WRY and WRZ models.";

		value = tHUF2USD(250.449);
		brand_new_prestige_value = 33.17;
	}
}
