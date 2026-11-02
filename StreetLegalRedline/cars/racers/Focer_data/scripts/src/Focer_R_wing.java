package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_wing extends Wing
{
	public Focer_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer rear wing";
		description = "";

		brand_new_prestige_value = 71.08;
		value = tHUF2USD(85.413);
	}
}
