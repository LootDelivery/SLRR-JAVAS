package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Duhen_Racing_SunStrip_2_0_CDVC extends Duhen_models
{
	public Duhen_Racing_SunStrip_2_0_CDVC( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Incorporated Factory Racing Team";
		model = MODEL_RACING_SUNSTRIP_2_0_CDVC;
		vehicleName = "Duhen Racing SunStrip 2.0 CDVC";
		name = "Duhen Racing SunStrip chassis";

		description = "An advanced amateur race version of the SunStrip model line. It features the newest Duhen engine, the D20CV wich is a 1983 cc (121 cui) engine utilizing the full potential of CDVC, the 'Computerized Duhen Valve Control' technology. The chassis is lightened to 920 KGs (2020 pounds), the suspension is harder and tracks are wider, too. The strong small block and the light chassis makes this fine japanese steel fly up to 320 KPH (200 MPH) and reach 100 KPH (62 MPH) in under 3.1 secs! But 200 KPH (124 MPH) takes only 11.6 secs. The car has small integrated wings and splitters in the front and rear to force the chassis to the ground at high speeds. The model is equipped with an adjustable turbocharger and an adjustable 6-speed transmission.";

		value = mHUF2USD(5.733);
		brand_new_prestige_value = 70.0;

		fully_stripped_drag = 0.46;
		brake_balance_can_be_set = 1;

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
		stock_parts_list_FL[ 1] = cars.racers.duhen:0x000000DEr; // "FL quarterpanel 2" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.duhen:0x000000CEr; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.duhen:0x000000E0r; // "FR quarterpanel 2" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[ 0] = cars.racers.duhen:0x000000C9r; // "L taillights" //
		stock_parts_list_RL[ 1] = cars.racers.duhen:0x000000DDr; // "RL quarterpanel 2" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[ 0] = cars.racers.duhen:0x000000CDr; // "R taillights" //
		stock_parts_list_RR[ 1] = cars.racers.duhen:0x000000E2r; // "RR quarterpanel 2" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.duhen:0x000000DFr; // "F bumper 2" //
		stock_parts_list_F[ 1] = cars.racers.duhen:0x000000D9r; // "hood 2" //
		stock_parts_list_F[ 2] = cars.racers.duhen:0x000000D1r; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[ 0] = cars.racers.duhen:0x000000DBr; // "R bumper 2" //
		stock_parts_list_Rr[ 1] = cars.racers.duhen:0x000000D2r; // "trunk" //
		stock_parts_list_Rr[ 2] = parts.wings:0x0000002Br; // "wing" //
		stock_parts_list_Rr[ 3] = cars.racers.duhen:0x000000BFr; // "R windshield" //

		stock_parts_list_L = new int[5];
		stock_parts_list_L[ 0] = cars.racers.duhen:0x000000DCr; // "L sideskirt 2" //
		stock_parts_list_L[ 1] = cars.racers.duhen:0x000000D4r; // "FL door" //
		stock_parts_list_L[ 2] = cars.racers.duhen:0x000000CBr; // "FL window" //
		stock_parts_list_L[ 3] = cars.racers.duhen:0x000000D8r; // "L mirror" //
		stock_parts_list_L[ 4] = parts.interior:0x00000049r; // "FL seat" //

		stock_parts_list_R = new int[5];
		stock_parts_list_R[ 0] = cars.racers.duhen:0x000000E1r; // "R sideskirt 2" //
		stock_parts_list_R[ 1] = cars.racers.duhen:0x000000D0r; // "FR door" //
		stock_parts_list_R[ 2] = cars.racers.duhen:0x000000CAr; // "FR window" //
		stock_parts_list_R[ 3] = cars.racers.duhen:0x000000CFr; // "R mirror" //
		stock_parts_list_R[ 4] = parts.interior:0x00000049r; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x0000316Ar; // "SunStrip_20_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x0000316Br; // "SunStrip_20_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000316Cr; // "SunStrip_20_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000316Dr; // "SunStrip_20_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x0000006Br; // "shock_absorber_SunStrip_20_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x0000006Cr; // "shock_absorber_SunStrip_20_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x00000015r; // "spring_SunStrip_20_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x0000005Dr; // "spring_SunStrip_20_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x0000016Dr; // "brake_SunStrip_20_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x0000016Er; // "brake_SunStrip_20_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x00000182r; // "swaybar_SunStrip_20_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x00000184r; // "swaybar_SunStrip_20_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000003B0r; // "rim Blossom 9.5 19 ET 0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000003B0r; // "rim Blossom 9.5 19 ET 0 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Duhen:0x000000D6r, "steering wheel" );

		if (desc.power > 1.8)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.8)/0.2*0.750+0.250),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		addPart( cars.racers.Duhen:0x0000023Br, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
	}
}
