package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_RR_quarterpanel extends Quarterpanel
{
	public Duhen_RR_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip rear right quarterpanel";

		description = "The stock rear right quarterpanel for the SunStrips from 1.5 DVC to 2.2 DVC.";

		value = tHUF2USD(131.860);
		brand_new_prestige_value = 28.09;
		setMaxWear(kmToMaxWear(285000));
	}
}
