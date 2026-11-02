package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_R_wing extends Wing
{
	public Prime_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;

		name = "Prime DLH 500 rear wing";
		description = "";

		brand_new_prestige_value = 150.81;
		value = tHUF2USD(330.865);
	}
}
