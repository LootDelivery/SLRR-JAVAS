package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_L_headlights_2 extends Headlights
{
	public Duhen_L_headlights_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "SL Tuners 3beam SunStrip left headlights";

		description = "A replacement left headlights body for the SunStrips.";

		value = tHUF2USD(28.667);
		brand_new_prestige_value = 60.00;
		setMaxWear(kmToMaxWear(200000));
	}
}
