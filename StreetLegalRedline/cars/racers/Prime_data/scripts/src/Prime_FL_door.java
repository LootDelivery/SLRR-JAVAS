package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_FL_door extends FrontDoor
{
	public Prime_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 driver's door";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(477.916);
	}
}
