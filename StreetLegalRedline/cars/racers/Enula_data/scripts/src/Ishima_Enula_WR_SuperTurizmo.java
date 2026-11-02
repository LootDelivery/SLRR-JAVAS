package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Ishima_Enula_WR_SuperTurizmo extends Ishima_models
{
	public Ishima_Enula_WR_SuperTurizmo( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Ishima Co. Japan";
		model = MODEL_ENULA_WR_SUPERTURIZMO;
		vehicleName = "Ishima Enula WR SuperTurizmo";
		name = "Ishima Enula chassis";

		description = "The race version of the WR family. It is nearly a weapon with it's 2.4L (146 cui) turbocharged engine developing 360 HP thanks to the adjustable wastegate. This car was designed for the rallytracks, so it's very durable, all wheels are driven and the suspension travel is very long.";

		value = mHUF2USD(5.113);
		brand_new_prestige_value = 76.05;

		fully_stripped_drag = 0.55;
		brake_balance_can_be_set = 1;

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
		stock_parts_list_FL[ 1] = cars.racers.enula:0x0000012Er; // "FL quarterpanel 2" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.enula:0x00000120r; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.enula:0x0000012Fr; // "FR quarterpanel 2" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.enula:0x0000011Fr; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.enula:0x00000135r; // "RL quarterpanel 2" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.enula:0x0000013Br; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.enula:0x00000137r; // "RR quarterpanel 2" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.enula:0x0000012Dr; // "F bumper 2" //
		stock_parts_list_F[ 1] = cars.racers.enula:0x00000130r; // "hood 2" //
		stock_parts_list_F[ 2] = cars.racers.enula:0x0000011Br; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[ 0] = cars.racers.enula:0x00000132r; // "R bumper 2" //
		stock_parts_list_Rr[ 1] = cars.racers.enula:0x0000011Er; // "trunk" //
		stock_parts_list_Rr[ 2] = parts.wings:0x0000002Br; // "wing" //
		stock_parts_list_Rr[ 3] = cars.racers.enula:0x00000114r; // "R windshield" //

		stock_parts_list_L  = new int[4];
		stock_parts_list_L[ 0] = cars.racers.enula:0x00000131r; // "L sideskirt 2" //
		stock_parts_list_L[ 1] = cars.racers.enula:0x00000106r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.enula:0x00000134r; // "RL door 2" //
		stock_parts_list_L[ 3] = parts.interior:0x0000004Cr; // "FL seat" //

		stock_parts_list_R  = new int[4];
		stock_parts_list_R[ 0] = cars.racers.enula:0x00000133r; // "R sideskirt 2" //
		stock_parts_list_R[ 1] = cars.racers.enula:0x00000119r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.enula:0x00000136r; // "RR door 2" //
		stock_parts_list_R[ 3] = parts.interior:0x0000004Cr; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00004194r; // "WRS_FL_McPherson" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x00004195r; // "WRS_FR_McPherson" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x00004196r; // "WRS_RL_Trailing-arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x00004197r; // "WRS_RR_Trailing-arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x00000163r; // "WRS_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x00000164r; // "WRS_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x00000165r; // "WRS_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x00000166r; // "WRS_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000161r; // "WRS_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000162r; // "WRS_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x000041FFr; // "WRS_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x000041FFr; // "WRS_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000380r; // "Star_II_9.5x17_ET-30" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000380r; // "Star_II_9.5x17_ET-30" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003E9r; // "245_45_17_sport" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003E9r; // "245_45_17_sport" //

		// stage 1 //

		stg_1_rgear_kit_limit = 1.2;

		stg_1_parts_list_RGear_wheels = new int[4];
		stg_1_parts_list_RGear_wheels[ 0] = stg_1_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000382r; // "rim Star_II 9.5 19 ET -30 LOD CATALOG GARAGE" //
		stg_1_parts_list_RGear_wheels[ 2] = stg_1_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000382r; // "rim Star_II 9.5 19 ET -30 LOD CATALOG GARAGE" //

		stg_1_parts_list_RGear_tyres = new int[4];
		stg_1_parts_list_RGear_tyres[ 0] = stg_1_parts_list_RGear_tyres[ 1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stg_1_parts_list_RGear_tyres[ 2] = stg_1_parts_list_RGear_tyres[ 3] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( parts.interior:0x00000024r, "steering wheel" );

		if (desc.power > 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.3)/0.7*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		addPart( cars.racers.Enula:0x00000211r, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
	}
}
