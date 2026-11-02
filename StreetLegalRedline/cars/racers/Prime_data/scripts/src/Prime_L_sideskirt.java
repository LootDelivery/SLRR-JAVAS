package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_L_sideskirt extends Sideskirt
{
	public Prime_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Prime DLH 500 left sideskirt";
		description = "";

		brand_new_prestige_value = 100.54;
		value = tHUF2USD(147.051);
	}
}
