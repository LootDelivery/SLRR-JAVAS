package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_L_headlights extends Headlights
{
	public Focer_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer left headlights";

		description = "";

		value = tHUF2USD(37.961);
		brand_new_prestige_value = 34.29;
	}
}
