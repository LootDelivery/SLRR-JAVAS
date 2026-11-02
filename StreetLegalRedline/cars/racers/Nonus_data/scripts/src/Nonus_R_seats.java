package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_seats extends RearSeat
{
	public Nonus_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus rear seats";
		description = "";
		brand_new_prestige_value = 43.11;

		value = tHUF2USD(109.457);
	}
}
