package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_hood_2 extends Hood
{
	public Einvagen_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GTK hood";
		description = "The stock hood for the 110 GTK models.";

		value = tHUF2USD(125.820);
		brand_new_prestige_value = 24.00;
	}
}
