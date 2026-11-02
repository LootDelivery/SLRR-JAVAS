package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class seat_Speed_yellow extends FrontSeat
{
	public seat_Speed_yellow( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "SL Tuners Speed front seat";
		description = "A sports seat manufactured by SL Tuners.";

		value = tHUF2USD(130);
		brand_new_prestige_value = 50.00;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
