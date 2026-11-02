package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_F_bumper extends Bumper
{
	public Focer_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Focer front bumper";
		description = "The stock front bumper for the Focer RC models.";

		value = tHUF2USD(94.903);
		brand_new_prestige_value = 27.43;
	}
}
