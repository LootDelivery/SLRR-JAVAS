package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Einvagen_stock_exhaust_pipe extends ExhaustPipe
{
	public Einvagen_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT stock exhaust pipe";

		description = "The stock exhaust system for all Einvagen GT models.";

		value = tHUF2USD(105.637);
		brand_new_prestige_value = 27.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement( new Integer(2) );
	}
}
