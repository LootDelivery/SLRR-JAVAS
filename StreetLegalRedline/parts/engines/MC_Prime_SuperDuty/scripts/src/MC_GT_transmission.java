package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class MC_GT_transmission extends Transmission
{
	public MC_GT_transmission( int id )
	{
		super( id );
		name = "MC GT/GT-B transmission";
		description = "";

		brand_new_prestige_value = 69.86;
		value = tHUF2USD(351.190);
		setMaxWear(kmToMaxWear(411000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.23;
		ratio[2]	= 2.105;
		ratio[3]	= 1.456;
		ratio[4]	= 1.107;
		ratio[5]	= 0.963;
		ratio[7]	= -3.23;
		end_ratio	= 2.666;

		starter_torque	= 40.0;

		inertia = kgToInertia(13.0);
		maxRPM = 9000.0;

		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.20;
		diff_lock_max = 0.20;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}
}
