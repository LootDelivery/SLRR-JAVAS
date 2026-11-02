package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_DOHC_camshaft_drive_belt extends Part
{
	public MC_Prime_SuperDuty_DOHC_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Prime DLH camshaft drive belt";
		description = "";
		brand_new_prestige_value = 8.60;

		value = tHUF2USD(8.854);
		setMaxWear(kmToMaxWear(56000.0));

		check4warnings();
	}
}
