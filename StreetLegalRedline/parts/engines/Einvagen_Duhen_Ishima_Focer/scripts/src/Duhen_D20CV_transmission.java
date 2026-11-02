package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Duhen_D20CV_transmission extends Transmission
{
	public Duhen_D20CV_transmission( int id )
	{
		super( id );
		name = "Duhen D20CV transmission";
		description = "";
		brand_new_prestige_value = 75.00;

		value = tHUF2USD(240);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.727;
		ratio[2]	= 2.784;
		ratio[3]	= 2.105;
		ratio[4]	= 1.456;
		ratio[5]	= 1.107;
		ratio[6]	= 0.875;
		ratio[7]	= -3.0;
		end_ratio	= 3.366;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears, reversing gear, end ratio //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.95;

		maxRPM = 12000.0;
		inertia = kgToInertia(7.5);

		drive_type = DT_FWD;
		drive_front_min = 0.35;
		drive_front_max = 0.65;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.20;
		diff_lock_max = 0.20;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000061r, "Duhen_D20CV_transmission_RWD_extension", desc );
	}
}
