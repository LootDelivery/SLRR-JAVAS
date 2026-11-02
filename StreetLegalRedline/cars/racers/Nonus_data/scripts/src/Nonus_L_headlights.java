package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_L_headlights extends Headlights
{
	public Nonus_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus left headlights";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(43.783);
	}
}
