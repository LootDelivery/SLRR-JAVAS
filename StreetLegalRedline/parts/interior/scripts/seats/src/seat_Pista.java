package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class seat_Pista extends FrontSeat
{
	public seat_Pista( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Pisto front seat";
		description = "A sports seat manufactured by SL Tuners.";

		value = tHUF2USD(130);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
