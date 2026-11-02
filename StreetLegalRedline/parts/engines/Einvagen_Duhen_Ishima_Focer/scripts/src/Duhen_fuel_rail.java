package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Duhen_fuel_rail extends FuelInjectorSystem
{
	public Duhen_fuel_rail( int id )
	{
		super( id );
		name = "Duhen fuel rail";
		description = "This is the stock serial fuel injector railing for the 4-tunnel intake manifold. \n It has 4 sequentially actuated injectors that are able to deliver 120 lbs/hr, enough for about 240 HP.";

		value = tHUF2USD(4*5+12);
		brand_new_prestige_value = 33.53;
		setMaxWear(kmToMaxWear(330000.0));

		max_fuel_consumption	= 0.025;
		default_mixture_ratio	= 14.5;
		default_fuel_type	= FT_GAS_95;
		mixture_ratio		= default_mixture_ratio;
		fuel_type		= default_fuel_type;
		calcStuffs();

		check4warnings();
	}
}
