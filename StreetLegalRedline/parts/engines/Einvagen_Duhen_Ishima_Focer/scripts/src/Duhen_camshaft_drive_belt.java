package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Duhen_camshaft_drive_belt extends EnginePart
{
	public Duhen_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Duhen camshaft drive belt";
		description = "A cheap but much more important part of the engine. Change it when needed to avoid the jumbling of the valves in the cylinder head. This belt costs only a few bucks and is quick and easy to change. Change it evey 14000-16000 kms (8750-10000 miles) instead of repairing the whole cilynder head for hard thousands.";

		value = tHUF2USD(2.5);
		brand_new_prestige_value = 3.35;
		setMaxWear(kmToMaxWear(18000.0));
	}
}
