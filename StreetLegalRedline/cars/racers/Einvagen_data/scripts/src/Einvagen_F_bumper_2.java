package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_F_bumper_2 extends Bumper
{
	public Einvagen_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GTA front bumper";
		description = "The stock front bumper for the 140 GTA.";

		value = tHUF2USD(55.633);
		brand_new_prestige_value = 24.00;
	}
}
