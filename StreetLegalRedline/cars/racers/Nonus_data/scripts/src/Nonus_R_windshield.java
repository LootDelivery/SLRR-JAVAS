package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_windshield extends Windshield
{
	public Nonus_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus rear windshield";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(197.022);
	}
}
