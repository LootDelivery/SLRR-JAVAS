package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_bumper_2 extends Bumper
{
	public Nonus_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus replacement rear bumper";
		description = "";
		brand_new_prestige_value = 65.00;

		value = tHUF2USD(110.000);
	}
}
