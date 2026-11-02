package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_Rf_wing extends Wing
{
	public Einvagen_Rf_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 GTA roof wing";
		description = "The roof wing found on the 140 GTA models.";

		value = tHUF2USD(38.943);
		brand_new_prestige_value = 54.01;
	}
}
