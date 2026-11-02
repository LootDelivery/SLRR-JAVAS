package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_taillights extends Taillights
{
	public SuperDuty_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty right taillights";

		description = "The stock right side taillights for the SuperDuty family. This part can be used legally worldwide. It has four sections: a 20W amber indicator, a 25W/35W red city/brake light, and a bright 35W white reversing light to enlighten the scene enough behind the car.";

		value = tHUF2USD(61.083);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
