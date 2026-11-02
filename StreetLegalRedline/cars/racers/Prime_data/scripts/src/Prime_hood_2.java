package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_hood_2 extends Hood
{
	public Prime_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 replacement hood";
		description = "";
		brand_new_prestige_value = 47.78;

		value = tHUF2USD(338.055);
	}
}
