package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_R_mirror extends Mirror
{
	public Prime_R_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 right mirror";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(183.813);
	}
}
