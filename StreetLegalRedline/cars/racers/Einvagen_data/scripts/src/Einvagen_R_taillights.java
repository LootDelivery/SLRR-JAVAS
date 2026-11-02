package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_taillights extends Taillights
{
	public Einvagen_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT right taillights";
		description = "The stock right taillights for the GT models.";

		value = tHUF2USD(22.253);
		brand_new_prestige_value = 23.25;
	}
}
