package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_bumper extends Bumper
{
	public Focer_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rear bumper";
		description = "";
		brand_new_prestige_value = 27.43;

 		value = tHUF2USD(85.413);
	}
}
