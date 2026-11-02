package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_FR_quarterpanel extends Quarterpanel
{
	public Focer_FR_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer front right quarterpanel";
		description = "";
		brand_new_prestige_value = 27.43;

		value = tHUF2USD(237.258);
	}
}
