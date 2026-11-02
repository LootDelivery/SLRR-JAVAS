package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_mirror extends Mirror
{
	public Focer_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer right mirror";
		description = "";
		brand_new_prestige_value = 34.29;

 		value = tHUF2USD(47.452);
	}
}
