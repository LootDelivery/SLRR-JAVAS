package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Shimutshibu_RC_23W44EX_exhaust_header extends ExhaustHeader
{
	public Shimutshibu_RC_23W44EX_exhaust_header( int id )
	{
		super( id );
		name = "Shimutshibu RC 23W44EX exhaust header";
		description = "";
		brand_new_prestige_value = 38.45;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.85;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_SHIMUTSHIBU)
		{
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_RC_300)
			{
				TurboCharger tc;
				if (desc.power < 1.2)
				{
					tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Cr, "Shimutshibu_RC_M3FCR15W7_turbocharger", desc );
					if (desc.power > 1.1)
						tc.P_turbo_waste = (desc.power-1.1)/0.1*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
					else
					if (desc.power > 1.2)
						tc.P_turbo_waste = tc.max_waste;
				}
				else
				{
					tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Dr, "Shimutshibu_RC_MWFCR22W12_turbocharger", desc );
					if (desc.power < 1.8)
						tc.P_turbo_waste = (desc.power-1.2)/0.6*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
					else
						tc.P_turbo_waste = tc.max_waste;
				}
			}
			else
			if (the_car.model == Shimutshibu_models.MODEL_FOCER_WRC)
			{
				TurboCharger tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Dr, "Shimutshibu_RC_MWFCR22W12_turbocharger", desc );
				if (desc.power > 1.2)				
					tc.P_turbo_waste = (desc.power-1.2)/0.4*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
			}
		}
	}
}
