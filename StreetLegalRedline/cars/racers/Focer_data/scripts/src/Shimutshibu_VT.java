package java.game.cars;

import java.game.*;

public class Shimutshibu_VT extends VehicleType
{
	public Shimutshibu_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// Focer RC 200 //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Focer:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=397;	vmd.fullPrestige= 426;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_200;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_200;
			vmd.vehicleName = "Shimutshibu Focer RC 200";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Focer:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=397;	vmd.fullPrestige= 426;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_200;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_200;
			vmd.vehicleName = "Shimutshibu Focer RC 200";

		// Focer RC 300 //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Focer:0x00000107r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=475;	vmd.fullPrestige= 508;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_300;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_300;
			vmd.vehicleName = "Shimutshibu Focer RC 300";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Focer:0x00000107r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=475;	vmd.fullPrestige= 508;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_300;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_300;
			vmd.vehicleName = "Shimutshibu Focer RC 300";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// Focer RC 200 //
			vmd=new VehicleModel( cars.racers.Focer:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1200.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.35;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=397;	vmd.fullPrestige= 426;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_200;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_200;
			vmd.vehicleName = "Shimutshibu Focer RC 200";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// Focer RC 300 //
			vmd=new VehicleModel( cars.racers.Focer:0x00000107r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1700.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.35;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=475;	vmd.fullPrestige= 508;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_300;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_300;
			vmd.vehicleName = "Shimutshibu Focer RC 300";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// Focer WRC //
			vmd=new VehicleModel( cars.racers.Focer:0x00000108r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 130.0;
			vmd.minPower	= 0.25;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.05;	vmd.maxTear	= 0.9;
			vmd.minWear	= 0.05;	vmd.maxWear	= 0.75;
			vmd.stockPrestige=599;	vmd.fullPrestige= 632;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_WRC;	vmd.fullQM = qm_full_Shimutshibu_Focer_WRC;
			vmd.vehicleName = "Shimutshibu Focer WRC";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

	// CAREER mode -> new car dealer //
		// Focer RC 200 //
			vmd=new VehicleModel( cars.racers.Focer:0x00000006r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2000.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=397;	vmd.fullPrestige= 426;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_200;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_200;
			vmd.vehicleName = "Shimutshibu Focer RC 200";
			prevalence += vmd.prevalence;

		// Focer RC 300 //
			vmd=new VehicleModel( cars.racers.Focer:0x00000107r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1800.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=475;	vmd.fullPrestige= 508;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_300;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_300;
			vmd.vehicleName = "Shimutshibu Focer RC 300";
			prevalence += vmd.prevalence;

	// CAREER mode -> races //
		// Focer RC 200 //
			vmd=new VehicleModel( cars.racers.Focer:0x00000006r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.9;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.9;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=397;	vmd.fullPrestige= 426;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_200;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_200;
			vmd.vehicleName = "Shimutshibu Focer RC 200";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Focer:0x00000006r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.45;	vmd.maxPower	= 1.9;
			vmd.minOptical	= 1.45;	vmd.maxOptical	= 1.9;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=397;	vmd.fullPrestige= 426;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_200;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_200;
			vmd.vehicleName = "Shimutshibu Focer RC 200";

		// Focer RC 300 //
			vmd=new VehicleModel( cars.racers.Focer:0x00000107r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1700.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.85;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.85;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=475;	vmd.fullPrestige= 508;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_300;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_300;
			vmd.vehicleName = "Shimutshibu Focer RC 300";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Focer:0x00000107r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 700.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=475;	vmd.fullPrestige= 508;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_RC_300;	vmd.fullQM = qm_full_Shimutshibu_Focer_RC_300;
			vmd.vehicleName = "Shimutshibu Focer RC 300";

		// Focer WRC //
			vmd=new VehicleModel( cars.racers.Focer:0x00000108r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1180.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.7;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.8;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=599;	vmd.fullPrestige= 632;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_WRC;	vmd.fullQM = qm_full_Shimutshibu_Focer_WRC;
			vmd.vehicleName = "Shimutshibu Focer WRC";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Focer:0x00000108r, VS_RRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 630.0;
			vmd.minPower	= 1.7;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=599;	vmd.fullPrestige= 632;
			vmd.stockQM = qm_stock_Shimutshibu_Focer_WRC;	vmd.fullQM = qm_full_Shimutshibu_Focer_WRC;
			vmd.vehicleName = "Shimutshibu Focer WRC";

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
