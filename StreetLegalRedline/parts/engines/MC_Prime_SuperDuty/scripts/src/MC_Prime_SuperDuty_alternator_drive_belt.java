package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_alternator_drive_belt extends Part
{
	public MC_Prime_SuperDuty_alternator_drive_belt( int id )
	{
		super( id );
		name = "Prime DLH alternator drive belt";
		description = "";
		brand_new_prestige_value = 5.73;

		value = tHUF2USD(5.902);
		setMaxWear(kmToMaxWear(40000.0));

		check4warnings();
	}
}
