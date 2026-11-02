package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Ishima_EX_head_exhaust_header extends ExhaustHeader
{
	public Ishima_EX_head_exhaust_header( int id )
	{
		super( id );
		name = "Ishima EX head exhaust header";
		description = "";
		brand_new_prestige_value = 38.45;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.80;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_ISHIMA)
		{
			if (the_car.model == Ishima_models.MODEL_ENULA_WRZ)
			{
				TurboCharger tc;
				if (desc.power < 1.2)
				{
					tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000048r, "Ishima_WRZ_turbocharger", desc );
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
			if (the_car.model == Ishima_models.MODEL_ENULA_WR_SUPERTURIZMO)
			{
				TurboCharger tc;
				if (desc.power > 1.3)
				{
					tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Dr, "Shimutshibu_RC_MWFCR22W12_turbocharger", desc );
					tc.P_turbo_waste = (desc.power-1.3)/0.7*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
				}
				else
				{
					addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F4r, "Ishima_WR_SuperTurizmo_turbocharger", desc );
				}
			}
		}
	}
}
