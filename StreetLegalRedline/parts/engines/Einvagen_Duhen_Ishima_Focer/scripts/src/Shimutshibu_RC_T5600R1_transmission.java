package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;


public class Shimutshibu_RC_T5600R1_transmission extends Transmission
{
	public Shimutshibu_RC_T5600R1_transmission( int id )
	{
		super( id );
		name = "Shimutshibu RC-T5600R1 transmission";
		description = "";
		brand_new_prestige_value = 68.33;

		value = tHUF2USD(210);
		setMaxWear(kmToMaxWear(300000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.23;
		ratio[2]	= 2.105;
		ratio[3]	= 1.656;
		ratio[4]	= 1.287;
		ratio[5]	= 1.113;
		ratio[6]	= 0.963;
		ratio[7]	= -3.0;
		end_ratio	= 3.955;
		starter_torque	= 40.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.95;

		maxRPM = 10000.0;
		inertia = kgToInertia(7.5);

		drive_type = DT_FWD;
		drive_front_min = 0.25;
		drive_front_max = 0.75;
		def_drive_front = 0.50;
		drive_front = def_drive_front;

		diff_lock_min = 0.20;
		diff_lock_max = 0.20;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000101r, "Shimutshibu_RC_X8550SR5_transmission_RWD_extension", desc );
	}
}
