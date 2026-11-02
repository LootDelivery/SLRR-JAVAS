package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_wing extends Wing
{
	public Enula_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WRZ trunk wing";
		description = "The stock trunk wing for the WRZ models.";

		value = tHUF2USD(90.163);
		brand_new_prestige_value = 74.64;
	}
}
