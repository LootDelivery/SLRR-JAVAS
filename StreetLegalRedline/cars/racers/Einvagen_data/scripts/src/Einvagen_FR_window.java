package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FR_window extends Window
{
	public Einvagen_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT passenger's window";
		description = "The stock passenger's window for the GT models.";

		value = tHUF2USD(22.253);
		brand_new_prestige_value = 18.60;
	}
}
