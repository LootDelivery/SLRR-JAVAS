package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Shimutshibu_RC_200_cylinder_head_cover extends Part
{
	public Shimutshibu_RC_200_cylinder_head_cover( int id )
	{
		super( id );
		name = "Shimutshibu Focer RC 200 cylinder head cover";
		description = "An aluminium valve cover painted to black with the Shimutshibu and RC 200 logos painted white.";

		value = tHUF2USD(17.5);
		brand_new_prestige_value = 39.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
