package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Einvagen_110_GT_exhaust_header extends ExhaustHeader
{
	public Einvagen_110_GT_exhaust_header( int id )
	{
		super( id );
		name = "Einvagen 110 GT/GTK exhaust header";
		description = "The stock exhaust header built onto the 110 cui GT and GTK engines.";
		brand_new_prestige_value = 25.15;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(220000.0));

		efficiency = 0.80;
	}

        public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );
		getCar_LocalVersion();
		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Br, "Japanese_exhaust_pipe", desc );
		
	
	}

}



