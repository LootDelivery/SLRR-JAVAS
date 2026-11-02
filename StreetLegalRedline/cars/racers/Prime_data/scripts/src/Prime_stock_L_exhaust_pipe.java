package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Prime_stock_L_exhaust_pipe extends ExhaustPipe
{
	public Prime_stock_L_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 stock left exhaust pipe";

		description = "The stock left side exhaust system for the Prime DLH 500.";

		value = tHUF2USD(315.000);
		brand_new_prestige_value = 90.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
