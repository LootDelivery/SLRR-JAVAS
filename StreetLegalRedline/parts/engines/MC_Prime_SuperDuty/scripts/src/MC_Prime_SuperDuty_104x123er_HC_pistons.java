package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class MC_Prime_SuperDuty_104x123er_HC_pistons extends Piston
{
	public MC_Prime_SuperDuty_104x123er_HC_pistons( int id )
	{
		super( id );
		name = "Prime DLH short pistons for long stroker connecting rods";
		description = "";
		brand_new_prestige_value = 71.68;

		value = tHUF2USD(93.779);
		setMaxWear(kmToMaxWear(411000.0));

		maxRPM = 12500.0;

		bore = 104.0;
		length_from_wrist_pin_center_to_crown_base = 08.500;
		crown_height = 22.19;
		crown_volume = 98.67;
		length_from_lowest_safe_belt_to_crown_base = 27.00;

		inertia = kgToInertia(8*0.340);

		check4warnings();
	}
}
