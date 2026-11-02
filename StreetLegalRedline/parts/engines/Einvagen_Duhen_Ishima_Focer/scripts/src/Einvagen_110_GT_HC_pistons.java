package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Einvagen_110_GT_HC_pistons extends Piston
{
	public Einvagen_110_GT_HC_pistons( int id )
	{
		super( id );
		name = "Einvagen 110 GT pistons";
		description = "These pistons are built into the naturally aspirated Einvagen 110 GT. A pack of four pistons capable of up to 8250 RPM. For 80.0 mm (3.15 inch) bore blocks.";
		brand_new_prestige_value = 27.94;

		value = tHUF2USD(4*14);
		setMaxWear(kmToMaxWear(305000.0));

		bore = 80.0;
		length_from_wrist_pin_center_to_crown_base = 52.57;
		crown_height = 0.00;
		crown_volume = -25.61;
		length_from_lowest_safe_belt_to_crown_base = 39.15;

		maxRPM = 8250;
		inertia = kgToInertia(4*0.390);
	}
}
