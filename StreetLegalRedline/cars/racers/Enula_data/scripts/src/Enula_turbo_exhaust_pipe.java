package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Enula_turbo_exhaust_pipe extends ExhaustPipe
{
	public Enula_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR turbo exhaust pipe";

		description = "The turbo exhaust system for all Enula models except for the WR SuperTurizmo.";

		value = tHUF2USD(288.840);
		brand_new_prestige_value = 42.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
