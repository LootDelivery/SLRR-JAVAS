package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_sideskirt extends Sideskirt
{
	public SuperDuty_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty 500 right sideskirt";

		description = "A protective step-up for the SD 500.";

		value = tHUF2USD(70.961);
		brand_new_prestige_value = 76.25;
		setMaxWear(kmToMaxWear(350000.0));
	}
}
