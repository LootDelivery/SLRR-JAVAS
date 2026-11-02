package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Shimutshibu_alternator extends Part
{
	public Shimutshibu_alternator( int id )
	{
		super( id );
		name = "Shimutshibu alternator";
		description = "";
		brand_new_prestige_value = 14.52;

		value = tHUF2USD(15);
		setMaxWear(kmToMaxWear(300000.0));
	}
}
