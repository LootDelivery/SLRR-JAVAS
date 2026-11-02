package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_bumper extends Bumper
{
	public Enula_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WRY/WRZ rear bumper";
		description = "The stock rear bumper for the WRY and WRZ models.";

		value = tHUF2USD(90.163);
		brand_new_prestige_value = 33.17;
	}
}
