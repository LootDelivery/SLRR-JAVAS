package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_FR_window extends Window
{
	public Enula_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR passenger's window";
		description = "The stock passenger's window for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 33.17;
	}
}
