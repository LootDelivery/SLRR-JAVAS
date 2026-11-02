package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_transmission extends Transmission
{
	public Einvagen_PerPro_GTA_transmission( int id )
	{
		super( id );
		name = "Einvagen PerPro GTA 6 speed street transmission";
		description = "This is the stock transmission for the Einvagen 140 GTA models. \n It's a 6 speed unit set up for comfortable street riding with some sporty spicing. \n 1st:3.25   2nd:2.51   3rd:1.76   4th:1.21   5th:0.93 \n \n end ratio:4.01:1";

		value = tHUF2USD(255);
		brand_new_prestige_value = 48.00;
		setMaxWear(kmToMaxWear(335000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 2.900;
		ratio[2]	= 2.102;
		ratio[3]	= 1.557;
		ratio[4]	= 1.203;
		ratio[5]	= 0.930;
		ratio[6]	= 0.775;
		ratio[7]	=-4.000;
		end_ratio	= 3.355;
		starter_torque	= 40.0;

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.75;

		maxRPM = 10000.0;
		inertia = kgToInertia(11.5);

		drive_type = DT_FWD;
		drive_front_min = 0.6;
		drive_front_max = 0.6;
		def_drive_front = drive_front_min;
		drive_front = def_drive_front;

		diff_lock_min = 0.00;
		diff_lock_max = 0.45;
		def_diff_lock = 0.20;
		diff_lock = def_diff_lock;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_EINVAGEN)
		{
			if (the_car.model == Einvagen_models.MODEL_140_GTA)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000062r, "Einvagen_PerPro_GTA_transmission_RWD_extension", desc );
			}
		}
	}
}
