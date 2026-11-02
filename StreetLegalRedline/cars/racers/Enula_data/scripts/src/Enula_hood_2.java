package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_hood_2 extends Hood
{
	public Enula_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR SuperTurizmo hood";
		description = "The stock hood for the WR SuperTurizmo model.";

		value = tHUF2USD(920.389);
		brand_new_prestige_value = 44.84;
	}
}
