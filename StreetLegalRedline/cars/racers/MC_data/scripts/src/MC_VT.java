package java.game.cars;

import java.game.*;

public class MC_VT extends VehicleType
{
	public MC_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// GTB //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.MC:0x00000109r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=541;	vmd.fullPrestige= 638;
			vmd.stockQM = qm_stock_MC_GT_B_series;	vmd.fullQM = qm_full_MC_GT_B_series;
			vmd.vehicleName = "MC GT-B";

			// a wild version //
			vmd=new VehicleModel( cars.racers.MC:0x00000109r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=541;	vmd.fullPrestige= 638;
			vmd.stockQM = qm_stock_MC_GT_B_series;	vmd.fullQM = qm_full_MC_GT_B_series;
			vmd.vehicleName = "MC GT-B";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// GT //
			vmd=new VehicleModel( cars.racers.MC:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3377.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.35;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=515;	vmd.fullPrestige= 611;
			vmd.stockQM = qm_stock_MC_GT;	vmd.fullQM = qm_full_MC_GT;
			vmd.vehicleName = "MC GT";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// GTB //
			vmd=new VehicleModel( cars.racers.MC:0x00000109r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 5320.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.55;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.55;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.55;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=541;	vmd.fullPrestige= 638;
			vmd.stockQM = qm_stock_MC_GT_B_series;	vmd.fullQM = qm_full_MC_GT_B_series;
			vmd.vehicleName = "MC GT-B";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// GT Limited Edition //
			// factory/mint condition - only in factory color //
			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 153.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 0.35;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
			vmd.exclusiveColors = 1;
			prevalence += vmd.prevalence;

			// wrecks/used/modified - in all colors //
			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 300.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 0.35;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

	// CAREER mode -> new car dealer //
			// all MC models are abandoned! //

	// CAREER mode -> races //
		// GT //
			vmd=new VehicleModel( cars.racers.MC:0x00000006r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3320.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=515;	vmd.fullPrestige= 611;
			vmd.stockQM = qm_stock_MC_GT;	vmd.fullQM = qm_full_MC_GT;
			vmd.vehicleName = "MC GT";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.MC:0x00000006r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1200.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=515;	vmd.fullPrestige= 611;
			vmd.stockQM = qm_stock_MC_GT;	vmd.fullQM = qm_full_MC_GT;
			vmd.vehicleName = "MC GT";

		// GTB //
			vmd=new VehicleModel( cars.racers.MC:0x00000109r, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 4177.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.8;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.8;
			vmd.minTear	= 0.9;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.9;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=541;	vmd.fullPrestige= 638;
			vmd.stockQM = qm_stock_MC_GT_B_series;	vmd.fullQM = qm_full_MC_GT_B_series;
			vmd.vehicleName = "MC GT-B";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.MC:0x00000109r, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 630.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=541;	vmd.fullPrestige= 638;
			vmd.stockQM = qm_stock_MC_GT_B_series;	vmd.fullQM = qm_full_MC_GT_B_series;
			vmd.vehicleName = "MC GT-B";

		// GT Limited Edition //
			// factory/mint condition - only in factory color //
			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1053.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.3;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.3;
			vmd.minTear	= 0.9;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.9;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
			vmd.exclusiveColors = 1;
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 350.0;
			vmd.minPower	= 1.3;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.3;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 0.9;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.9;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
			vmd.exclusiveColors = 1;

			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_RRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 530.0;
			vmd.minPower	= 1.7;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.7;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Einvagen_Black_mage);
			vmd.exclusiveColors = 1;

			// wrecks/used/modified - in all colors //
			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_DRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 100.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 0.9;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.9;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";
			prevalence += vmd.prevalence;

			vmd=new VehicleModel( cars.racers.MC:0x0000010Ar, VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 200.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.5;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=612;	vmd.fullPrestige= 709;
			vmd.stockQM = qm_stock_MC_GT_Limited_Edition;	vmd.fullQM = qm_full_MC_GT_Limited_Edition;
			vmd.vehicleName = "MC GTLE";

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
