package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_bumper extends Bumper
{
	public Einvagen_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT rear bumper";
		description = "The stock rear bumper for the GT models.";

		value = tHUF2USD(31.454);
		brand_new_prestige_value = 18.60;
	}
}
