package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_F_windshield extends Windshield
{
	public Prime_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 front windshield";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(882.305);
	}
}
