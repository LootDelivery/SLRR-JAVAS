package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_exhaust_header extends ExhaustHeader
{
	public Einvagen_PerPro_GTA_exhaust_header( int id )
	{
		super( id );
		name = "Einvagen PerPro 140 GTA exhaust header";
		description = "A factory tuned version of the header found on the 110 GT/GTK. The 6 percent improvement in flow dynamics results some more HP at top range.";
		brand_new_prestige_value = 25.15;

		value = tHUF2USD(4*7+10);
		setMaxWear(kmToMaxWear(280000.0));

		efficiency = 0.82;
	}

        public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );
		getCar_LocalVersion();
		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000005Br, "Japanese_exhaust_pipe", desc );
		
	
	}

         
}

