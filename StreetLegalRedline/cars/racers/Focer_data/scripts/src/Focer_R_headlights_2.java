package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_headlights_2 extends Headlights
{
	public Focer_R_headlights_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "SL Tuners 3beam Focer right headlights";

		description = "A replacement right headlights body for the Focer models.";

		value = tHUF2USD(34.000);
		brand_new_prestige_value = 60.00;
	}
}
