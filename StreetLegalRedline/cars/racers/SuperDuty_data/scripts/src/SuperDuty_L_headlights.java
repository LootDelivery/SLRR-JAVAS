package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_L_headlights extends Headlights
{
	public SuperDuty_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty left headlights";

		description = "The stock left side headlights for the SuperDuty family. A dual design halogen headlight with 40W city bulbs and 45W for the highway."; // easter egg:LRHL-500-750 on the back side of the mesh //

		value = tHUF2USD(61.083);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
