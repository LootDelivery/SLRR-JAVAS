package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_headlights extends Headlights
{
	public Nonus_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus right headlights";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(43.783);
	}
}
