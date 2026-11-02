package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;

public class Duhen_camshaft_bearing_bridge extends SlidingEnginePart
{
	public Duhen_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Duhen camshaft bearing bridge";
		description = "It's the bearing used in all japanese inline-4 makers' engines. It's very durable, and is not too expensive to change, but take good care of your engine especially the lubrication.";

		value = tHUF2USD(2*7);
		brand_new_prestige_value = 22.35;
		setMaxWear(kmToMaxWear(250000.0));
	}
}
