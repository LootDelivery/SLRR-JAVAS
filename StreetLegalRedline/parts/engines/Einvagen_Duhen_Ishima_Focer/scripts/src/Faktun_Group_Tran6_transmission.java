package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Faktun_Group_Tran6_transmission extends Transmission
{
	public Faktun_Group_Tran6_transmission( int id )
	{
		super( id );
		name = "Faktun Group Tran6 6 speed sport transmission";
		description = "The fully adjustable transmission of the Ishima Enula WR SuperTurizmo.";

		value = tHUF2USD(267);
		brand_new_prestige_value = 68.33;
		setMaxWear(kmToMaxWear(335000.0));

		gears		= 6;
		ratio[0]	= 0;
		ratio[1]	= 3.550;
		ratio[2]	= 2.510;
		ratio[3]	= 1.760;
		ratio[4]	= 1.210;
		ratio[5]	= 0.930;
		ratio[6]	= 0.750;
		ratio[7]	=-4.000;
		end_ratio	= 4.087;
		starter_torque	= 40.0;

		adjustable_gears = 1+2+4; // forward gears, reversing gear, end ratio //

		amount_of_oil_needed = 0.0; // internally lubricated //
		best_lubrication_sliction=0.99;
		worst_lubrication_sliction=0.85;

		maxRPM = 11000.0;
		inertia = kgToInertia(8.5);

		drive_type = DT_FWD;
		drive_front_min = 0.25;
		drive_front_max = 0.75;
		def_drive_front = 0.50;
		drive_front = def_drive_front;

		diff_lock_min = 0.10;
		diff_lock_max = 0.75;
		def_diff_lock = 0.25;
		diff_lock = def_diff_lock;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_ISHIMA)
		{
			if (the_car.model == Ishima_models.MODEL_ENULA_WRY)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E2r, "Faktun_Group_Tran6_transmission_RWD_extension", desc );
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WRZ)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E2r, "Faktun_Group_Tran6_transmission_RWD_extension", desc );
			}
			else
			if (the_car.model == Ishima_models.MODEL_ENULA_WR_SUPERTURIZMO)
			{
				addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E2r, "Faktun_Group_Tran6_transmission_RWD_extension", desc );
			}
		}
	}
}
