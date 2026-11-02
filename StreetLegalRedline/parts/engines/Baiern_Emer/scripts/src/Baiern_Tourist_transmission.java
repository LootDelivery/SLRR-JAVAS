package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Baiern_Tourist_transmission extends Transmission
{
	public Baiern_Tourist_transmission( int id )
	{
		super( id );
		name = "Baiern Tourist 5 speed street transmission";
		description = "This transmission was designed for the CoupeSport model, so it's tuned for joyful long trips. It suites the bends of the hills and the crowd of the city too. Medium long gears and medium high end ratio describe this unit. \n 1st:4.21   2nd:2.49   3rd:1.66   4th:1.24   5th:1.0 \n \n end ratio:3.23:1";

		value = tHUF2USD(127);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.580;
		ratio[2]	= 2.490;
		ratio[3]	= 1.660;
		ratio[4]	= 1.240;
		ratio[5]	= 1;
		ratio[7]	=-4.000;
		end_ratio	= 3.030;
		starter_torque	= 0.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.45;

		maxRPM = 10000.0;
		inertia = kgToInertia(13.8);

		check4warnings();

		drive_type = DT_RWD;
		drive_front_min = 0.0;
		drive_front_max = 0.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.15;
		diff_lock_max = 0.15;
		def_diff_lock = 0.15;
		diff_lock = def_diff_lock;
	}
}
