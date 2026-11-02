package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class wings_SL_Tuners_Pagoda_I extends Wing
{
	public wings_SL_Tuners_Pagoda_I( int id )
	{
		super( id );
		carCategory = COMMON;

		name = "SL Tuners Pagoda I trunk wing";
		description = "A slightly bent japanese wing. Features two big layers and a little bit less downforce than the Pagoda II.";

		value = tHUF2USD(40.000);
		brand_new_prestige_value = 65.00;
	}
}
