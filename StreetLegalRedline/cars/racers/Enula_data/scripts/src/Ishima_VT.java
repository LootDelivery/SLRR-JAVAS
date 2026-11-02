package java.game.cars;

import java.game.*;

public class Ishima_VT extends VehicleType
{
	public Ishima_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// Ishima Enula WRY //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Enula:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 422;
			vmd.stockQM = qm_stock_Ishima_Enula_WRY;	vmd.fullQM = qm_full_Ishima_Enula_WRY;
			vmd.vehicleName = "Ishima Enula WRY";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Enula:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 422;
			vmd.stockQM = qm_stock_Ishima_Enula_WRY;	vmd.fullQM = qm_full_Ishima_Enula_WRY;
			vmd.vehicleName = "Ishima Enula WRY";

		// Ishima Enula WRZ //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Cr, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=440;	vmd.fullPrestige= 473;
			vmd.stockQM = qm_stock_Ishima_Enula_WRZ;	vmd.fullQM = qm_full_Ishima_Enula_WRZ;
			vmd.vehicleName = "Ishima Enula WRZ";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Cr, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=440;	vmd.fullPrestige= 473;
			vmd.stockQM = qm_stock_Ishima_Enula_WRZ;	vmd.fullQM = qm_full_Ishima_Enula_WRZ;
			vmd.vehicleName = "Ishima Enula WRZ";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// Ishima Enula WRY //
			vmd=new VehicleModel( cars.racers.Enula:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2100.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 422;
			vmd.stockQM = qm_stock_Ishima_Enula_WRY;	vmd.fullQM = qm_full_Ishima_Enula_WRY;
			vmd.vehicleName = "Ishima Enula WRY";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// Ishima Enula WRZ //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Cr, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1650.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=440;	vmd.fullPrestige= 473;
			vmd.stockQM = qm_stock_Ishima_Enula_WRZ;	vmd.fullQM = qm_full_Ishima_Enula_WRZ;
			vmd.vehicleName = "Ishima Enula WRZ";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// Ishima Enula WR SuperTurizmo //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Er, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 320.0;
			vmd.minPower	= 0.25;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.05;	vmd.maxTear	= 0.9;
			vmd.minWear	= 0.05;	vmd.maxWear	= 0.75;
			vmd.stockPrestige=589;	vmd.fullPrestige= 622;
			vmd.stockQM = qm_stock_Ishima_Enula_WR_SuperTurizmo;	vmd.fullQM = qm_full_Ishima_Enula_WR_SuperTurizmo;
			vmd.vehicleName = "Ishima Enula WR SuperTurizmo";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

	// CAREER mode -> new car dealer //
		// Ishima Enula WRY //
			vmd=new VehicleModel( cars.racers.Enula:0x00000006r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 422;
			vmd.stockQM = qm_stock_Ishima_Enula_WRY;	vmd.fullQM = qm_full_Ishima_Enula_WRY;
			vmd.vehicleName = "Ishima Enula WRY";
			prevalence += vmd.prevalence;

		// Ishima Enula WRZ //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Cr, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1650.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=440;	vmd.fullPrestige= 473;
			vmd.stockQM = qm_stock_Ishima_Enula_WRZ;	vmd.fullQM = qm_full_Ishima_Enula_WRZ;
			vmd.vehicleName = "Ishima Enula WRZ";
			prevalence += vmd.prevalence;

	// CAREER mode -> races //
		// Ishima Enula WRY //
			vmd=new VehicleModel( cars.racers.Enula:0x00000006r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1000.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 422;
			vmd.stockQM = qm_stock_Ishima_Enula_WRY;	vmd.fullQM = qm_full_Ishima_Enula_WRY;
			vmd.vehicleName = "Ishima Enula WRY";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Enula:0x00000006r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=401;	vmd.fullPrestige= 422;
			vmd.stockQM = qm_stock_Ishima_Enula_WRY;	vmd.fullQM = qm_full_Ishima_Enula_WRY;
			vmd.vehicleName = "Ishima Enula WRY";

		// Ishima Enula WRZ //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Cr, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2000.0;
			vmd.minPower	= 1.25;	vmd.maxPower	= 1.6;
			vmd.minOptical	= 1.25;	vmd.maxOptical	= 1.6;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=440;	vmd.fullPrestige= 473;
			vmd.stockQM = qm_stock_Ishima_Enula_WRZ;	vmd.fullQM = qm_full_Ishima_Enula_WRZ;
			vmd.vehicleName = "Ishima Enula WRZ";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Enula:0x0000017Cr, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 700.0;
			vmd.minPower	= 1.45;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.45;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=440;	vmd.fullPrestige= 473;
			vmd.stockQM = qm_stock_Ishima_Enula_WRZ;	vmd.fullQM = qm_full_Ishima_Enula_WRZ;
			vmd.vehicleName = "Ishima Enula WRZ";

		// Ishima Enula WR SuperTurizmo //
			vmd=new VehicleModel( cars.racers.Enula:0x0000017Er, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1150.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=589;	vmd.fullPrestige= 622;
			vmd.stockQM = qm_stock_Ishima_Enula_WR_SuperTurizmo;	vmd.fullQM = qm_full_Ishima_Enula_WR_SuperTurizmo;
			vmd.vehicleName = "Ishima Enula WR SuperTurizmo";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.Enula:0x0000017Er, VS_RRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 650.0;
			vmd.minPower	= 1.6;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.4;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=589;	vmd.fullPrestige= 622;
			vmd.stockQM = qm_stock_Ishima_Enula_WR_SuperTurizmo;	vmd.fullQM = qm_full_Ishima_Enula_WR_SuperTurizmo;
			vmd.vehicleName = "Ishima Enula WR SuperTurizmo";

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
