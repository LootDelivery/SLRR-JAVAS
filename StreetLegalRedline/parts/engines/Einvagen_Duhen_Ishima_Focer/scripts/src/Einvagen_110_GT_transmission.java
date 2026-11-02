package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Einvagen_110_GT_transmission extends Transmission
{
	public Einvagen_110_GT_transmission( int id )
	{
		super( id );
		name = "Einvagen 110 GT 5 speed street transmission";
		description = "This is the stock transmission for the Einvagen 110 GT models. \n It's a 5 speed unit set up for comfortable street riding with some sporty spicing. \n 1st:3.25   2nd:2.51   3rd:1.76   4th:1.21   5th:0.93 \n \n end ratio:4.01:1";

		value = tHUF2USD(48);
		brand_new_prestige_value = 44.70;
		setMaxWear(kmToMaxWear(265000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.535;
		ratio[2]	= 2.252;
		ratio[3]	= 1.557;
		ratio[4]	= 1.203;
		ratio[5]	= 0.930;
		ratio[7]	=-4.000;
		end_ratio	= 3.214;
		starter_torque	= 40.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.45;

		maxRPM = 10000.0;
		inertia = kgToInertia(8.5);

		drive_type = DT_FWD;
		drive_front_min = 1.0;
		drive_front_max = 1.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.15;
		diff_lock_max = 0.15;
		def_diff_lock = 0.15;
		diff_lock = def_diff_lock;
	}
}
