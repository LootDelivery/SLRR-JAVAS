package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.cylinderhead.*;
import java.game.cars.*;


public class MC_Prime_SuperDuty_R_DOHC_cylinder_head_cover extends Part
{
	public MC_Prime_SuperDuty_R_DOHC_cylinder_head_cover( int id )
	{
		super( id );
		name = "Prime DLH right cylinder head cover";
		description = "";
		brand_new_prestige_value = 28.67;

		value = tHUF2USD(29.512);
		setMaxWear(kmToMaxWear(511000.0));

		check4warnings();
	}
}
