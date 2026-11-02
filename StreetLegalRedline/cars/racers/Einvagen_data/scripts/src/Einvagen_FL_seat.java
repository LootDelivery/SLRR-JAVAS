package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FL_seat extends FrontSeat
{
	public Einvagen_FL_seat( int id )
	{
		super( id );
		name = "Einvagen GT driver's seat";
		description = "The stock driver's seat for the GT models.";

		value = tHUF2USD(55.633);
		brand_new_prestige_value = 23.25;
	}
}
