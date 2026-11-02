package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_L_taillights extends Taillights
{
	public Focer_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer left taillights";
		description = "";
		brand_new_prestige_value = 34.29;

		value = tHUF2USD(37.961);
	}
}
