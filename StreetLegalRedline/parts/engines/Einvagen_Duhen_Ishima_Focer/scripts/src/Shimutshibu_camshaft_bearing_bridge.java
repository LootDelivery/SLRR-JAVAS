package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Shimutshibu_camshaft_bearing_bridge extends SlidingEnginePart
{
	public Shimutshibu_camshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Shimutshibu camshaft bearing bridge";
		description = "";
		brand_new_prestige_value = 34.17;

		value = tHUF2USD(2*7);
		setMaxWear(kmToMaxWear(250000.0));
	}
}
