package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_F_bumper extends Bumper
{
	public Prime_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 front bumper";
		description = "";
		brand_new_prestige_value = 67.03;

		value = tHUF2USD(367.627);
	}
}
