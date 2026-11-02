package java.game.parts.accessories;

import java.game.parts.enginepart.*;


public class stock_Battery_silver extends Battery
{
	public stock_Battery_silver ( int id )
	{
		super( id );

		name = "SL Tuners 65 Ah battery";
		description = "Should be enough for most cars in Valocity. With its 65 Ah capacity and pretty silver color this battery suites all engine bays in performance and looks.";
		value = tHUF2USD(40);
		brand_new_prestige_value = 65.0;

		power = 65.0;
	}
}

