package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_mirror extends Mirror
{
	public Einvagen_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT right mirror";
		description = "The stock right mirror for the GT models.";

		value = tHUF2USD(27.817);
		brand_new_prestige_value = 23.25;
	}
}
