package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_bumper extends Bumper
{
	public Duhen_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip rear bumper";

		description = "The stock rear bumper for the SunStrips from 1.5 DVC to 2.2 DVC.";

		value = tHUF2USD(47.469);
		brand_new_prestige_value = 28.09;
		setMaxWear(kmToMaxWear(285000));
	}
}
