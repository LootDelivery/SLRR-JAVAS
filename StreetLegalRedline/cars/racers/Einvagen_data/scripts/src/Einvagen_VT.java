package java.game.cars;

import java.game.*;

public class Einvagen_VT extends VehicleType
{
	public Einvagen_VT( int id )
	{
		VehicleModel vmd;

	// DEMO mode //
		// 110 GT //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=204;	vmd.fullPrestige= 244;
			vmd.stockQM = qm_stock_Einvagen_110_GT;	vmd.fullQM = qm_full_Einvagen_110_GT;
			vmd.vehicleName = "Einvagen 110 GT";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000006r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=204;	vmd.fullPrestige= 244;
			vmd.stockQM = qm_stock_Einvagen_110_GT;	vmd.fullQM = qm_full_Einvagen_110_GT;
			vmd.vehicleName = "Einvagen 110 GT";

		// 110 GTK (110 GT Kompressor) //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000112r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Einvagen_110_GTK;	vmd.fullQM = qm_full_Einvagen_110_GTK;
			vmd.vehicleName = "Einvagen 110 GTK";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000112r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Einvagen_110_GTK;	vmd.fullQM = qm_full_Einvagen_110_GTK;
			vmd.vehicleName = "Einvagen 110 GTK";

		// 140 GTA //
			// a full stock version //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000113r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.stockPrestige=264;	vmd.fullPrestige= 291;
			vmd.stockQM = qm_stock_Einvagen_140_GTA;	vmd.fullQM = qm_full_Einvagen_140_GTA;
			vmd.vehicleName = "Einvagen 140 GTA";

			// a wild version //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000113r, VS_DEMO );
			vtdarr.addElement( vmd );
			vmd.prevalence	= 1.0;
			vmd.minPower	= 1.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 2.0;	vmd.maxOptical	= 2.0;
			vmd.stockPrestige=264;	vmd.fullPrestige= 291;
			vmd.stockQM = qm_stock_Einvagen_140_GTA;	vmd.fullQM = qm_full_Einvagen_140_GTA;
			vmd.vehicleName = "Einvagen 140 GTA";

		prevalence = 0.0;

	// CAREER mode -> used car dealer //
		// 110 GT //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000006r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2750.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=204;	vmd.fullPrestige= 244;
			vmd.stockQM = qm_stock_Einvagen_110_GT;	vmd.fullQM = qm_full_Einvagen_110_GT;
			vmd.vehicleName = "Einvagen 110 GT";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// 110 GTK (110 GT Kompressor) //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000112r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3200.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Einvagen_110_GTK;	vmd.fullQM = qm_full_Einvagen_110_GTK;
			vmd.vehicleName = "Einvagen 110 GTK";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

		// 140 GTA //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000113r, VS_USED );
			vtdarr.addElement( vmd );
			vmd.prevalence = 685.0;
			vmd.minPower	= 0.5;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 0.1;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.25;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.25;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=264;	vmd.fullPrestige= 291;
			vmd.stockQM = qm_stock_Einvagen_140_GTA;	vmd.fullQM = qm_full_Einvagen_140_GTA;
			vmd.vehicleName = "Einvagen 140 GTA";
			prevalence += vmd.prevalence;
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Cherry);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Smaragd);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Nacht);
			vmd.addColorIndex(GameLogic.RID_CARCOLOR_Used_Rusty_Zucker);

	// CAREER mode -> new car dealer //
		// 110 GT //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000006r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 2750.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=204;	vmd.fullPrestige= 244;
			vmd.stockQM = qm_stock_Einvagen_110_GT;	vmd.fullQM = qm_full_Einvagen_110_GT;
			vmd.vehicleName = "Einvagen 110 GT";
			prevalence += vmd.prevalence;

		// 110 GTK (110 GT Kompressor) //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000112r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 3200.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Einvagen_110_GTK;	vmd.fullQM = qm_full_Einvagen_110_GTK;
			vmd.vehicleName = "Einvagen 110 GTK";
			prevalence += vmd.prevalence;

		// 140 GTA //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000113r, VS_STOCK );
			vtdarr.addElement( vmd );
			vmd.prevalence = 686.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.0;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=264;	vmd.fullPrestige= 291;
			vmd.stockQM = qm_stock_Einvagen_140_GTA;	vmd.fullQM = qm_full_Einvagen_140_GTA;
			vmd.vehicleName = "Einvagen 140 GTA";
			prevalence += vmd.prevalence;

	// CAREER mode -> races //
		// 110 GT //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000006r, VS_DRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 400.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=204;	vmd.fullPrestige= 244;
			vmd.stockQM = qm_stock_Einvagen_110_GT;	vmd.fullQM = qm_full_Einvagen_110_GT;
			vmd.vehicleName = "Einvagen 110 GT";

		// 110 GTK (110 GT Kompressor) //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000112r, VS_DRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 800.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=225;	vmd.fullPrestige= 265;
			vmd.stockQM = qm_stock_Einvagen_110_GTK;	vmd.fullQM = qm_full_Einvagen_110_GTK;
			vmd.vehicleName = "Einvagen 110 GTK";

		// 140 GTA //
			vmd=new VehicleModel( cars.racers.Einvagen:0x00000113r, VS_DRACE | VS_NRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 1300.0;
			vmd.minPower	= 1.0;	vmd.maxPower	= 1.5;
			vmd.minOptical	= 1.0;	vmd.maxOptical	= 1.5;
			vmd.minTear	= 0.8;	vmd.maxTear	= 1.0;
			vmd.minWear	= 0.8;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=264;	vmd.fullPrestige= 291;
			vmd.stockQM = qm_stock_Einvagen_140_GTA;	vmd.fullQM = qm_full_Einvagen_140_GTA;
			vmd.vehicleName = "Einvagen 140 GTA";

			vmd=new VehicleModel( cars.racers.Einvagen:0x00000113r, VS_RRACE );
			vtdarr.addElement( vmd );
			vmd.prevalence = 500.0;
			vmd.minPower	= 1.8;	vmd.maxPower	= 2.0;
			vmd.minOptical	= 1.8;	vmd.maxOptical	= 2.0;
			vmd.minTear	= 1.0;	vmd.maxTear	= 1.0;
			vmd.minWear	= 1.0;	vmd.maxWear	= 1.0;
			vmd.stockPrestige=264;	vmd.fullPrestige= 291;
			vmd.stockQM = qm_stock_Einvagen_140_GTA;	vmd.fullQM = qm_full_Einvagen_140_GTA;
			vmd.vehicleName = "Einvagen 140 GTA";

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
