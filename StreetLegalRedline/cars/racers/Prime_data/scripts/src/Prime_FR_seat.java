package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_FR_seat extends FrontSeat
{
	public Prime_FR_seat( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 passenger's seat";
		description = "";
		brand_new_prestige_value = 83.79;

		value = tHUF2USD(367.627);
	}
}
