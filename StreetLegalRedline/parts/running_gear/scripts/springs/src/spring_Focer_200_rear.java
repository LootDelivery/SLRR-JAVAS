package java.game.parts.running_gear.springs;

import java.game.parts.rgearpart.*;

public class spring_Focer_200_rear extends Spring
{
	public spring_Focer_200_rear( int id )
	{
		super( id );

		designedMassOnWheel = getMessOnWheel(1439.0, 47.3, WHL_REAR);
		force = kgfPmm2NPm(4.3);
		restlength = Inch2Meter(7.0);
		minlength = Inch2Meter(6.0);
		maxlength = Inch2Meter(8.0);

		brand_prestige_factor = 1.28;
		name_prefix = "Shimutshibu Focer 200";
		calcStuffs();
	}
}
