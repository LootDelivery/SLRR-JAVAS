package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Baiern_oil_pan extends OilPan
{
	public Baiern_oil_pan( int id )
	{
		super( id );
		name = "Baiern Kraftwerl/Devil oil pan";
		description = "This is the factory stock oil pan developed in cooperation between Baiern Cars Gmbh and Emer Japanese-German Automobiles Co. It can hold up to 7.0 litres (29.54 quarts) of engine oil, but 5.5 litres (23.21 quarts) is enough for the Baiern KraftWerk 2.5 engine.";

		value = tHUF2USD(18);
		brand_new_prestige_value = 51.09;
		setMaxWear(kmToMaxWear(500000.0));

		friction_fwd = 0.0001;
		friction_rev = 0.0001;

		check4warnings();
	}
}
