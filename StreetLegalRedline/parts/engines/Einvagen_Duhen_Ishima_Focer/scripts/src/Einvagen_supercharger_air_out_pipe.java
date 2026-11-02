package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class Einvagen_supercharger_air_out_pipe extends ExhaustPipe
{
	public Einvagen_supercharger_air_out_pipe( int id )
	{
		super( id );
		name = "Einvagen 110 GTK Supercharger air out pipe.";
		description = "";
		value = tHUF2USD(3);
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}

}
