package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_RL_window extends Window
{
	public Focer_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rear left window";
		description = "";
		brand_new_prestige_value = 27.43;

		value = tHUF2USD(37.961);
	}
}
