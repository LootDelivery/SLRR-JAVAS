package java.game.cars;

import java.game.*;

public class Baiern_VT extends VehicleType
{
	public Baiern_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// CoupeSport 2.5 //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=329;	vmd.fullPrestige= 388;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_2_5;	vmd.fullQM = qm_full_Baiern_CoupeSport_2_5;
			vmd.vehicleName = "Baiern CoupeSport 2.5";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=329;	vmd.fullPrestige= 388;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_2_5;	vmd.fullQM = qm_full_Baiern_CoupeSport_2_5;
			vmd.vehicleName = "Baiern CoupeSport 2.5";

		// DevilSport //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000157r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=338;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Baiern_DevilSport;	vmd.fullQM = qm_full_Baiern_DevilSport;
			vmd.vehicleName = "Baiern DevilSport";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000157r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=338;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Baiern_DevilSport;	vmd.fullQM = qm_full_Baiern_DevilSport;
			vmd.vehicleName = "Baiern DevilSport";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// CoupeSport 2.5 //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3325.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=329;	vmd.fullPrestige= 388;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_2_5;	vmd.fullQM = qm_full_Baiern_CoupeSport_2_5;
			vmd.vehicleName = "Baiern CoupeSport 2.5";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// DevilSport //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000157r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 911.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=338;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Baiern_DevilSport;	vmd.fullQM = qm_full_Baiern_DevilSport;
			vmd.vehicleName = "Baiern DevilSport";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// CoupeSport GT III // gold
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 10.0;
			vmd.minPower	= 0.25;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.05;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.05;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
			vmd.exclusiveColors = 1;

		// CoupeSport GT III // black
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 30.0;
			vmd.minPower	= 0.25;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.05;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.05;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
			vmd.exclusiveColors = 1;

		// CoupeSport GT III // white
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 30.0;
			vmd.minPower	= 0.25;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.05;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.05;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
			vmd.exclusiveColors = 1;

		// CoupeSport GT III // red
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 30.0;
			vmd.minPower	= 0.25;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.05;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.05;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
			vmd.exclusiveColors = 1;

	// CAREER mode -> new car dealer //
		// CoupeSport 2.5 //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000006r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3000.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=329;	vmd.fullPrestige= 388;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_2_5;	vmd.fullQM = qm_full_Baiern_CoupeSport_2_5;
			vmd.vehicleName = "Baiern CoupeSport 2.5";
			prevalence += vmd.prevalence;

		// DevilSport //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000157r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1400.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=338;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Baiern_DevilSport;	vmd.fullQM = qm_full_Baiern_DevilSport;
			vmd.vehicleName = "Baiern DevilSport";
			prevalence += vmd.prevalence;

	// CAREER mode -> races //
		// CoupeSport 2.5 //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000006r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2400.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=329;	vmd.fullPrestige= 388;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_2_5;	vmd.fullQM = qm_full_Baiern_CoupeSport_2_5;
			vmd.vehicleName = "Baiern CoupeSport 2.5";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Baiern:0x00000006r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1000.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=329;	vmd.fullPrestige= 388;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_2_5;	vmd.fullQM = qm_full_Baiern_CoupeSport_2_5;
			vmd.vehicleName = "Baiern CoupeSport 2.5";

		// DevilSport //
			vmd=new VehicleModel( cars.racers.Baiern:0x00000157r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=338;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Baiern_DevilSport;	vmd.fullQM = qm_full_Baiern_DevilSport;
			vmd.vehicleName = "Baiern DevilSport";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Baiern:0x00000157r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1300.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.2;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=338;	vmd.fullPrestige= 395;
			vmd.stockQM = qm_stock_Baiern_DevilSport;	vmd.fullQM = qm_full_Baiern_DevilSport;
			vmd.vehicleName = "Baiern DevilSport";

		// CoupeSport GT III // gold
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_RRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.75;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.75;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Spring_yellow);
			vmd.exclusiveColors = 1;

		// CoupeSport GT III // black
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_RRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.75;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.75;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
			vmd.exclusiveColors = 1;

		// CoupeSport GT III // white
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_RRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.75;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.75;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Champagner);
			vmd.exclusiveColors = 1;

		// CoupeSport GT III // red
			vmd=new VehicleModel( cars.racers.Baiern:0x000000FDr, VS_RRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.75;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.75;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=668;	vmd.fullPrestige= 722;
			vmd.stockQM = qm_stock_Baiern_CoupeSport_GT_III;	vmd.fullQM = qm_full_Baiern_CoupeSport_GT_III;
			vmd.vehicleName = "Baiern CoupeSport GT III";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Baiern_Devils_eye_red);
			vmd.exclusiveColors = 1;

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
