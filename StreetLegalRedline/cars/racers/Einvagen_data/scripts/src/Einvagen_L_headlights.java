package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_L_headlights extends Headlights
{
	public Einvagen_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT left headlights";
		description = "The stock left headlights for the GT models.";

		value = tHUF2USD(22.253);
		brand_new_prestige_value = 23.25;
	}
}
