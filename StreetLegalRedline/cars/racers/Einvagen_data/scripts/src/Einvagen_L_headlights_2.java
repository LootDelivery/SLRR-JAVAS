package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_L_headlights_2 extends Headlights
{
	public Einvagen_L_headlights_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning left headlights";
		description = "OCA creates this german style headlights body. It's compatible with the stock left side Einvagen GT headlights.";

		value = tHUF2USD(36.062);
		brand_new_prestige_value = 60.00;
	}
}
