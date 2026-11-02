package java.game.parts.running_gear.shocks;

import java.game.parts.rgearpart.*;

public class shock_absorber_Prime_front extends ShockAbsorber
{
	public shock_absorber_Prime_front( int id )
	{
		super( id );

		damping				= 4900.0;
		max_length			= 550.0 / 1000.0;
		min_length			= 350.0 / 1000.0;
		whats_inside			= WI_GAS;

		name_prefix = "Prime DLH 500";
		brand_prestige_factor = 3.25;
		calcStuffs();
	}
}

