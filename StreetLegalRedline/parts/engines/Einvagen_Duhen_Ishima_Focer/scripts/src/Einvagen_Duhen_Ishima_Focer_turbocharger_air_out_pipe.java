package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;

public class Einvagen_Duhen_Ishima_Focer_turbocharger_air_out_pipe extends ExhaustHeader
{
	public Einvagen_Duhen_Ishima_Focer_turbocharger_air_out_pipe( int id )
	{
		super( id );
		name = "Inline-4 Turbocharger air out pipe.";
		description = "";
		value = tHUF2USD(10);
		setMaxWear(kmToMaxWear(500000.0));

		check4warnings();
	}


}
