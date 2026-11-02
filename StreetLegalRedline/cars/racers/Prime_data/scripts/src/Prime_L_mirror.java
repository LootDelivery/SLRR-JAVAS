package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_L_mirror extends Mirror
{
	public Prime_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 left mirror";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(183.813);
	}
}
