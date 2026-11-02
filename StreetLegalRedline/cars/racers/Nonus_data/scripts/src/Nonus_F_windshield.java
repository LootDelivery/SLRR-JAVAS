package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_F_windshield extends Windshield
{
	public Nonus_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus front windshield";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(262.697);
	}
}
