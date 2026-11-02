package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.enginepart.airfueldeliverysystem.charger.*;
import java.game.cars.*;


public class Duhen_SolarWind_exhaust_header extends ExhaustHeader
{
	public Duhen_SolarWind_exhaust_header( int id )
	{
		super( id );
		name = "Duhen SolarWind exhaust header";
		description = "";
		brand_new_prestige_value = 25.15;

		value = tHUF2USD(4*5+10);
		setMaxWear(kmToMaxWear(210000.0));

		efficiency = 0.85;
	}

	public void addStockParts( Descriptor desc )
	{
		super.addStockParts( desc );

		getCar_LocalVersion();

		if (the_car.make == the_car.MAKE_DUHEN)
		{
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_1_5_DVC)
			{
				if (desc.power > 1.4)
				{
					TurboCharger tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000113r, "Duhen_Racing_BoostMaster_turbocharger", desc );
					if (desc.power < 1.7)
						tc.P_turbo_waste = (desc.power-1.4)/0.3*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
					else
						tc.P_turbo_waste = tc.max_waste;
				}
			}
			else
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_1_8_DVC)
			{
				if (desc.power > 1.4)
				{
					TurboCharger tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000113r, "Duhen_Racing_BoostMaster_turbocharger", desc );
					if (desc.power < 1.7)
						tc.P_turbo_waste = (desc.power-1.4)/0.3*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
					else
						tc.P_turbo_waste = tc.max_waste;
				}
			}
			else
			if (the_car.model == Duhen_models.MODEL_SUNSTRIP_2_2_DVC)
			{
				if (desc.power > 1.6)
				{
					TurboCharger tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000113r, "Duhen_Racing_BoostMaster_turbocharger", desc );
					if (desc.power < 1.8)
						tc.P_turbo_waste = (desc.power-1.6)/0.2*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
					else
						tc.P_turbo_waste = tc.max_waste;
				}
			}
			else
			if (the_car.model == Duhen_models.MODEL_RACING_SUNSTRIP_2_0_CDVC)
			{
				TurboCharger tc = addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000113r, "Duhen_Racing_BoostMaster_turbocharger", desc );
				if (desc.power < 1.8)
				{
					if (desc.power > 1.3)
						tc.P_turbo_waste = (desc.power-1.3)/0.5*(tc.max_waste-tc.default_P_turbo_waste)+tc.default_P_turbo_waste;
				}
				else
					tc.P_turbo_waste = tc.max_waste;
			}
		}
	}
}
