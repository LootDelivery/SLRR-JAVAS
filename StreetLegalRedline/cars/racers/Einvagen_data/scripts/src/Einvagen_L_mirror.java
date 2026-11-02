package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_L_mirror extends Mirror
{
	public Einvagen_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT left mirror";
		description = "The stock left mirror for the GT models.";

		value = tHUF2USD(27.817);
		brand_new_prestige_value = 23.25;
	}
}
