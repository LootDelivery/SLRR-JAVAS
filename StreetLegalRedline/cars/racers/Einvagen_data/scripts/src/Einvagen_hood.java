package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_hood extends Hood
{
	public Einvagen_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT/GTA hood";
		description = "The stock hood for the 110 GT and 140 GTA models.";

		value = tHUF2USD(125.820);
		brand_new_prestige_value = 24.00;
	}
}
