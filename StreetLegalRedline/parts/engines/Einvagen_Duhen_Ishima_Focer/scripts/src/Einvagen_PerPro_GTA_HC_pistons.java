package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Einvagen_PerPro_GTA_HC_pistons extends Piston
{
	public Einvagen_PerPro_GTA_HC_pistons( int id )
	{
		super( id );
		name = "Einvagen PerPro 140 GTA pistons";
		description = "These pistons are built into the limited edition Einvagen 140 GTA. A pack of four pistons capable of up to 8000 RPM. For 93.0 mm (3.66 inch) bore blocks.";
		brand_new_prestige_value = 27.94;

		value = tHUF2USD(4*15.5);
		setMaxWear(kmToMaxWear(305000.0));

		bore = 93.0;
		length_from_wrist_pin_center_to_crown_base = 52.57;
		crown_height = 0.00;
		crown_volume = -34.61;
		length_from_lowest_safe_belt_to_crown_base = 31.19;

		maxRPM = 8000;
		inertia = kgToInertia(4*0.420);
	}
}
