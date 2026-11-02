package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class wings_SL_Tuners_Euro_B extends Wing
{
	public wings_SL_Tuners_Euro_B( int id )
	{
		super( id );
		carCategory = COMMON;

		name = "SL Tuners Euro B trunk wing";
		description = "A fine european style bent wing for the trunks. It gives slightly more sideforce than the Euro but a little less downforce, too.";

		value = tHUF2USD(40.000);
		brand_new_prestige_value = 50.00;
	}
}
