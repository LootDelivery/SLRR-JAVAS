package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Baiern_DevilSport extends Baiern_models
{
	public Baiern_DevilSport( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Baiern Cars Gmbh";
		model = MODEL_DEVILSPORT;
		vehicleName = "Baiern DevilSport";
		name = "Baiern DevilSport chassis";

		description = "The first rule for Baiern Devils was always to create cars that can not be missed. The base was the CoupeSport, so they dropped the top to get rid of 60 Kgs and dropped in a 3.6L inline-6 to get 20 back. The car became a looks master when the chassis was dropped by 6 cms (2.36 inches) and got 12.0x19 inch full chrome Rushing Devil rims with 255/40 ZR19 sport tyres all around to get enough grip. The model is not a 'comfortable sporty car' anymore. It's a prestige bomb.";

		value = mHUF2USD(3.0);
		brand_new_prestige_value = 37.84;

		fully_stripped_drag = 0.53;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(22) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Baiern_Emer:0x00000052r; // "3.6L I6" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.baiern:0x00000111r; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.baiern:0x00000110r; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.baiern:0x00000117r; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.baiern:0x00000116r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.baiern:0x00000108r; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.baiern:0x00000109r; // "RL quarterpanel" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.baiern:0x00000114r; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.baiern:0x00000119r; // "RR quarterpanel" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.baiern:0x0000010Fr; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.baiern:0x0000010Dr; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.baiern:0x0000010Br; // "F windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[ 0] = cars.racers.baiern:0x00000107r; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.baiern:0x00000118r; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.baiern:0x00000106r; // "R seats" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 0] = cars.racers.baiern:0x0000011Er; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.baiern:0x00000115r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.baiern:0x00000104r; // "L mirror" //
		stock_parts_list_L[ 3] = cars.racers.baiern:0x0000010Er; // "FL window" //
		stock_parts_list_L[ 4] = cars.racers.baiern:0x00000103r; // "FL seat" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 0] = cars.racers.baiern:0x00000126r; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.baiern:0x00000128r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.baiern:0x0000011Ar; // "R mirror" //
		stock_parts_list_R[ 3] = cars.racers.baiern:0x00000112r; // "FR window" //
		stock_parts_list_R[ 4] = cars.racers.baiern:0x00000113r; // "FR seat" //

		// stage 1 stuffs //

		stg_1_parts_list_RL = new int[2];
		stg_1_parts_list_RL[ 0] = cars.racers.baiern:0x00000108r; // "L taillights" //
		stg_1_parts_list_RL[ 1] = cars.racers.baiern:0x00000123r; // "RL quarterpanel 2" //

		stg_1_parts_list_RR = new int[2];
		stg_1_parts_list_RR[ 0] = cars.racers.baiern:0x00000114r; // "R taillights" //
		stg_1_parts_list_RR[ 1] = cars.racers.baiern:0x00000129r; // "RR quarterpanel 2" //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[ 0] = cars.racers.baiern:0x0000011Dr; // "F bumper 2" //
		stg_1_parts_list_F[ 1] = cars.racers.baiern:0x00000125r; // "hood 3" //
		stg_1_parts_list_F[ 2] = cars.racers.baiern:0x0000010Br; // "F windshield" //

		stg_1_parts_list_Rr = new int[3];
		stg_1_parts_list_Rr[ 0] = cars.racers.baiern:0x0000011Fr; // "R bumper 3" //
		stg_1_parts_list_Rr[ 1] = cars.racers.baiern:0x00000118r; // "trunk" //
		stg_1_parts_list_Rr[ 2] = cars.racers.baiern:0x00000106r; // "R seats" //

		stg_1_parts_list_L  = new int[5];
		stg_1_parts_list_L[ 0] = cars.racers.baiern:0x00000122r; // "L sideskirt 2" //
		stg_1_parts_list_L[ 1] = cars.racers.baiern:0x00000121r; // "FL door 2" //
		stg_1_parts_list_L[ 2] = cars.racers.baiern:0x00000104r; // "L mirror" //
		stg_1_parts_list_L[ 3] = cars.racers.baiern:0x0000010Er; // "FL window" //
		stg_1_parts_list_L[ 4] = cars.racers.baiern:0x00000103r; // "FL seat" //

		stg_1_parts_list_R  = new int[5];
		stg_1_parts_list_R[ 0] = cars.racers.baiern:0x00000127r; // "R sideskirt 2" //
		stg_1_parts_list_R[ 1] = cars.racers.baiern:0x0000012Ar; // "FR door 2" //
		stg_1_parts_list_R[ 2] = cars.racers.baiern:0x0000011Ar; // "R mirror" //
		stg_1_parts_list_R[ 3] = cars.racers.baiern:0x00000112r; // "FR window" //
		stg_1_parts_list_R[ 4] = cars.racers.baiern:0x00000113r; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x0000010Cr; // "Baiern_DS_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x0000010Dr; // "Baiern_DS_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000010Er; // "Baiern_DS_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000010Fr; // "Baiern_DS_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x000000E7r; // "shock_absorber_Baiern_DS_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x000000EBr; // "shock_absorber_Baiern_DS_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x000000F0r; // "spring_Baiern_DS_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x000000F1r; // "spring_Baiern_DS_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x000000D8r; // "brake_Baiern_DS_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x000000D9r; // "brake_Baiern_DS_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x0000021Br; // "swaybar_Baiern_DS_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x0000021Cr; // "swaybar_Baiern_DS_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000003ACr; // "rim Blossom 9.0 19 ET 0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000003A0r; // "rim Blossom 10.5 19 ET 0 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003E5r; // "235_45_19_sport" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003F7r; // "275_40_19_sport" //

		super.addStockParts( desc );

		addPart( cars.racers.Baiern:0x00000160r, "steering wheel" );

		addPart( cars.racers.Baiern:0x00000182r, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.55)
		{
			addPart( parts.wings:0x0000002Br, "wing" );
		}

		if (desc.power > 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Baiern_Emer:0x00000051r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.3)/0.7*0.500+0.200),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			if (desc.power > 1.5)
			{
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			{
				addPart( parts:0x000001C1r, "12pds canister" );
			}
		}
	}
}
