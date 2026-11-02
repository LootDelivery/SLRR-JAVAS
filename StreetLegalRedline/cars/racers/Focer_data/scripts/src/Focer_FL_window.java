package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FL_window extends Window
{
	public Focer_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer driver's window";
		description = "The stock driver's window for the Focer RC models.";

		brand_new_prestige_value = 27.43;
		value = tHUF2USD(37.961);
	}
}
