package java.game.parts.accessories;

import java.game.parts.enginepart.canister.n2o.*;


public class NOS_canister_12pds extends SmallCanister
{
	public NOS_canister_12pds ( int id )
	{
		super( id );

		name = "SL Tuners 12.0 pounds N2O canister";
		description = "This 12.0 pounds N2O canister can hold enough juice for about 5-30 seconds of beating depending on amount of injection and injector sizes. Be aware of low loads, because you can run out of extra power suddenly in sharp situations!";

		value = tHUF2USD(5.5+2);
		brand_new_prestige_value = 50.0;

		capacity = 12.0/2.2;
		actual = capacity;
	}
}

