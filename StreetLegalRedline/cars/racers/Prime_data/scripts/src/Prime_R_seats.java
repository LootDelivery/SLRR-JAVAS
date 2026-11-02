package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_R_seats extends RearSeat
{
	public Prime_R_seats( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 rear seats";
		description = "";
		brand_new_prestige_value = 67.03;

		value = tHUF2USD(367.627);
	}
}
