package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_L_headlights extends Headlights
{
	public Duhen_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip left headlights";

		description = "The stock left headlights for all the SunStrips. A simple dual halogen headlight with 40W city bulbs and 45W for the highway. Easter egg 27500. The indicator is a standard amber bulb.";

		value = tHUF2USD(21.098);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
