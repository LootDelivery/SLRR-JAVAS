package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_rally_headlights extends Headlights
{
	public Focer_rally_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rally headlights";
		description = "The rally headlights for the race models.";

		value = tHUF2USD(213.000);
		brand_new_prestige_value = 70.00;
	}
}
