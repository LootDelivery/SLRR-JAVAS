package java.game.parts.running_gear.springs;

import java.game.parts.rgearpart.*;

public class spring_Ishima_WRZ_front extends Spring
{
	public spring_Ishima_WRZ_front( int id )
	{
		super( id );

		designedMassOnWheel = getMessOnWheel(1514.0, 44.2, WHL_FRONT);
		force = kgfPmm2NPm(5.9);
		restlength = Inch2Meter(8.5);
		minlength = Inch2Meter(7.0);
		maxlength = Inch2Meter(9.5);

		brand_prestige_factor = 1.50;
		name_prefix = "Ishima Enula WRZ";
		calcStuffs();
	}
}
