package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_FR_window extends Window
{
	public Prime_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 passenger's window";
		description = "";
		brand_new_prestige_value = 67.03;

		value = tHUF2USD(147.051);
	}
}
