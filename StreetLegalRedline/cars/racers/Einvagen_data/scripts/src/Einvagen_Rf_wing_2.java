package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_Rf_wing_2 extends Wing
{
	public Einvagen_Rf_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning roof wing";
		description = "A replacement roof wing for the Einvagen GT models.";

		value = tHUF2USD(38.947);
		brand_new_prestige_value = 60.00;
	}
}
