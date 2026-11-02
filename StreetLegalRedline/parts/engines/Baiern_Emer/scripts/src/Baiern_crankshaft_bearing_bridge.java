package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Baiern_crankshaft_bearing_bridge extends SlidingEnginePart
{
	public Baiern_crankshaft_bearing_bridge( int id )
	{
		super( id );
		name = "Baiern crankshaft bearing bridge";
		description = "It's the bearing used in all types of Baiern engines from the N/A CoupeSport 2.5 to the DevilSport BiTurbo. \n It's durability is enough for about the engine's lifetime, but not cheap to change, so take good care of your engine especially the lubrication.";

		value = tHUF2USD(90);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(340000.0));

		check4warnings();
	}
}
