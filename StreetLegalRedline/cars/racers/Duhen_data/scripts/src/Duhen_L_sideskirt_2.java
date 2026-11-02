package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_L_sideskirt_2 extends Sideskirt
{
	public Duhen_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen Racing SunStrip left sideskirt";

		description = "The stock left sideskirt for the Racing SunStrip.";

		value = tHUF2USD(59.656);
		brand_new_prestige_value = 76.42;
		setMaxWear(kmToMaxWear(285000));
	}
}
