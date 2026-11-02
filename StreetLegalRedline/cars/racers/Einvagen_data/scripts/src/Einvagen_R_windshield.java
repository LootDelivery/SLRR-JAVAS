package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_windshield extends Windshield
{
	public Einvagen_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT rear windshield";
		description = "The stock rear windshield for the GT models.";

		value = tHUF2USD(100.140);
		brand_new_prestige_value = 23.25;
	}
}
