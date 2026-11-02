package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_cylinder_head_cover extends Part
{
	public Einvagen_PerPro_GTA_cylinder_head_cover( int id )
	{
		super( id );
		name = "Einvagen PerPro GTA cylinder head cover";
		description = "A stylish aluminium valve cover painted to black with the Einvagen PerPro, and 140 GTA logos polished bright.";

		value = tHUF2USD(18);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
