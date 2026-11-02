package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_wing extends Wing
{
	public Einvagen_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT hatch door wing";
		description = "The stock hatch door for the GT models.";

		value = tHUF2USD(50.070);
		brand_new_prestige_value = 41.86;
	}
}
