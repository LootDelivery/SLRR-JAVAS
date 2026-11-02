package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Emer_Nonus_Street_GT extends Emer_models
{
	public Emer_Nonus_Street_GT( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Emer Japanese-German Automobiles";
		model = MODEL_NONUS_STREET_GT;
		vehicleName = "Emer Nonus Street GT";
		name = "Emer Nonus Street GT chassis";

		description = "Is this car familiar? The Nonus Street GT is in closer relationship with the Baiern than you would think for the first look. The joint venture started refining the Baiern CoupeSport the year Baiern Cars Gmbh unveiled it's basic model the CoupeSport on the ValoCity Car Fanfare show in 1996. The base of the engine and the running gear is shared, they were just tweaked them for 2 years. It was worth waiting for this car, the street legal version of the manufacturers sportscar run in the GT II series.";

		value = mHUF2USD(1.995);
		brand_new_prestige_value = 45.80;

		fully_stripped_drag = 0.61;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(998) );
	}

	public void addStockParts( Descriptor desc )
	{

	// body parts lists //

		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Baiern_Emer:0x0000007Er; // "StreetGT 2.6L I6" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.nonus:0x000000A1r; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.nonus:0x000000A0r; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.nonus:0x0000009Ar; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.nonus:0x000000A3r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.nonus:0x0000009Dr; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.nonus:0x000000A8r; // "RL quarterpanel" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.nonus:0x000000A7r; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.nonus:0x000000A9r; // "RR quarterpanel" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.nonus:0x0000009Cr; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.nonus:0x00000092r; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.nonus:0x000000A2r; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[ 0] = cars.racers.nonus:0x0000009Fr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.nonus:0x0000009Er; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.nonus:0x00000094r; // "R windshield" //
		stock_parts_list_Rr[ 3] = cars.racers.nonus:0x00000099r; // "R seats" //

		stock_parts_list_L  = new int[3];
		stock_parts_list_L[ 0] = cars.racers.nonus:0x00000093r; // "FL door" //
		stock_parts_list_L[ 1] = cars.racers.nonus:0x00000096r; // "RL window" //
		stock_parts_list_L[ 2] = cars.racers.nonus:0x00000097r; // "FL seat" //

		stock_parts_list_R  = new int[3];
		stock_parts_list_R[ 0] = cars.racers.nonus:0x000000A6r; // "FR door" //
		stock_parts_list_R[ 1] = cars.racers.nonus:0x000000A5r; // "RR window" //
		stock_parts_list_R[ 2] = cars.racers.nonus:0x000000AAr; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x000001ECr; // "Nonus_SGT_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x000001EDr; // "Nonus_SGT_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x000001EEr; // "Nonus_SGT_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x000001EFr; // "Nonus_SGT_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001AAr; // "shock_absorber_Nonus_SGT_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001ACr; // "shock_absorber_Nonus_SGT_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001D6r; // "spring_Nonus_SGT_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001D7r; // "spring_Nonus_SGT_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000152r; // "brake_Nonus_SGT_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000153r; // "brake_Nonus_SGT_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x0000018Br; // "swaybar_Nonus_SGT_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x0000018Cr; // "swaybar_Nonus_SGT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000002A8r; // "rim DevilSport_5 9.0 19 ET 0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000002A8r; // "rim DevilSport_5 9.0 19 ET 0 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003E5r; // "tyre 235 45 19 9.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003E5r; // "tyre 235 45 19 9.0 LOD CATALOG GARAGE" //

		// stage 1 //

		stg_1_rgear_kit_limit = 1.3;

		stg_1_parts_list_RGear_suspensions = new int[4];
		stg_1_parts_list_RGear_suspensions[ 0] = parts:0x000001F0r; // "Nonus_GT2_FL_McPherson_strut" //
		stg_1_parts_list_RGear_suspensions[ 1] = parts:0x000001F1r; // "Nonus_GT2_FR_McPherson_strut" //
		stg_1_parts_list_RGear_suspensions[ 2] = parts:0x000001F2r; // "Nonus_GT2_RL_trailing_arm" //
		stg_1_parts_list_RGear_suspensions[ 3] = parts:0x000001F3r; // "Nonus_GT2_RR_trailing_arm" //

		stg_1_parts_list_RGear_shocks = new int[4];
		stg_1_parts_list_RGear_shocks[ 0] = stg_1_parts_list_RGear_shocks[ 1] = parts:0x000001ADr; // "shock_absorber_Nonus_GT2_front" //
		stg_1_parts_list_RGear_shocks[ 2] = stg_1_parts_list_RGear_shocks[ 3] = parts:0x000001AEr; // "shock_absorber_Nonus_GT2_rear" //

		stg_1_parts_list_RGear_springs = new int[4];
		stg_1_parts_list_RGear_springs[ 0] = stg_1_parts_list_RGear_springs[ 1] = parts:0x000001D8r; // "spring_Nonus_GT2_front" //
		stg_1_parts_list_RGear_springs[ 2] = stg_1_parts_list_RGear_springs[ 3] = parts:0x000001D9r; // "spring_Nonus_GT2_rear" //

		stg_1_parts_list_RGear_brakes = new int[4];
		stg_1_parts_list_RGear_brakes[ 0] = stg_1_parts_list_RGear_brakes[ 1] = parts:0x00000155r; // "brake_Nonus_GT2_front" //
		stg_1_parts_list_RGear_brakes[ 2] = stg_1_parts_list_RGear_brakes[ 3] = parts:0x00000156r; // "brake_Nonus_GT2_rear" //

//		stg_1_parts_list_RGear_sways = new int[2];
//		stg_1_parts_list_RGear_sways[ 0] = parts:0x0000018Dr; // "swaybar_Nonus_GT2_front" //
//		stg_1_parts_list_RGear_sways[ 1] = parts:0x0000018Er; // "swaybar_Nonus_GT2_rear" //

		stg_1_parts_list_RGear_wheels = new int[4];
		stg_1_parts_list_RGear_wheels[ 0] = stg_1_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000400r; // "rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE" //
		stg_1_parts_list_RGear_wheels[ 2] = stg_1_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000400r; // "rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE" //

		stg_1_parts_list_RGear_tyres = new int[4];
		stg_1_parts_list_RGear_tyres[ 0] = stg_1_parts_list_RGear_tyres[ 1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stg_1_parts_list_RGear_tyres[ 2] = stg_1_parts_list_RGear_tyres[ 3] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Nonus:0x00000098r, "steering wheel" );

		addPart( cars.racers.Nonus:0x000000E5r, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.25)
		{
			addPart( parts.wings:0x0000002Ar, "wing" );
		}

		if (desc.power > 1.05 && desc.power < 1.2)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Baiern_Emer:0x00000051r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.05)/0.15*0.300+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.1)
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
		if (desc.power > 1.4)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Baiern_Emer:0x00000051r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.4)/0.6*0.800+0.200),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}
