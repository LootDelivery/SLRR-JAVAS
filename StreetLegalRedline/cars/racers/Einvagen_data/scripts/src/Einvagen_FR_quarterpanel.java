package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FR_quarterpanel extends Quarterpanel
{
	public Einvagen_FR_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT front right quarterpanel";
		description = "The stock front right quarterpanel for the GT models.";

		value = tHUF2USD(87.375);
		brand_new_prestige_value = 18.60;
	}
}
