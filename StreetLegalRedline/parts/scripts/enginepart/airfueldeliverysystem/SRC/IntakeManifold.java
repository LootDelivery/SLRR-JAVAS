package java.game.parts.enginepart.airfueldeliverysystem;

import java.render.osd.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;
import java.game.parts.rgearpart.*;

public class IntakeManifold extends AirFuelDeliverySystem
{
	int	fuel_rail_slot_ID = 0;
	float	efficiency		= 1.0; // flow efficiency //

	public IntakeManifold( int id )
	{
		super( id );

		name = "Intake manifold";

		prestige_calc_weight = 25.0;
	}

	public FuelInjectorSystem getFuelRail()
	{
		if (fuel_rail_slot_ID <= 0)
			return null;

		Part res = partOnSlot(fuel_rail_slot_ID);

		if (res && res instanceof FuelInjectorSystem)
			return (FuelInjectorSystem)res;
//		else
//			System.log("!!!FuelInjectorSystem required on slot!!!");

		return null;
	}

	public String isDynoable()
	{
		if (fuel_rail_slot_ID)
			if (!partOnSlot(fuel_rail_slot_ID))
				return "It's missing the fuel system.";

		return super.isDynoable();
	}
}
