package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_L_taillights extends Taillights
{
	public Prime_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 left taillights";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(147.051);
	}
}
