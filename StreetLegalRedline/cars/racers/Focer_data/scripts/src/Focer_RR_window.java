package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_RR_window extends Window
{
	public Focer_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rear right window";
		description = "";
		brand_new_prestige_value = 27.43;

		value = tHUF2USD(37.961);
	}
}
