package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Duhen_SunStrip_2_2_DVC extends Duhen_models
{
	public Duhen_SunStrip_2_2_DVC( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Incorporated";
		model = MODEL_SUNSTRIP_2_2_DVC;
		vehicleName = "Duhen SunStrip 2.2 DVC";
		name = "Duhen SunStrip chassis";

		description = "The luxury model of the SunStrip line. This costs way more than the 1.5 DVC but in change you get the 2.2L (134 cui) heart that produces around 210 HP stock. It may be too strong for a FWD car, but is a great potential if you can handle the throttle with care. The 6 speeds are also welcome.";

		value = mHUF2USD(1.146);
		brand_new_prestige_value = 34.0;

		fully_stripped_drag = 0.48;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(21) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //
		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000000Ar; // "Duhen D22V I-4" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_T  = new int[1];
		stock_parts_list_T[ 0] = cars.racers.Duhen:0x000000C3r; // "targa top" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.duhen:0x000000C0r; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.duhen:0x000000CCr; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.duhen:0x000000CEr; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.duhen:0x000000D5r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.duhen:0x000000C9r; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.duhen:0x000000C7r; // "RL quarterpanel" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.duhen:0x000000CDr; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.duhen:0x000000C8r; // "RR quarterpanel" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.duhen:0x000000C1r; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.duhen:0x000000C6r; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.duhen:0x000000D1r; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[ 0] = cars.racers.duhen:0x000000C2r; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.duhen:0x000000D2r; // "trunk" //
		stock_parts_list_Rr[ 2] = cars.racers.duhen:0x000000DAr; // "R wing" //
		stock_parts_list_Rr[ 3] = cars.racers.duhen:0x000000BFr; // "R windshield" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[ 0] = cars.racers.duhen:0x000000C5r; // "L sideskirt" //
		stock_parts_list_L[ 1] = cars.racers.duhen:0x000000D4r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.duhen:0x000000CBr; // "FL window" //
		stock_parts_list_L[ 3] = cars.racers.duhen:0x000000D8r; // "L mirror" //
		stock_parts_list_L[ 4] = cars.racers.duhen:0x000000D7r; // "FL seat" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[ 0] = cars.racers.duhen:0x000000C4r; // "R sideskirt" //
		stock_parts_list_R[ 1] = cars.racers.duhen:0x000000D0r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.duhen:0x000000CAr; // "FR window" //
		stock_parts_list_R[ 3] = cars.racers.duhen:0x000000CFr; // "R mirror" //
		stock_parts_list_R[ 4] = cars.racers.duhen:0x000000D3r; // "FR seat" //

		// stage 1 stuffs //

		stg_1_parts_list_FL = new int[2];
		stg_1_parts_list_FL[ 0] = cars.racers.duhen:0x000000C0r; // "L headlights" //
		stg_1_parts_list_FL[ 1] = cars.racers.duhen:0x000000DEr; // "FL quarterpanel 2" //

		stg_1_parts_list_FR = new int[2];
		stg_1_parts_list_FR[ 0] = cars.racers.duhen:0x000000CEr; // "R headlights" //
		stg_1_parts_list_FR[ 1] = cars.racers.duhen:0x000000E0r; // "FR quarterpanel 2" //

		stg_1_parts_list_RL = new int[2];
		stg_1_parts_list_RL[ 0] = cars.racers.duhen:0x000000C9r; // "L taillights" //
		stg_1_parts_list_RL[ 1] = cars.racers.duhen:0x000000DDr; // "RL quarterpanel 2" //

		stg_1_parts_list_RR = new int[2];
		stg_1_parts_list_RR[ 0] = cars.racers.duhen:0x000000CDr; // "R taillights" //
		stg_1_parts_list_RR[ 1] = cars.racers.duhen:0x000000E2r; // "RR quarterpanel 2" //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[ 0] = cars.racers.duhen:0x000000DFr; // "F bumper 2" //
		stg_1_parts_list_F[ 1] = cars.racers.duhen:0x000000D9r; // "hood 2" //
		stg_1_parts_list_F[ 2] = cars.racers.duhen:0x000000D1r; // "F windshield" //

		stg_1_parts_list_Rr = new int[4];
		stg_1_parts_list_Rr[ 0] = cars.racers.duhen:0x000000DBr; // "R bumper 2" //
		stg_1_parts_list_Rr[ 1] = cars.racers.duhen:0x000000D2r; // "trunk" //
		stg_1_parts_list_Rr[ 2] = cars.racers.duhen:0x000000DAr; // "R wing" //
		stg_1_parts_list_Rr[ 3] = cars.racers.duhen:0x000000BFr; // "R windshield" //

		stg_1_parts_list_L  = new int[5];
		stg_1_parts_list_L[ 0] = cars.racers.duhen:0x000000DCr; // "L sideskirt 2" //
		stg_1_parts_list_L[ 1] = cars.racers.duhen:0x000000D4r; // "FL door" //
		stg_1_parts_list_L[ 2] = cars.racers.duhen:0x000000CBr; // "FL window" //
		stg_1_parts_list_L[ 3] = cars.racers.duhen:0x000000D8r; // "L mirror" //
		stg_1_parts_list_L[ 4] = cars.racers.duhen:0x000000D7r; // "FL seat" //

		stg_1_parts_list_R  = new int[5];
		stg_1_parts_list_R[ 0] = cars.racers.duhen:0x000000E1r; // "R sideskirt 2" //
		stg_1_parts_list_R[ 1] = cars.racers.duhen:0x000000D0r; // "FR door" //
		stg_1_parts_list_R[ 2] = cars.racers.duhen:0x000000CAr; // "FR window" //
		stg_1_parts_list_R[ 3] = cars.racers.duhen:0x000000CFr; // "R mirror" //
		stg_1_parts_list_R[ 4] = cars.racers.duhen:0x000000D3r; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00003166r; // "SunStrip_22_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x00003167r; // "SunStrip_22_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x00003168r; // "SunStrip_22_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x00003169r; // "SunStrip_22_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x00000069r; // "shock_absorber_SunStrip_22_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x0000006Ar; // "shock_absorber_SunStrip_22_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x0000000Fr; // "spring_SunStrip_22_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x00000011r; // "spring_SunStrip_22_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x0000016Br; // "brake_SunStrip_22_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x0000016Cr; // "brake_SunStrip_22_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x0000017Fr; // "swaybar_SunStrip_22_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x00000180r; // "swaybar_SunStrip_22_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000003A2r; // "rim Blossom 8.0 17 ET 0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000003A2r; // "rim Blossom 8.0 17 ET 0 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003D3r; // "tyre 205 55 17 8.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003D3r; // "tyre 205 55 17 8.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Duhen:0x000000D6r, "steering wheel" );

		if (desc.power > 1.6)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.6)/0.4*0.850+0.150),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		addPart( cars.racers.Duhen:0x0000013Br, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
	}
}
