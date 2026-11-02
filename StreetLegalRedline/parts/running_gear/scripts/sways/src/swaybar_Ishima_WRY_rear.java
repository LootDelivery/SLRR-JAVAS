package java.game.parts.running_gear.sways;

import java.game.parts.rgearpart.*;


public class swaybar_Ishima_WRY_rear extends Swaybar
{
	public swaybar_Ishima_WRY_rear( int id )
	{
		super( id );

		force = 25000.0;
		damping = 2500.0;

		name_prefix = "Duhen SunStrip 1.5 DVC";
		brand_prestige_factor = 1.30;
		calcStuffs();
	}
}

