package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_hood extends Hood
{
	public Duhen_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip hood";

		description = "The stock hood for the SunStrips from 1.5 DVC to 2.2 DVC.";

		value = tHUF2USD(189.879);
		brand_new_prestige_value = 28.09;
		setMaxWear(kmToMaxWear(285000));
	}
}
