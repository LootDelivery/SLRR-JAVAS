package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_wing_2 extends Wing
{
	public Enula_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR SuperTurizmo trunk wing";
		description = "The stock trunk wing for the WR SuperTurizmo models.";

		value = tHUF2USD(230.098);
		brand_new_prestige_value = 100.89;

	}
}
