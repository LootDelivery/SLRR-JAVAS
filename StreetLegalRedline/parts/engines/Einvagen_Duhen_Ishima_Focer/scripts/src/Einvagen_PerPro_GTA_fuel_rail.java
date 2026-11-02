package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Einvagen_PerPro_GTA_fuel_rail extends FuelInjectorSystem
{
	public Einvagen_PerPro_GTA_fuel_rail( int id )
	{
		super( id );
		name = "Einvagen PerPro 4-channel fuel-rail";
		description = "This equipment was developed inside the Einvagen Performance Program group for the 4 cylinder Einvagen engines from the 125HP GT to the 230HP GTA. It's relaticely cheap despite it was designed by the tuning group, but it's quality is the same all PerPro parts have.";
		brand_new_prestige_value = 33.53;

		value = tHUF2USD(4*5+12);
		setMaxWear(kmToMaxWear(330000.0));

		max_fuel_consumption	= 0.02;
		default_mixture_ratio	= 14.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
