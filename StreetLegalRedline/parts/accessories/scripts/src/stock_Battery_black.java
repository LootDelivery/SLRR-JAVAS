package java.game.parts.accessories;

import java.game.parts.enginepart.*;


public class stock_Battery_black extends Battery
{
	public stock_Battery_black ( int id )
	{
		super( id );

		name = "SL Tuners 45 Ah battery";
		description = "This 45 Ah is enough for a smaller domestic racer. Recommended for low budget racers with small to medium 4 or small 6-bangers.";
		value = tHUF2USD(22);
		brand_new_prestige_value = 45.0;

		power = 45.0;
	}
}

