package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_sideskirt extends Sideskirt
{
	public Duhen_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip right sideskirt";

		description = "The stock right sideskirt for the SunStrips from 1.5 DVC to 2.2 DVC.";

		value = tHUF2USD(21.098);
		brand_new_prestige_value = 42.14;
		setMaxWear(kmToMaxWear(285000));
	}
}
