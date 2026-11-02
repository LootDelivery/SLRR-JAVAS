package java.game.cars;

import java.io.*;
import java.game.parts.enginepart.*;

public class Prime_radiator extends Radiator
{
	public Prime_radiator( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "radiator";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(441.152);
	}
}
