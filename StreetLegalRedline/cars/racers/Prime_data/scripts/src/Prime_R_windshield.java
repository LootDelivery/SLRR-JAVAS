package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_R_windshield extends Windshield
{
	public Prime_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 rear windshield";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(661.729);
	}
}
