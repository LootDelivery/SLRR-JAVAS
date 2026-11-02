package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_88er_HC_pistons extends Piston
{
	public Duhen_88er_HC_pistons( int id )
	{
		super( id );
		name = "Duhen SunStrip 1.8 DVC pistons";

		description = "These pistons are built into the Duhen D18V engines. You get a pack of four high-tech pistons for your money that can be used safely up to 9000 RPM.";

		value = tHUF2USD(4*14);
		brand_new_prestige_value = 27.94;
		setMaxWear(kmToMaxWear(305000.0));

		bore = 88.5;
		length_from_wrist_pin_center_to_crown_base = 50.00;
		crown_height = 0.00;
		crown_volume = -29.83;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 8500;
		inertia = kgToInertia(4*0.350);
	}
}
