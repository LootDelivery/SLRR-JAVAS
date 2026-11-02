package java.game.cars;

import java.game.*;

public class Hauler_s_VT extends VehicleType
{
	public Hauler_s_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// SuperDuty 500 //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=500;	vmd.fullPrestige= 691;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_500;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_500;
			vmd.vehicleName = "Hauler's SuperDuty 500";

			// a wild version //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=500;	vmd.fullPrestige= 691;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_500;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_500;
			vmd.vehicleName = "Hauler's SuperDuty 500";

		// SuperDuty Extra 750 //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";

			// a wild version //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// SuperDuty 500 //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2750.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=500;	vmd.fullPrestige= 691;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_500;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_500;
			vmd.vehicleName = "Hauler's SuperDuty 500";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// SuperDuty Extra 750 //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1200.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);


	// CAREER mode -> new car dealer //
		// SuperDuty 500 //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000006r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3250.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=500;	vmd.fullPrestige= 691;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_500;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_500;
			vmd.vehicleName = "Hauler's SuperDuty 500";
			prevalence += vmd.prevalence;

		// SuperDuty Extra 750 //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2700.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";
			prevalence += vmd.prevalence;

	// CAREER mode -> races //
		// SuperDuty 500 //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000006r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1750.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=500;	vmd.fullPrestige= 691;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_500;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_500;
			vmd.vehicleName = "Hauler's SuperDuty 500";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000006r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1200.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=500;	vmd.fullPrestige= 691;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_500;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_500;
			vmd.vehicleName = "Hauler's SuperDuty 500";

		// SuperDuty Extra 750 //
			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2000.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";

			vmd=new VehicleModel( cars.racers.SuperDuty:0x00000112r, VS_RRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 750.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=576;	vmd.fullPrestige= 688;
			vmd.stockQM = qm_stock_Hauler_s_SuperDuty_Extra_750;	vmd.fullQM = qm_full_Hauler_s_SuperDuty_Extra_750;
			vmd.vehicleName = "Hauler's SuperDuty Extra 750";

		// make color indexes //
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
