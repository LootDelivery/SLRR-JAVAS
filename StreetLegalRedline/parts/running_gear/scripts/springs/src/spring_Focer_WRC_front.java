package java.game.parts.running_gear.springs;

import java.game.parts.rgearpart.*;

public class spring_Focer_WRC_front extends Spring
{
	public spring_Focer_WRC_front( int id )
	{
		super( id );

		designedMassOnWheel = getMessOnWheel(1377.0, 48.2, WHL_FRONT);
		force = kgfPmm2NPm(7.2);
		restlength = Inch2Meter(8.0);
		minlength = Inch2Meter(7.0);
		maxlength = Inch2Meter(9.0);

		brand_prestige_factor = 3.50;
		name_prefix = "Shimutshibu Focer WRC";
		calcStuffs();
	}
}
