package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_L_headlights_2 extends Headlights
{
	public Nonus_L_headlights_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "SL Tuners 3beam Nonus left headlights";

		description = "A replacement left headlights body for the Nonus models.";

		value = tHUF2USD(45.000);
		brand_new_prestige_value = 60.00;
		setMaxWear(kmToMaxWear(200000));
	}
}
