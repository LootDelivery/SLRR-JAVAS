package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class wings_SL_Tuners_Euro extends Wing
{
	public wings_SL_Tuners_Euro( int id )
	{
		super( id );
		carCategory = COMMON;

		name = "SL Tuners Euro trunk wing";
		description = "A fine european style half bent wing for the trunks. It gives slightly more downforce than the Euro B but a little less sideforce, too.";

		value = tHUF2USD(40.000);
		brand_new_prestige_value = 50.00;
	}
}
