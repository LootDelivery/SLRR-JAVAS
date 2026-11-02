package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Einvagen_alternator extends Part
{
	public Einvagen_alternator( int id )
	{
		super( id );
		name = "Einvagen alternator";
		description = "This part generates the electrical power needed for igniting the air fuel mixture in the engine. It is driven by a belt that connects to the crankshaft. \n In short race conditions you may dismount this part to produce some more horsepower because the battery holds enough charge for ignition, but only for some minutes.";

		value = tHUF2USD(15);
		brand_new_prestige_value = 9.50;
		setMaxWear(kmToMaxWear(300000.0));
	}
}
