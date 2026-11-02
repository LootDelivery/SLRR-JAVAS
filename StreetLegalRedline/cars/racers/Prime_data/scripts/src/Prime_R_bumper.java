package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_R_bumper extends Bumper
{
	public Prime_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 rear bumper";
		description = "";
		brand_new_prestige_value = 67.03;

		value = tHUF2USD(330.865);
	}
}
