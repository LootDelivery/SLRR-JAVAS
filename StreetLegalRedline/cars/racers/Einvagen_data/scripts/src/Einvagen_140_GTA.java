package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Einvagen_140_GTA extends Einvagen_models
{
	public Einvagen_140_GTA( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Einvagen Specialities USA";
		model = MODEL_140_GTA;
		vehicleName = "Einvagen 140 GTA";
		name = "Einvagen GT chassis";

		description = "In 2002 the Einvagen GT became 25 years old, so the factory decided to extend the family with a 2.4L (146 cui) model designated to advertise the 25th birthday. This model is limited to one year and 3371 pieces, so it's relatively hard to find after the production stopped previous month. A 230 HP 4WD 6 speed collectors' choice with enforced chassis to accomodate the improved performance. The drive is fixed at 60-40% front to rear.";

		value = mHUF2USD(1.068);
		brand_new_prestige_value = 40.0;

		fully_stripped_drag = 0.44;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(996) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000004Fr; // "2.4L I4" //
		stock_parts_list_E[ 1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[ 0] = cars.racers.einvagen:0x000000BAr; // "L headlights" //
		stock_parts_list_FL[ 1] = cars.racers.einvagen:0x000000B0r; // "FL quarterpanel" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[ 0] = cars.racers.einvagen:0x000000BFr; // "R headlights" //
		stock_parts_list_FR[ 1] = cars.racers.einvagen:0x000000B4r; // "FR quarterpanel" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[ 0] = cars.racers.einvagen:0x000000BCr; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[ 0] = cars.racers.einvagen:0x000000C2r; // "R taillights" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[ 0] = cars.racers.einvagen:0x000000ADr; // "F bumper 2" //
		stock_parts_list_F[ 1] = cars.racers.einvagen:0x000000B8r; // "hood" //
		stock_parts_list_F[ 2] = cars.racers.einvagen:0x000000AEr; // "F windshield" //

		stock_parts_list_Rr = new int[6];
		stock_parts_list_Rr[ 0] = cars.racers.einvagen:0x000000BDr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.einvagen:0x000000BEr; // "R door" //
		stock_parts_list_Rr[ 2] = cars.racers.einvagen:0x000000C4r; // "R wing" //
		stock_parts_list_Rr[ 3] = cars.racers.einvagen:0x000000C6r; // "Rf wing" //
		stock_parts_list_Rr[ 4] = cars.racers.einvagen:0x000000B7r; // "hat holder" //
		stock_parts_list_Rr[ 5] = cars.racers.einvagen:0x000000C1r; // "R seats" //

		stock_parts_list_L  = new int[3];
		stock_parts_list_L[ 0] = cars.racers.einvagen:0x000000AFr; // "FL door" //
		stock_parts_list_L[ 1] = cars.racers.einvagen:0x000000C7r; // "RL door" //
		stock_parts_list_L[ 2] = cars.racers.einvagen:0x000000B1r; // "FL seat" //

		stock_parts_list_R  = new int[3];
		stock_parts_list_R[ 0] = cars.racers.einvagen:0x000000B3r; // "FR door" //
		stock_parts_list_R[ 1] = cars.racers.einvagen:0x000000C9r; // "RR door" //
		stock_parts_list_R[ 2] = cars.racers.einvagen:0x000000B5r; // "FR seat" //

		// stage 1 stuffs //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[ 0] = cars.racers.einvagen:0x000000ADr; // "F bumper 2" //
		stg_1_parts_list_F[ 1] = cars.racers.einvagen:0x000000B9r; // "hood 2" //
		stg_1_parts_list_F[ 2] = cars.racers.einvagen:0x000000AEr; // "F windshield" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x0000012Ar; // "Einvagen_GTA_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x00000128r; // "Einvagen_GTA_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x00000127r; // "Einvagen_GTA_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x00000126r; // "Einvagen_GTA_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x00000111r; // "shock_absorber_Einvagen_GTA_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x00000110r; // "shock_absorber_Einvagen_GTA_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x00000120r; // "spring_Einvagen_GTA_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x0000011Fr; // "spring_Einvagen_GTA_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x00000140r; // "brake_Einvagen_GTA_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x0000013Dr; // "brake_Einvagen_GTA_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x00000189r; // "swaybar_Einvagen_GTA_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x0000018Ar; // "swaybar_Einvagen_GTA_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[ 0] = stock_parts_list_RGear_wheels[ 1] = parts.wheels:0x000002B6r; // "rim Einvagen_GT 7.5 16 ET 20 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[ 2] = stock_parts_list_RGear_wheels[ 3] = parts.wheels:0x000002B6r; // "rim Einvagen_GT 7.5 16 ET 20 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[ 0] = stock_parts_list_RGear_tyres[ 1] = parts.wheels:0x000003D7r; // "tyre 215 45 16 8.5 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[ 2] = stock_parts_list_RGear_tyres[ 3] = parts.wheels:0x000003D7r; // "tyre 215 45 16 8.5 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Einvagen:0x000000CBr, "steering wheel" );

		addPart( cars.racers.Einvagen:0x00000136r, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		if (desc.power > 1.25)
		{
			addPart( parts.wings:0x00000024r, "wing" );
		}

		if (desc.power > 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.3)/0.5*0.750+0.250),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
			else
			if (desc.power > 1.55)
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
