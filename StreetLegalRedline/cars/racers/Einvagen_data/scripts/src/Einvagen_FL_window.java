package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FL_window extends Window
{
	public Einvagen_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT driver's window";
		description = "The stock driver's window for the GT models.";

		value = tHUF2USD(22.253);
		brand_new_prestige_value = 18.60;
	}
}
