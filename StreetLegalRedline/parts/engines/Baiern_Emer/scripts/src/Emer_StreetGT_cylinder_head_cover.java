package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class Emer_StreetGT_cylinder_head_cover extends Part
{
	public Emer_StreetGT_cylinder_head_cover( int id )
	{
		super( id );
		name = "Emer Nonus StreetGT cylinder head cover";
		description = "A bronze valve cover painted to black with the Emer Nonus StreetGT logo.";

		value = tHUF2USD(15);
		brand_new_prestige_value = 16.00;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
