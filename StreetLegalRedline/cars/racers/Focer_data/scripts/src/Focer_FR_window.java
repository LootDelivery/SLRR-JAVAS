package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FR_window extends Window
{
	public Focer_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer passenger's window";
		description = "";
		brand_new_prestige_value = 27.43;

 		value = tHUF2USD(37.961);
	}
}
