package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_headlights extends Headlights
{
	public Focer_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer right headlights";

		description = "";

 		value = tHUF2USD(37.961);
		brand_new_prestige_value = 34.29;
	}
}
