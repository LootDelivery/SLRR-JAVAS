package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_RR_window extends Window
{
	public Einvagen_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT rear right window";
		description = "The stock rear right window for the GT models.";

		value = tHUF2USD(22.253);
		brand_new_prestige_value = 18.60;
	}
}
