package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Shimutshibu_RC_300_cylinder_head_cover extends Part
{
	public Shimutshibu_RC_300_cylinder_head_cover( int id )
	{
		super( id );
		name = "Shimutshibu Focer RC 300 cylinder head cover";
		description = "An aluminium valve cover painted to red with the Shimutshibu and RC 300 Turbocharged logos painted white.";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 43.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
