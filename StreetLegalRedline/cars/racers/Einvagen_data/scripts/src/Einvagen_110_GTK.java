package java.game.cars;

import java.util.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Einvagen_110_GTK extends Einvagen_models
{
	public Einvagen_110_GTK( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Einvagen USA";
		model = MODEL_110_GTK;
		vehicleName = "Einvagen 110 GTK";
		name = "Einvagen GT chassis";

		description = "The big brother of the 110 GT. A fine european car with a supercharged 1.8L (110 cui) engine producing around 170 HP stock and peak torque nearly in the whole RPM range.";

		value = tHUF2USD(836.148);
		brand_new_prestige_value = 28.0;

		fully_stripped_drag = 0.44;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement( new Integer(996) );
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[ 0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D2r; // "1.8L I4" //
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
		stock_parts_list_F[ 0] = cars.racers.einvagen:0x000000ACr; // "F bumper" //
		stock_parts_list_F[ 1] = cars.racers.einvagen:0x000000B9r; // "hood 2" //
		stock_parts_list_F[ 2] = cars.racers.einvagen:0x000000AEr; // "F windshield" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[ 0] = cars.racers.einvagen:0x000000BDr; // "R bumper" //
		stock_parts_list_Rr[ 1] = cars.racers.einvagen:0x000000BEr; // "R door" //
		stock_parts_list_Rr[ 2] = cars.racers.einvagen:0x000000C4r; // "R wing" //
		stock_parts_list_Rr[ 3] = cars.racers.einvagen:0x000000B7r; // "hat holder" //
		stock_parts_list_Rr[ 4] = cars.racers.einvagen:0x000000C1r; // "R seats" //

		stock_parts_list_L  = new int[3];
		stock_parts_list_L[ 0] = cars.racers.einvagen:0x000000AFr; // "FL door" //
		stock_parts_list_L[ 1] = cars.racers.einvagen:0x000000C7r; // "RL door" //
		stock_parts_list_L[ 2] = cars.racers.einvagen:0x000000B1r; // "FL seat" //

		stock_parts_list_R  = new int[3];
		stock_parts_list_R[ 0] = cars.racers.einvagen:0x000000B3r; // "FR door" //
		stock_parts_list_R[ 1] = cars.racers.einvagen:0x000000C9r; // "RR door" //
		stock_parts_list_R[ 2] = cars.racers.einvagen:0x000000B5r; // "FR seat" //

	// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[ 0] = parts:0x00000137r; // "Einvagen_GTK_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 1] = parts:0x0000012Er; // "Einvagen_GTK_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[ 2] = parts:0x0000012Cr; // "Einvagen_GTK_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[ 3] = parts:0x0000012Br; // "Einvagen_GTK_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[ 0] = stock_parts_list_RGear_shocks[ 1] = parts:0x0000011Ar; // "shock_absorber_Einvagen_GTK_front" //
		stock_parts_list_RGear_shocks[ 2] = stock_parts_list_RGear_shocks[ 3] = parts:0x00000112r; // "shock_absorber_Einvagen_GTK_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[ 0] = stock_parts_list_RGear_springs[ 1] = parts:0x00000122r; // "spring_Einvagen_GTK_front" //
		stock_parts_list_RGear_springs[ 2] = stock_parts_list_RGear_springs[ 3] = parts:0x00000121r; // "spring_Einvagen_GTK_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[ 0] = stock_parts_list_RGear_brakes[ 1] = parts:0x0000014Fr; // "brake_Einvagen_GTK_front" //
		stock_parts_list_RGear_brakes[ 2] = stock_parts_list_RGear_brakes[ 3] = parts:0x00000141r; // "brake_Einvagen_GTK_rear" //

//		stock_parts_list_RGear_sways = new int[2];
//		stock_parts_list_RGear_sways[ 0] = parts:0x00000187r; // "swaybar_Einvagen_GTK_front" //
//		stock_parts_list_RGear_sways[ 1] = parts:0x00000188r; // "swaybar_Einvagen_GTK_rear" //

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

		if (desc.power > 1.25)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.550+0.250),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
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
