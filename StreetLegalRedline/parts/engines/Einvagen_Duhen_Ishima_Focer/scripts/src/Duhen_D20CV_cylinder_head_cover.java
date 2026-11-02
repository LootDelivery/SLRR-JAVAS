package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_D20CV_cylinder_head_cover extends EnginePart
{
	public Duhen_D20CV_cylinder_head_cover( int id )
	{
		super( id );
		name = "Duhen D20CV cylinder head cover";
		description = "A stylish aluminium valve cover painted to Duhen Racing yellow with a black 'Duhen Racing 2.0 CDVC' label.";

		value = tHUF2USD(25);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
