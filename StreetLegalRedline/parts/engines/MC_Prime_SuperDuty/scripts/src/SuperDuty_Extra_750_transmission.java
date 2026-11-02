package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class SuperDuty_Extra_750_transmission extends Transmission
{
	public SuperDuty_Extra_750_transmission( int id )
	{
		super( id );
		name = "Hauler's SuperDuty Extra 750 transmission";
		description = "";
		brand_new_prestige_value = 58.53;

		value = tHUF2USD(236.000);
		setMaxWear(kmToMaxWear(511000.0));

		gears	= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.500;
		ratio[2]	= 2.700;
		ratio[3]	= 1.900;
		ratio[4]	= 1.300;
		ratio[5]	= 1.000;
		ratio[7]	=-4.000;
		end_ratio	= 2.270;

		starter_torque	= 125.0;

		inertia = kgToInertia(14.5);

		maxRPM = 8000.0;

		check4warnings();

		drive_type = DT_FWD | DT_RWD;
		drive_front_min = 0.5;
		drive_front_max = 0.5;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.33;
		diff_lock_max = 0.33;
		def_diff_lock = 0.33;
		diff_lock = def_diff_lock;
	}
}
