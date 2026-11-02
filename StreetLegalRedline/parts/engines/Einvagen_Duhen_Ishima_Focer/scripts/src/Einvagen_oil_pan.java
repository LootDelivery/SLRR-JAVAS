package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Einvagen_oil_pan extends OilPan
{
	public Einvagen_oil_pan( int id )
	{
		super( id );
		name = "Einvagen GT oil pan";
		description = "This is the factory stock oil pan for all Einvagen models. \n It can hold up to 6.5 litres (27.43 quarts) of engine oil, but 4.5 litres (18.99 quarts) is enough for the Einvagen 110 GT engine.";

		value = tHUF2USD(13);
		brand_new_prestige_value = 16.76;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
