package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;


public class Ishima_WR_SuperTurizmo_turbocharger extends TurboCharger
{
	public Ishima_WR_SuperTurizmo_turbocharger( int id )
	{
		super( id );
		name = "Ishima WR SuperTurizmo turbocharger";
		description = "This turbocharger is built into the Ishima Enula WR SuperTurizmo. \n It's designed to work optimally from 1600 to 5800 RPM in the bottom range. It's a very powerful charger. \n Charging stops at 1.50 bar (21.75 psi) thanks to the wastegate. The WG can be removed on this model or replaced with an external unit.";

		value = tHUF2USD(460);
		brand_new_prestige_value = 109.30;

		calculateOptandRange (2500.0, 9800.0);
		P_turbo_max	= 2.00;
		default_P_turbo_waste	= 1.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.5;
		min_waste	= 0.75;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(160000.0));
	}
        public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000054r, "turbocharger_air_out_pipe", desc );
		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000055r, "turbocharger_exhaust_pipe", desc );
		
		
	}
}
