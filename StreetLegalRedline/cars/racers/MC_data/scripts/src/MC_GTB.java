package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class MC_GTB extends MC_models
{
	public MC_GTB( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Muscle Cars America";
		model = MODEL_GTB;
		vehicleName = "MC GT B-series";
		name = "MC GT B-series chassis";

		description = "An optically modified type of the first GTs. After the original version was not produced any more from 1971 the GT-B came to it's place. It's comfort level is the same as the GTLE has, but the engine and suspension wasn't adapted from the anniversary edition, so more muscle lovers could afford a GT-B. Somehow people of Valo City prefer the original model, thus you can find more GT-Bs than GTs on the market. More expensive, less prestige, but it's easier to find one that is in good condition.";

		value = mHUF2USD(3.089);
		brand_new_prestige_value = 46.60;

		fully_stripped_drag = 0.56;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(24) );
		exhaustSlotIDList.addElement( new Integer(39) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x00000001r; // "6.5L V8" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.mc:0x000000A8r; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.mc:0x000000B9r; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.mc:0x000000BCr; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.mc:0x000000C4r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.mc:0x000000ACr; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.mc:0x000000BBr; // "RL quarterpanel" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.mc:0x000000BDr; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.mc:0x000000C3r; // "RR quarterpanel" //

		stock_parts_list_F  = new int[6];
		stock_parts_list_F[ 0] = cars.racers.mc:0x0000010Br; // "F bumper 2" //
		stock_parts_list_F[ 1] = cars.racers.mc:0x000000B8r; // "F grill frame A" //
		stock_parts_list_F[ 2] = cars.racers.mc:0x000000BAr; // "F grill frame B" //
		stock_parts_list_F[ 3] = cars.racers.mc:0x000000B7r; // "F grill" //
		stock_parts_list_F[ 4] = cars.racers.mc:0x000000B6r; // "hood" //
		stock_parts_list_F[ 5] = cars.racers.mc:0x000000B0r; // "F windshield" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[ 0] = cars.racers.mc:0x000000AAr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.mc:0x000000ADr; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.mc:0x000000ABr; // "R wing" //
		stock_parts_list_Rr[ 3] = cars.racers.mc:0x000000B1r; // "R windshield" //
		stock_parts_list_Rr[ 4] = cars.racers.mc:0x000000B4r; // "R seats" //

		stock_parts_list_L  = new int[2];
		stock_parts_list_L[ 0] = cars.racers.mc:0x000000AEr; // "FL door" //
		stock_parts_list_L[ 1] = cars.racers.mc:0x000000B2r; // "FL seat" //

		stock_parts_list_R  = new int[2];
		stock_parts_list_R[ 0] = cars.racers.mc:0x000000C2r; // "FR door" //
		stock_parts_list_R[ 1] = cars.racers.mc:0x000000BFr; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00000201r; // "MC_GTB_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x00000202r; // "MC_GTB_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x00000203r; // "MC_GTB_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x00000204r; // "MC_GTB_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001B7r; // "shock_absorber_MC_GTB_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001B8r; // "shock_absorber_MC_GTB_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001E0r; // "spring_MC_GTB_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001E1r; // "spring_MC_GTB_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000170r; // "brake_MC_GTB_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000171r; // "brake_MC_GTB_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x0000019Br; // "swaybar_MC_GTB_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x0000019Cr; // "swaybar_MC_GTB_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000002BEr; // "rim MT_Mescaline 9.0 15 ET -20 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000002BAr; // "rim MT_Mescaline 10.0 15 ET -40 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x0000042Dr; // "tyre 215 50 15 8.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x0000042Br; // "tyre 255 50 15 9.5 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.MC:0x000000B3r, "steering wheel" );

		addPart( cars.racers.MC:0x00000129r, "stock_L_exhaust_pipe" );
		addPart( cars.racers.MC:0x0000012Ar, "stock_R_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.4)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.MC_Prime_SuperDuty:0x000000BFr, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.4)/0.6*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			if (desc.power > 1.6)
			{
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001C1r, "12pds canister" );
			}
		}
	}
}
