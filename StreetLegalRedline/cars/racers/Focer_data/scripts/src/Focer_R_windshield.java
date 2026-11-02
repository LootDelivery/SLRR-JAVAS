package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_windshield extends Windshield
{
	public Focer_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rear windshield";
		description = "";
		brand_new_prestige_value = 34.29;

		value = tHUF2USD(170.825);
	}
}
