package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Ishima_Enula_WRY extends Ishima_models
{
	public Ishima_Enula_WRY( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Ishima Co. Japan";
		model = MODEL_ENULA_WRY;
		vehicleName = "Ishima Enula WRY";
		name = "Ishima Enula chassis";

		description = "The N/A street version of the WR SuperTurizmo. It has a street-legal high-tech 4-wheel drive running gear borrowed from the racing version and a 2.0L (122 cui) engine developing around 180 HP. This car is very durable and is raised high compared to other production cars nowadays, so perfect for the street rally artists.";

		value = mHUF2USD(2.004);
		brand_new_prestige_value = 41.47;

		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(22) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000DFr; // "IshiBox 2.4L I4" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.enula:0x0000011Dr; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.enula:0x00000123r; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.enula:0x00000120r; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.enula:0x00000129r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.enula:0x0000011Fr; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.enula:0x0000012Ar; // "RL quarterpanel" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.enula:0x0000013Br; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.enula:0x0000012Cr; // "RR quarterpanel" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.enula:0x0000012Br; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.enula:0x00000125r; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.enula:0x0000011Br; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[ 0] = cars.racers.enula:0x00000124r; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.enula:0x0000011Er; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.enula:0x00000114r; // "R windshield" //
		stock_parts_list_Rr[ 3] = cars.racers.enula:0x00000109r; // "R seats" //

		stock_parts_list_L  = new int[4];
		stock_parts_list_L[ 0] = cars.racers.enula:0x00000121r; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.enula:0x00000106r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.enula:0x00000127r; // "RL door" //
		stock_parts_list_L[ 3] = cars.racers.enula:0x00000108r; // "FL seat" //

		stock_parts_list_R  = new int[4];
		stock_parts_list_R[ 0] = cars.racers.enula:0x00000122r; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.enula:0x00000119r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.enula:0x00000128r; // "RR door" //
		stock_parts_list_R[ 3] = cars.racers.enula:0x0000011Ar; // "FR seat" //

		// stage 1 stuffs //

		stg_1_parts_list_FL = new int[2];
		stg_1_parts_list_FL[ 0] = cars.racers.enula:0x0000011Dr; // "L headlights" //
		stg_1_parts_list_FL[ 1] = cars.racers.enula:0x0000012Er; // "FL quarterpanel 2" //

		stg_1_parts_list_FR = new int[2];
		stg_1_parts_list_FR[ 0] = cars.racers.enula:0x00000120r; // "R headlights" //
		stg_1_parts_list_FR[ 1] = cars.racers.enula:0x0000012Fr; // "FR quarterpanel 2" //

		stg_1_parts_list_RL = new int[2];
		stg_1_parts_list_RL[ 0] = cars.racers.enula:0x0000011Fr; // "L taillights" //
		stg_1_parts_list_RL[ 1] = cars.racers.enula:0x00000135r; // "RL quarterpanel 2" //

		stg_1_parts_list_RR = new int[2];
		stg_1_parts_list_RR[ 0] = cars.racers.enula:0x0000013Br; // "R taillights" //
		stg_1_parts_list_RR[ 1] = cars.racers.enula:0x00000137r; // "RR quarterpanel 2" //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[ 0] = cars.racers.enula:0x0000012Dr; // "F bumper 2" //
		stg_1_parts_list_F[ 1] = cars.racers.enula:0x00000130r; // "hood 2" //
		stg_1_parts_list_F[ 2] = cars.racers.enula:0x0000011Br; // "F windshield" //

		stg_1_parts_list_Rr = new int[4];
		stg_1_parts_list_Rr[ 0] = cars.racers.enula:0x00000132r; // "R bumper 2" //
		stg_1_parts_list_Rr[ 1] = cars.racers.enula:0x0000011Er; // "trunk" //
		stg_1_parts_list_Rr[ 2] = cars.racers.enula:0x00000114r; // "R windshield" //
		stg_1_parts_list_Rr[ 3] = cars.racers.enula:0x00000109r; // "R seats" //

		stg_1_parts_list_L  = new int[4];
		stg_1_parts_list_L[ 0] = cars.racers.enula:0x00000131r; // "L sideskirt 2" //
		stg_1_parts_list_L[ 1] = cars.racers.enula:0x00000106r; // "FL door" //
		stg_1_parts_list_L[ 2] = cars.racers.enula:0x00000134r; // "RL door 2" //
		stg_1_parts_list_L[ 3] = cars.racers.enula:0x00000108r; // "FL seat" //

		stg_1_parts_list_R  = new int[4];
		stg_1_parts_list_R[ 0] = cars.racers.enula:0x00000133r; // "R sideskirt 2" //
		stg_1_parts_list_R[ 1] = cars.racers.enula:0x00000119r; // "FR door" //
		stg_1_parts_list_R[ 2] = cars.racers.enula:0x00000136r; // "RR door 2" //
		stg_1_parts_list_R[ 3] = cars.racers.enula:0x0000011Ar; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00004009r; // "WRY_FL_McPherson" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x000040FCr; // "WRY_FR_McPherson" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x000040FDr; // "WRY_RL_Trailing-arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x000040FEr; // "WRY_RR_Trailing-arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000000FDr; // "WRY_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000000FCr; // "WRY_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000000FEr; // "WRY_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000000FFr; // "WRY_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000100r; // "WRY_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000101r; // "WRY_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x00000193r; // "WRY_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x00000194r; // "WRY_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000370r; // "Star_II_8.5x17_ET-30" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000370r; // "Star_II_8.5x17_ET-30" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003DBr; // "215_50_17_sport" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003DBr; // "215_50_17_sport" //

		super.addStockParts( desc );

		addPart( cars.racers.Enula:0x0000011Cr, "steering wheel" );

		if (desc.power > 1.1 && desc.power < 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.1)/0.2*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.2)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			{
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
		else
		if (desc.power > 1.5)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.5)/0.5*0.700+0.300),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		addPart( cars.racers.Enula:0x00000111r, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
	}
}
