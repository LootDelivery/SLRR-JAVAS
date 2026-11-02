package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_hood_2 extends Hood
{
	public Nonus_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus replacement hood";
		description = "";
		brand_new_prestige_value = 65.00;

		value = tHUF2USD(360.000);
	}
}
