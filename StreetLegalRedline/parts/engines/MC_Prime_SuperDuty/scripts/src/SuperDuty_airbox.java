package java.game.parts.engines.MC_Prime_SuperDuty;

import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;
import java.game.cars.*;

public class SuperDuty_airbox extends AirFilter
{
	public SuperDuty_airbox( int id )
	{
		super( id );
		name = "Hauler's SuperDuty airbox";
		description = "";
		brand_new_prestige_value = 43.01;

		value = tHUF2USD(44.268);

		stock_max_air_consumption = 0.3;
		setMaxWear(100000.0);
		dusted_efficiency = 0.25;

		check4warnings();
	}
}
