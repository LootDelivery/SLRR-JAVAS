package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_trunk extends Trunk
{
	public Nonus_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus trunk";
		description = "";
		brand_new_prestige_value = 43.11;

		value = tHUF2USD(153.240);
	}
}
