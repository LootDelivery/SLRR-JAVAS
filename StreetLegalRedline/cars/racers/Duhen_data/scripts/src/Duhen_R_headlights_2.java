package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_headlights_2 extends Headlights
{
	public Duhen_R_headlights_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "SL Tuners 3beam SunStrip right headlights";

		description = "A replacement right headlights body for the SunStrips.";

		value = tHUF2USD(28.667);
		brand_new_prestige_value = 60.00;
		setMaxWear(kmToMaxWear(200000));
	}
}
