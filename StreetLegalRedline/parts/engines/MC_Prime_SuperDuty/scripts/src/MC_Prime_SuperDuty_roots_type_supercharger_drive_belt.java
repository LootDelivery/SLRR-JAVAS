package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_roots_type_supercharger_drive_belt extends Part
{
	public MC_Prime_SuperDuty_roots_type_supercharger_drive_belt( int id )
	{
		super( id );
		name = "Vee-8 roots type supercharger drive belt";
		description = "";
		brand_new_prestige_value = 48.60;

		value = tHUF2USD(8.854);
		setMaxWear(kmToMaxWear(60000.0));

		check4warnings();
	}
}
