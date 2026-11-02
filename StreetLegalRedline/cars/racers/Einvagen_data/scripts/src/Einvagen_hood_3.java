package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_hood_3 extends Hood
{
	public Einvagen_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning hood";
		description = "Stage 1 replacement hood.";

		value = tHUF2USD(141.363);
		brand_new_prestige_value = 80.00;
	}
}
