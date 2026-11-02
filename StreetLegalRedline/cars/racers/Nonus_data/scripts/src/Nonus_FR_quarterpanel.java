package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_FR_quarterpanel extends Quarterpanel
{
	public Nonus_FR_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus front right quarterpanel";
		description = "";
		brand_new_prestige_value = 43.11;

		value = tHUF2USD(273.642);
	}
}
