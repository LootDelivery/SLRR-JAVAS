package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_mirror extends Mirror
{
	public Nonus_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus right mirror";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(54.728);
	}
}
