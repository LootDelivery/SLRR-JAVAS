package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_F_brush_guard extends GrilleGuard
{
	public SuperDuty_F_brush_guard( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty grille guard";

		description = "A decorative and useful extension for this car. Protects the front of the car very well from serious injury. Its mounted to the frame, so withstands big crashes leaving bad marks on others' cars. Made of heavy chrome finished stainless steel.";

		value = tHUF2USD(305.414);
		brand_new_prestige_value = 159.91;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
