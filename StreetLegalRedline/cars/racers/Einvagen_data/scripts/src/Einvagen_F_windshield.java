package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_F_windshield extends Windshield
{
	public Einvagen_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT front windshield";
		description = "The stock front windshield for the GT models.";

		value = tHUF2USD(83.880);
		brand_new_prestige_value = 23.25;
	}
}
