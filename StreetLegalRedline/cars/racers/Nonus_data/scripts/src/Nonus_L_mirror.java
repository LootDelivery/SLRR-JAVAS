package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_L_mirror extends Mirror
{
	public Nonus_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus left mirror";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(54.728);
	}
}
