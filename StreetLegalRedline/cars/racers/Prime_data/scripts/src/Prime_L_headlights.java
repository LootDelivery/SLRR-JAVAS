package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_L_headlights extends Headlights
{
	public Prime_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 left headlight";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(147.051);
	}
}
