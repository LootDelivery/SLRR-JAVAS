package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class MC_GTB_pistons extends Piston
{
	public MC_GTB_pistons( int id )
	{
		super( id );
		name = "MC GT-B/GTLE pistons";
		description = "";
		brand_new_prestige_value = 71.68;

		value = tHUF2USD(73.779);
		setMaxWear(kmToMaxWear(411000.0));

		maxRPM = 9250.0;

		bore = 107.0;
		length_from_wrist_pin_center_to_crown_base = 63.00;
		crown_height = 22.19;
		crown_volume = 63.00;
		length_from_lowest_safe_belt_to_crown_base = 43.00;

		inertia = kgToInertia(8*0.620);

		check4warnings();
	}
}
