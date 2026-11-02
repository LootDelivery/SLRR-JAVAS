package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Focer_turbo_exhaust_pipe extends ExhaustPipe
{
	public Focer_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Shimutshibu Focer turbo exhaust pipe";

		description = "The turbo exhaust system for the RC200 and RC300 Focer models except for the WRC.";

		value = tHUF2USD(185.000);
		brand_new_prestige_value = 45.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
