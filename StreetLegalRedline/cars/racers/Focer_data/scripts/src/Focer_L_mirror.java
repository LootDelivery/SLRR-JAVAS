package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_L_mirror extends Mirror
{
	public Focer_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer left mirror";
		description = "";
		brand_new_prestige_value = 34.29;

 		value = tHUF2USD(47.452);
	}
}
