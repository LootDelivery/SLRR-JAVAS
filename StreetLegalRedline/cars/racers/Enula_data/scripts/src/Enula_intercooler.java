package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Enula_intercooler extends AirCooler
{
	public Enula_intercooler( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WRZ intercooler";
		description = "The stock WRZ intercooler.";

		value = tHUF2USD(160.288);
		brand_new_prestige_value = 66.35;
	}
}
