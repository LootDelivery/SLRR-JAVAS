package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_RR_window extends Window
{
	public Enula_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR rear right window";
		description = "The stock right mirror for the WR models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 33.17;
	}
}
