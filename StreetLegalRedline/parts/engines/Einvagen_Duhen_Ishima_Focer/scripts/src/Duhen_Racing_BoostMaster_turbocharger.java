package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;

public class Duhen_Racing_BoostMaster_turbocharger extends TurboCharger
{
	public Duhen_Racing_BoostMaster_turbocharger( int id )
	{
		super( id );
		name = "Duhen Racing BoostMaster turbocharger";
		description = "This turbocharger is built into the Duhen Racing SunStrip 2.0 CDVC. \n It's designed to work optimally from 4000 to 9000 RPM at a maximum boost of 2.0 bar (29.4 psi). An adjustable wastegate is installed to prevent mechanic injury but also let the racer tweak performance.";

		value = tHUF2USD(355);
		brand_new_prestige_value = 71.50;

		calculateOptandRange (4000.0, 9000.0);
		P_turbo_max	= 2.0;
		default_P_turbo_waste	= 0.5;
		P_turbo_waste	= default_P_turbo_waste;

		max_waste	= 1.0;
		min_waste	= 0.25;
	}

	public void updatevariables()
	{
		setMaxWear(kmToMaxWear(100000.0));
	}
        public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000054r, "turbocharger_air_out_pipe", desc );
		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000055r, "turbocharger_exhaust_pipe", desc );
		
		
	}
}
