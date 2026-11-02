package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_L_taillights extends Taillights
{
	public Duhen_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip left taillights";

		description = "The stock left side taillights for all Duhen SunStrip models. It has three sections: a 20W amber indicator, a 25W/35W red city/brake light, and a 25W white reversing light. Easter egg DUH-IL-20W.";

		value = tHUF2USD(21.098);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000.0));
	}
}
