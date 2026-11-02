package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Einvagen_radiator extends Radiator
{
	public Einvagen_radiator( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT radiator";
		description = "The stock radiator for the GT models.";

		value = tHUF2USD(66.759);
		brand_new_prestige_value = 23.25;
	}
}
