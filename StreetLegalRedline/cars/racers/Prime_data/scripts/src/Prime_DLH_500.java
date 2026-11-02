package java.game.cars;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Prime_DLH_500 extends Prime_models
{
	public Prime_DLH_500( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Prime Finest American Automobiles";
		model = MODEL_DLH_500;
		vehicleName = "Prime DLH 500";
		name = "Prime DLH 500 chassis";

		description = "A beautiful retro construction of the good old Prime DLH '67. It's one of only 170 pieces. Buy it without hesitation!";

		value = mHUF2USD(2.741);
		brand_new_prestige_value = 95.90;

		fully_stripped_drag = 0.56;
		brake_balance_can_be_set = 1;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(36) );
		exhaustSlotIDList.addElement( new Integer(37) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		if (desc.power > 0.0)
		{
			stock_parts_list_E  = new int[2];
			stock_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x0000003Fr; // "7.0L V8" //
			stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //
		}

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[ 0] = cars.racers.prime:0x000000DBr; // "FL quarterpanel" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[ 0] = cars.racers.prime:0x000000D8r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.prime:0x000000B9r; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.prime:0x000000DCr; // "RL quarterpanel" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.prime:0x000000C8r; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.prime:0x000000D7r; // "RR quarterpanel" //

		stock_parts_list_F  = new int[9];
		stock_parts_list_F[ 0] = cars.racers.prime:0x000000D9r; // "F spoiler" //
		stock_parts_list_F[ 1] = cars.racers.prime:0x000000D6r; // "F bumper" //
		stock_parts_list_F[ 2] = cars.racers.prime:0x000000D5r; // "F mask" //
		stock_parts_list_F[ 3] = cars.racers.prime:0x000000B8r; // "L foglight" //
		stock_parts_list_F[ 4] = cars.racers.prime:0x000000C9r; // "R foglight" //
		stock_parts_list_F[ 5] = cars.racers.prime:0x000000C0r; // "L headlights" //
		stock_parts_list_F[ 6] = cars.racers.prime:0x000000C5r; // "R headlights" //
		stock_parts_list_F[ 7] = cars.racers.prime:0x000000DAr; // "hood" //
		stock_parts_list_F[ 8] = cars.racers.prime:0x000000BCr; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[ 0] = cars.racers.prime:0x000000BFr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.prime:0x000000BAr; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.prime:0x000000BEr; // "R windshield" //
		stock_parts_list_Rr[ 3] = cars.racers.prime:0x000000BBr; // "R seats" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 0] = cars.racers.prime:0x000000CCr; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.prime:0x000000B7r; // "FL door" //
		stock_parts_list_L[ 3] = cars.racers.prime:0x000000DDr; // "L mirror" //
		stock_parts_list_L[ 2] = cars.racers.prime:0x000000BDr; // "FL window" //
		stock_parts_list_L[ 4] = cars.racers.prime:0x000000D3r; // "FL seat" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 0] = cars.racers.prime:0x000000C1r; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.prime:0x000000C6r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.prime:0x000000DEr; // "R mirror" //
		stock_parts_list_R[ 3] = cars.racers.prime:0x000000C7r; // "FR window" //
		stock_parts_list_R[ 4] = cars.racers.prime:0x000000D4r; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00000209r; // "Prime_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x0000020Ar; // "Prime_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000020Br; // "Prime_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000020Cr; // "Prime_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001BBr; // "shock_absorber_Prime_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001BDr; // "shock_absorber_Prime_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001E4r; // "spring_Prime_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001E5r; // "spring_Prime_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000174r; // "brake_Prime_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000175r; // "brake_Prime_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x000001A0r; // "swaybar_Prime_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x000001A1r; // "swaybar_Prime_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000002C2r; // "rim Prime_DLH 9.0 17 ET -30 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000002C0r; // "rim Prime_DLH 10.0 17 ET -30 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003E3r; // "tyre 235 45 17 9.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x00000441r; // "tyre 265 45 17 11.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Prime:0x000000C4r, "steering wheel" );

		addPart( cars.racers.Prime:0x00000009r, "L_stock_exhaust_pipe" );
		addPart( cars.racers.Prime:0x0000000Cr, "R_stock_exhaust_pipe" );
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
