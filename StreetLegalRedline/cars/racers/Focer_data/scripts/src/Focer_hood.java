package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_hood extends Hood
{
	public Focer_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer hood";
		description = "";
		brand_new_prestige_value = 27.43;

 		value = tHUF2USD(341.651);
	}
}
