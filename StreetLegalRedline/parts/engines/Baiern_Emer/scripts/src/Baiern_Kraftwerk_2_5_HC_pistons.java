package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;

public class Baiern_Kraftwerk_2_5_HC_pistons extends Piston
{
	public Baiern_Kraftwerk_2_5_HC_pistons( int id )
	{
		super( id );
		name = "Baiern Kraftwerk 2.5 pistons";
		description = "A set of 6 pistons plus rings only for the 80.0 mm (3.15 inch) bored Baiern and compatible blocks and cylinder heads with enough space in the combustion chamber to incorporate the +17.1 mm (+0.67 inch) high piston crowns. Can only be used with high domed cylinder heads and careful intake and exhaust timing settings to avoid injury of the head, the pistons and the connecting rods, or even the crankshaft and the bearing bridge. Each of these pistons weigh only 390 grams (13.8 ounces), so the peak RPM of the crankshaft may reach 9250 if supported with similarly light and strong connecting rods. Not recommended for forced induction due to the very high static compression ratios with factory connecting rods.";

		value = tHUF2USD(6*14);
		brand_new_prestige_value = 44.71;
		setMaxWear(kmToMaxWear(205000.0));

		bore = 80.0;
		length_from_wrist_pin_center_to_crown_base = 32.31;
		crown_height = 17.07;
		crown_volume = 44.91;
		length_from_lowest_safe_belt_to_crown_base = 20.77;

		maxRPM = 11000.0;
		inertia = kgToInertia(6*0.390);

		check4warnings();
	}
}
