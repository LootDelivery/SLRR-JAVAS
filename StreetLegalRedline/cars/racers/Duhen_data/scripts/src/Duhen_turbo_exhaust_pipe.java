package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Duhen_turbo_exhaust_pipe extends ExhaustPipe
{
	public Duhen_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip DVC turbo exhaust pipe";

		description = "The turbo exhaust system for all Duhen SunStrip DVC models except for the Racing SunStrip 2.0 CDVC.";

		value = tHUF2USD(80.312);
		brand_new_prestige_value = 28.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
