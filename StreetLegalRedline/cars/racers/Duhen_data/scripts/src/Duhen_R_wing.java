package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_wing extends Wing
{
	public Duhen_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip trunk wing";

		description = "The factory trunk wing for the Racing SunStrip 2.0 CDVC. It's very light, durable and creates a whopping ? N downforce at 200 KPH (125 MPH) that glues the rear to the ground. You won't fishtail with this wing at high speeds.";

		value = tHUF2USD(32.763);
		brand_new_prestige_value = 60.0;
		setMaxWear(kmToMaxWear(485000.0));
	}
}
