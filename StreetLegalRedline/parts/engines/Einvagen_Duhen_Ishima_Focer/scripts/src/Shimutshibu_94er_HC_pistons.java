package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Shimutshibu_94er_HC_pistons extends Piston
{
	public Shimutshibu_94er_HC_pistons( int id )
	{
		super( id );
		name = "Shimutshibu Focer RC 200 pistons";
		description = "";
		brand_new_prestige_value = 42.71;

		value = tHUF2USD(4*18);
		setMaxWear(kmToMaxWear(305000.0));

		bore = 94.0;
		length_from_wrist_pin_center_to_crown_base = 57.57;
		crown_height = 0.00;
		crown_volume = -34.61;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 10000.0;
		inertia = kgToInertia(4*0.390);
	}
}
