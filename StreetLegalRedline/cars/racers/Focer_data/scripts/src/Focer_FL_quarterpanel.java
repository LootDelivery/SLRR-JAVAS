package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FL_quarterpanel extends Quarterpanel
{
	public Focer_FL_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer front left quarterpanel";
		description = "The stock front left quarterpanel for the Focer RC models.";

		brand_new_prestige_value = 27.43;
		value = tHUF2USD(237.258);
	}
}
