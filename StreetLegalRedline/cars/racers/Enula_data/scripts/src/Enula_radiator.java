package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Enula_radiator extends Radiator
{
	public Enula_radiator( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR radiator";
		description = "The stock radiator for the WR models. The touring racer version - the WR SuperTurizmo - uses this radiator, too.";

		value = tHUF2USD(120.215);
		brand_new_prestige_value = 41.47;
	}
}
