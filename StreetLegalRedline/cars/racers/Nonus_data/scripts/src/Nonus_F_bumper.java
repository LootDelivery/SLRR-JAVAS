package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_F_bumper extends Bumper
{
	public Nonus_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus front bumper";
		description = "";
		brand_new_prestige_value = 43.11;

		value = tHUF2USD(109.457);
	}
}
