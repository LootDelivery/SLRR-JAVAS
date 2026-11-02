package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class MC_F_bumper extends Bumper
{
	public MC_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "MC GT front bumper";

		description = "The stock front bumper found on the first gen GT.";

		value = tHUF2USD(88.946);
		brand_new_prestige_value = 42.49;
	}
}
