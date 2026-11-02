package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_alternator extends EnginePart
{
	public Duhen_alternator( int id )
	{
		super( id );
		name = "Duhen alternator";
		description = "";
		brand_new_prestige_value = 9.50;

		value = tHUF2USD(15);
		setMaxWear(kmToMaxWear(300000.0));
	}
}
