package java.game.cars;

import java.game.*;

public class Emer_VT extends VehicleType
{
	public Emer_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// Nonus Street GT //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Nonus:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Emer_Nonus_Street_GT;	vmd.fullQM = qm_full_Emer_Nonus_Street_GT;
			vmd.vehicleName = "Emer Nonus StreetGT";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Nonus:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Emer_Nonus_Street_GT;	vmd.fullQM = qm_full_Emer_Nonus_Street_GT;
			vmd.vehicleName = "Emer Nonus StreetGT";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// Nonus Street GT //
			vmd=new VehicleModel( cars.racers.Nonus:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1665.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Emer_Nonus_Street_GT;	vmd.fullQM = qm_full_Emer_Nonus_Street_GT;
			vmd.vehicleName = "Emer Nonus StreetGT";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// MotorSport Nonus GT II //
			vmd=new VehicleModel( cars.racers.Nonus:0x000000DFr, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 250.0;
			vmd.minPower	= 0.85;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.65;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.65;	vmd.maxTear	= 0.9;
			vmd.minWear	= 0.65;	vmd.maxWear	= 0.75;
			vmd.stockPrestige=597;	vmd.fullPrestige= 640;
			vmd.stockQM = qm_stock_Emer_MotorSport_Nonus_GT2;	vmd.fullQM = qm_full_Emer_MotorSport_Nonus_GT2;
			vmd.vehicleName = "Emer MotorSport Nonus GT2";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

	// CAREER mode -> new car dealer //
		// Nonus Street GT //
			vmd=new VehicleModel( cars.racers.Nonus:0x00000006r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1865.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Emer_Nonus_Street_GT;	vmd.fullQM = qm_full_Emer_Nonus_Street_GT;
			vmd.vehicleName = "Emer Nonus StreetGT";
			prevalence += vmd.prevalence;

	// CAREER mode -> races //
		// Nonus Street GT //
			vmd=new VehicleModel( cars.racers.Nonus:0x00000006r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1365.0;
			vmd.minPower	= 1.25;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Emer_Nonus_Street_GT;	vmd.fullQM = qm_full_Emer_Nonus_Street_GT;
			vmd.vehicleName = "Emer Nonus StreetGT";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Nonus:0x00000006r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1065.0;
			vmd.minPower	= 1.55;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.55;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=396;	vmd.fullPrestige= 460;
			vmd.stockQM = qm_stock_Emer_Nonus_Street_GT;	vmd.fullQM = qm_full_Emer_Nonus_Street_GT;
			vmd.vehicleName = "Emer Nonus StreetGT";

		// MotorSport Nonus GT II //
			vmd=new VehicleModel( cars.racers.Nonus:0x000000DFr, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 550.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.8;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=597;	vmd.fullPrestige= 640;
			vmd.stockQM = qm_stock_Emer_MotorSport_Nonus_GT2;	vmd.fullQM = qm_full_Emer_MotorSport_Nonus_GT2;
			vmd.vehicleName = "Emer MotorSport Nonus GT2";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Nonus:0x000000DFr, VS_RRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 900.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=597;	vmd.fullPrestige= 640;
			vmd.stockQM = qm_stock_Emer_MotorSport_Nonus_GT2;	vmd.fullQM = qm_full_Emer_MotorSport_Nonus_GT2;
			vmd.vehicleName = "Emer MotorSport Nonus GT2";

		// make color indexes //
		addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
		addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Spring_yellow);

		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Zucker);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Tornado_rot);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Nacht);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Smaragd);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Hamvas_Grun);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Indigo);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Jazz);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Antracit);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Mercator_Blau);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Murano);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Champagner);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Ozean);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Reflex);
		addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Saratoga);

//		prevalence *= 1000.0;
	}
}
