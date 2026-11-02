package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_seats extends RearSeat
{
	public Einvagen_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT rear seats";
		description = "The stock rear seats for the GT models.";

		value = tHUF2USD(55.633);
		brand_new_prestige_value = 18.60;
	}
}
