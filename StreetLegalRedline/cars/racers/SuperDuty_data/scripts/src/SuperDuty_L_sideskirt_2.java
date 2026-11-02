package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_L_sideskirt_2 extends Sideskirt
{
	public SuperDuty_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty Extra 750 left sideskirt";

		description = "A protective step-up for the SDE 750.";

		value = tHUF2USD(97.027);
		brand_new_prestige_value = 90.29;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
