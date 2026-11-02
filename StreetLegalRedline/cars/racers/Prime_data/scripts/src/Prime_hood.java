package java.game.cars;

import java.io.*;
import java.game.parts.bodypart.*;

public class Prime_hood extends Hood
{
	public Prime_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 hood";
		description = "";
		brand_new_prestige_value = 67.03;

		value = mHUF2USD(1.324);
	}
}
