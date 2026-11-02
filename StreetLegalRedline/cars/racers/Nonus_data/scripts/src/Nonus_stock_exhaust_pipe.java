package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Nonus_stock_exhaust_pipe extends ExhaustPipe
{
	public Nonus_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Emer Nonus stock exhaust pipe";

		description = "The stock exhaust system for the Emer Nonus StreetGT.";

		value = tHUF2USD(230.000);
		brand_new_prestige_value = 39.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
		mufflerSlotIDList.addElement( new Integer(3) );
	}
}
