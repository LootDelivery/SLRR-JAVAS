package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FR_quarterpanel_2 extends Quarterpanel
{
	public Duhen_FR_quarterpanel_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen Racing SunStrip front right quarterpanel";

		description = "The stock front right quarterpanel for the Racing SunStrip. The wheel arch was widened with 5 cm (2 inch).";

		value = tHUF2USD(536.769);
		brand_new_prestige_value = 50.95;
		setMaxWear(kmToMaxWear(285000));
	}
}
