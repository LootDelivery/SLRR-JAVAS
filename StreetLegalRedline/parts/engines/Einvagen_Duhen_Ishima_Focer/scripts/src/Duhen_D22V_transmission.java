package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_D22V_transmission extends Transmission
{
	public Duhen_D22V_transmission( int id )
	{
		super( id );
		name = "Duhen D22V transmission";
		description = "";
		brand_new_prestige_value = 44.70;

		value = tHUF2USD(129);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 5;
		ratio[0]	= 0;
		ratio[1]	= 3.230;
		ratio[2]	= 2.105;
		ratio[3]	= 1.456;
		ratio[4]	= 1.107;
		ratio[5]	= 0.875;
		ratio[7]	=-3.400;
		end_ratio	= 4.040;
		starter_torque	= 40.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.45;

		maxRPM = 12000.0;
		inertia = kgToInertia(8.5);

		drive_type = DT_FWD;
		drive_front_min = 1.0;
		drive_front_max = 1.0;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.22;
		diff_lock_max = 0.22;
		def_diff_lock = 0.22;
		diff_lock = def_diff_lock;
	}
}
