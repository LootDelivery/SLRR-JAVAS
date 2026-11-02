package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_F_bumper extends Bumper
{
	public Enula_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR front bumper";
		description = "The stock front bumper for the WRY and WRZ models.";

		value = tHUF2USD(100.180);
		brand_new_prestige_value = 33.17;
	}
}
