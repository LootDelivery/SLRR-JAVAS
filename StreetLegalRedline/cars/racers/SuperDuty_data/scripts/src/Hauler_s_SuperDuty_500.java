package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Hauler_s_SuperDuty_500 extends Hauler_s_models
{
	public Hauler_s_SuperDuty_500( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Hauler's";
		model = MODEL_SUPERDUTY_500;
		vehicleName = "Hauler's SuperDuty 500";
		name = "Hauler's SuperDuty chassis";

		description = "This is not a racer, not a light mobile and even not a young model. But it's very strong and still fashionalbe despite it was first manufactured in 1990. Production stopped 10 years after the first car rolled out from the factory so you can't buy it brand new, but it's very reliable even in used state and can be easily converted to a sports-pickup with minor modifications. The tremendous full-time 500Nm (369 lbf feet) torque and nearly 280 HP easily moves the 2.25-ton body up to 200 KPH (125 MPH) where engine electronics cut. It's also a chick-magnet and you can give a party on the flatbed, it's so big. So just let's try it.";

		value = mHUF2USD(2.056);
		brand_new_prestige_value = 63.40;
 
		fully_stripped_drag = 0.54;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(18) );
		exhaustSlotIDList.addElement( new Integer(23) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x0000000Ar; // "5.4L V8" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.superduty:0x000000B6r; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.superduty:0x000000BBr; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.superduty:0x000000C6r; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.superduty:0x000000BEr; // "FR quarterpanel" //

		stock_parts_list_RL = new int[1];
		//stock_parts_list_RL[ 0] = cars.racers.superduty:0x000000B8r; // "L taillights" //
		stock_parts_list_RL[ 0] = cars.racers.superduty:0x000000BCr; // "RL quarterpanel" //

		stock_parts_list_RR = new int[1];
		//stock_parts_list_RR[ 0] = cars.racers.superduty:0x000000C5r; // "R taillights" //
		stock_parts_list_RR[ 0] = cars.racers.superduty:0x000000CAr; // "RR quarterpanel" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.superduty:0x000000B0r; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.superduty:0x000000B5r; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.superduty:0x000000B1r; // "F windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[ 0] = cars.racers.superduty:0x000000C7r; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.superduty:0x000000BDr; // "R door" //
		stock_parts_list_Rr[ 2] = cars.racers.superduty:0x000000B2r; // "R windshield" //

		stock_parts_list_L  = new int[3];
		stock_parts_list_L[ 0] = cars.racers.superduty:0x000000CEr; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.superduty:0x000000C9r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.superduty:0x000000B3r; // "FL seat" //

		stock_parts_list_R  = new int[3];
		stock_parts_list_R[ 0] = cars.racers.superduty:0x000000CCr; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.superduty:0x000000C0r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.superduty:0x000000CBr; // "FR seat" //

		// stage 1 stuffs //

		stg_1_engne_kit_limit = 1.25;

		stg_1_parts_list_E  = new int[2];
		stg_1_parts_list_E[ 0] = parts.engines.MC_Prime_SuperDuty:0x00000001r; // "6.5L V8" //
		stg_1_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stg_1_parts_list_FL = new int[2];
		stg_1_parts_list_FL[ 0] = cars.racers.superduty:0x000000B6r; // "L headlights" //
		stg_1_parts_list_FL[ 1] = cars.racers.superduty:0x000000BBr; // "FL quarterpanel" //

		stg_1_parts_list_FR = new int[2];
		stg_1_parts_list_FR[ 0] = cars.racers.superduty:0x000000C6r; // "R headlights" //
		stg_1_parts_list_FR[ 1] = cars.racers.superduty:0x000000BEr; // "FR quarterpanel" //

		stg_1_parts_list_RL = new int[1];
		//stg_1_parts_list_RL[ 0] = cars.racers.superduty:0x000000B8r; // "L taillights" //
		stg_1_parts_list_RL[ 0] = cars.racers.superduty:0x000000C3r; // "RL quarterpanel 2" //

		stg_1_parts_list_RR = new int[1];
		//stg_1_parts_list_RR[ 0] = cars.racers.superduty:0x000000C5r; // "R taillights" //
		stg_1_parts_list_RR[ 0] = cars.racers.superduty:0x000000C8r; // "RR quarterpanel 2" //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[ 0] = cars.racers.superduty:0x000000C4r; // "F bumper 2" //
		stg_1_parts_list_F[ 1] = cars.racers.superduty:0x000000C2r; // "hood 2" //
		stg_1_parts_list_F[ 2] = cars.racers.superduty:0x000000B1r; // "F windshield" //

		stg_1_parts_list_Rr = new int[3];
		stg_1_parts_list_Rr[ 0] = cars.racers.superduty:0x000000B9r; // "R bumper 2" //
		stg_1_parts_list_Rr[ 1] = cars.racers.superduty:0x000000BDr; // "R door" //
		stg_1_parts_list_Rr[ 2] = cars.racers.superduty:0x000000B2r; // "R windshield" //

		stg_1_parts_list_L  = new int[3];
		stg_1_parts_list_L[ 0] = cars.racers.superduty:0x000000CDr; // "L sideskirt 2" //
		stg_1_parts_list_L[ 1] = cars.racers.superduty:0x000000C9r; // "FL door" //
		stg_1_parts_list_L[ 2] = cars.racers.superduty:0x000000B3r; // "FL seat" //

		stg_1_parts_list_R  = new int[3];
		stg_1_parts_list_R[ 0] = cars.racers.superduty:0x000000CFr; // "R sideskirt 2" //
		stg_1_parts_list_R[ 1] = cars.racers.superduty:0x000000C0r; // "FR door" //
		stg_1_parts_list_R[ 2] = cars.racers.superduty:0x000000CBr; // "FR seat" //

		// stage 2 stuffs //

		stg_2_parts_list_F  = new int[4];
		stg_2_parts_list_F[ 0] = cars.racers.superduty:0x000000D0r; // "F brush guard" //
		stg_2_parts_list_F[ 1] = cars.racers.superduty:0x000000C4r; // "F bumper 2" //
		stg_2_parts_list_F[ 2] = cars.racers.superduty:0x000000C2r; // "hood 2" //
		stg_2_parts_list_F[ 3] = cars.racers.superduty:0x000000B1r; // "F windshield" //

		stg_2_parts_list_Rr = new int[4];
		stg_2_parts_list_Rr[ 0] = cars.racers.superduty:0x000000B9r; // "R bumper 2" //
		stg_2_parts_list_Rr[ 1] = cars.racers.superduty:0x000000BDr; // "R door" //
		stg_2_parts_list_Rr[ 2] = cars.racers.superduty:0x000000D1r; // "rollbar" //
		stg_2_parts_list_Rr[ 3] = cars.racers.superduty:0x000000B2r; // "R windshield" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x000001F4r; // "SuperDuty_500_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x000001F5r; // "SuperDuty_500_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x000001F6r; // "SuperDuty_500_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x000001F7r; // "SuperDuty_500_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000001B0r; // "shock_absorber_SuperDuty_500_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000001B1r; // "shock_absorber_SuperDuty_500_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000001DAr; // "spring_SuperDuty_500_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000001DBr; // "spring_SuperDuty_500_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000157r; // "brake_SuperDuty_500_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000158r; // "brake_SuperDuty_500_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x0000018Fr; // "swaybar_SuperDuty_500_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x00000190r; // "swaybar_SuperDuty_500_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x00000386r; // "rim MT_Mescaline 9.0 15 ET -20 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x00000386r; // "rim MT_Mescaline 10.0 15 ET -40 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003E7r; // "tyre 215 50 15 8.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003e7r; // "tyre 255 50 15 9.5 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.SuperDuty:0x000000B4r, "steering wheel" );

		addPart( cars.racers.SuperDuty:0x00000114r, "L_stock_exhaust_pipe" );
		addPart( cars.racers.SuperDuty:0x0000011Ar, "R_stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.25)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.MC_Prime_SuperDuty:0x000000BFr, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.6)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			{
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
	}
}
