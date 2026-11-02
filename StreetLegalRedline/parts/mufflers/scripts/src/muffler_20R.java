package java.game.parts.mufflers;

import java.game.parts.enginepart.*;

public class muffler_20R extends ExhaustTip
{
	public muffler_20R( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners muffler type 20R";

		value = tHUF2USD(30.000);
		brand_new_prestige_value = 40.00;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
