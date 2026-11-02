package java.game.parts.accessories;

import java.game.parts.enginepart.*;


public class stock_Battery_blue extends Battery
{
	public stock_Battery_blue ( int id )
	{
		super( id );

		name = "SL Tuners 55 Ah battery";
		description = "This 55 Ah is enough for a mildly modified street car with class 1 stereo. Recommended for large 4-inlines or small to medium 6-cylinder engines.";
		value = tHUF2USD(33);
		brand_new_prestige_value = 55.0;

		power = 55.0;
	}
}

