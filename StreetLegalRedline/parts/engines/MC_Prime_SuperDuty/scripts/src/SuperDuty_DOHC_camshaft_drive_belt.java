package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class SuperDuty_DOHC_camshaft_drive_belt extends Part
{
	public SuperDuty_DOHC_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Hauler's SuperDuty camshaft drive belt";
		description = "";
		brand_new_prestige_value = 8.60;

		value = tHUF2USD(8.854);
		setMaxWear(kmToMaxWear(40000.0));

		check4warnings();
	}
}
