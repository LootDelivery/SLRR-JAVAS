package java.game.parts.engines.MC_Prime_SuperDuty;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class MC_Prime_SuperDuty_transmission extends Transmission
{
	public MC_Prime_SuperDuty_transmission( int id )
	{
		super( id );
		name = "Prime DLH transmission";
		description = "";
		brand_new_prestige_value = 58.53;

		value = tHUF2USD(118.047);
		setMaxWear(kmToMaxWear(511000.0));

		gears	= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.5;
		ratio[2]	= 2.7;
		ratio[3]	= 1.9;
		ratio[4]	= 1.3;
		ratio[5]	= 1;
		ratio[7]	= -4;
		end_ratio	= 2.88;

		starter_torque	= 50.0;

		inertia = kgToInertia(9.0);

		maxRPM = 13000.0;

		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.25;
		diff_lock_max = 0.45;
		def_diff_lock = 0.35;
		diff_lock = def_diff_lock;
	}
}
