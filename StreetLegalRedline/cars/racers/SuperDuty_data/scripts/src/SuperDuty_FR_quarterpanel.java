package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_FR_quarterpanel extends Quarterpanel
{
	public SuperDuty_FR_quarterpanel( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty front right quarterpanel";

		description = "The stock front right quarterpanel of the SuperDutys. It has street-legal space for tyres measuring 28.5 inch outer diameter and 12.5 inch width. Maximum sizes achievable may vary with modifying front track, rim offset, steering lock and ground clearance.";

		value = tHUF2USD(381.767);
		brand_new_prestige_value = 45.69;
		setMaxWear(kmToMaxWear(450000.0));
	}
}
