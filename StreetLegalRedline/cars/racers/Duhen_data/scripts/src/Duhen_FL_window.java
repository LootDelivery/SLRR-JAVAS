package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_FL_window extends Window
{
	public Duhen_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip driver's window";

		description = "The stock driver's window for all SunStrips.";

		value = tHUF2USD(21.098);
		brand_new_prestige_value = 28.09;
		setMaxWear(kmToMaxWear(285000));
	}
}
