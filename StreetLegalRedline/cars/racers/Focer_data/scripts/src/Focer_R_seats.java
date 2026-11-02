package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_R_seats extends RearSeat
{
	public Focer_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer rear seats";
		description = "";
		brand_new_prestige_value = 27.43;

 		value = tHUF2USD(94.903);
	}
}
