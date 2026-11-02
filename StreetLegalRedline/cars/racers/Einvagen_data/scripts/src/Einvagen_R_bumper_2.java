package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_R_bumper_2 extends Bumper
{
	public Einvagen_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning rear bumper";
		description = "A replacement rear bumper for the Einvagen GT models.";

		value = tHUF2USD(115.399);
		brand_new_prestige_value = 60.00;
	}
}
