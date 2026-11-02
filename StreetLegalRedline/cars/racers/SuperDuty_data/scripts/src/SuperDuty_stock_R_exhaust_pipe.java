package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class SuperDuty_stock_R_exhaust_pipe extends ExhaustPipe
{
	public SuperDuty_stock_R_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty stock right exhaust pipe";

		description = "The stock right side exhaust system for the Hauler's SuperDuty 500 and Extra 750.";

		value = tHUF2USD(115.000);
		brand_new_prestige_value = 52.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
