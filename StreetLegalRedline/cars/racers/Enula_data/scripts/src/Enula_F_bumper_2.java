package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_F_bumper_2 extends Bumper
{
	public Enula_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR SuperTurizmo front bumper";
		description = "The stock front bumper for the WR SuperTurizmo.";

		value = tHUF2USD(255.664);
		brand_new_prestige_value = 44.84;
	}
}
