package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Ishima_WR_SuperTurizmo_cylinder_head_cover extends Part
{
	public Ishima_WR_SuperTurizmo_cylinder_head_cover( int id )
	{
		super( id );
		name = "Ishima WR SuperTurizmo cylinder head cover";
		description = "A titanium valve cover painted to gold with the Faktun Group and WR SuperTurizmo logos painted black.";

		value = tHUF2USD(30);
		brand_new_prestige_value = 59.30;
		setMaxWear(kmToMaxWear(1000000.0));
	}
}
