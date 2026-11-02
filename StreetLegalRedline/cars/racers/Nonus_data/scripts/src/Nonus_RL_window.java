package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_RL_window extends Window
{
	public Nonus_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus rear left window";
		description = "";
		brand_new_prestige_value = 43.11;

		value = tHUF2USD(43.783);
	}
}
