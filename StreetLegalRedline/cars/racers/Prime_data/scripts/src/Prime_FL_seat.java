package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_FL_seat extends FrontSeat
{
	public Prime_FL_seat( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 driver's seat";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(367.627);
	}
}
