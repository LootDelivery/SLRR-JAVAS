package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Einvagen_camshaft_bearing_bridge extends SlidingEnginePart
{
	public Einvagen_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Einvagen GT camshaft bearing bridge";
		description = "Just a stock camshaft bearing bridge. Very cheap.";
		brand_new_prestige_value = 22.35;

		value = tHUF2USD(2*7);
		setMaxWear(kmToMaxWear(250000.0));
	}
}
