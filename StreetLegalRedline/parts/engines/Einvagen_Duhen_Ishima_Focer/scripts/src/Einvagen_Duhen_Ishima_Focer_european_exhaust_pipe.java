package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Einvagen_Duhen_Ishima_Focer_european_exhaust_pipe extends ExhaustPipe
{
	public Einvagen_Duhen_Ishima_Focer_european_exhaust_pipe( int id )
	{
		super( id );
		name = "Einvagen exhuast down pipe.";
		description = "";
		value = tHUF2USD(13);
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}
}
