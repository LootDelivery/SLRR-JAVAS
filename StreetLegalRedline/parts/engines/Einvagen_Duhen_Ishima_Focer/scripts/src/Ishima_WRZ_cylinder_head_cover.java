package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Ishima_WRZ_cylinder_head_cover extends Part
{
	public Ishima_WRZ_cylinder_head_cover( int id )
	{
		super( id );
		name = "Ishima WRZ cylinder head cover";
		description = "An aluminium valve cover painted to red with the Ishima and WRZ logos painted gold.";

		value = tHUF2USD(22);
		brand_new_prestige_value = 43.00;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
