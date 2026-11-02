package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.*;
import java.game.cars.*;


public class Faktun_Group_Tran6_transmission_RWD_extension extends ReciprocatingEnginePart
{
	public Faktun_Group_Tran6_transmission_RWD_extension( int id )
	{
		super( id );
		name = "Faktun Group Tran6 center differential";
		description = "The center differential extension of the Faktun Group Tran6 transmission. You can adjust the drive ratio from 20-80% to 60-40 front to rear.";

		value = tHUF2USD(172);
		setMaxWear(kmToMaxWear(600000.0));
		brand_new_prestige_value = 74.33;

		maxRPM = 11000.0;
		inertia = kgToInertia(1.1);
	}

	public void fillDynoData( DynoData dd, int parentSlot )	//different in other (engine) part classes
	{
		super.fillDynoData( dd, parentSlot );

		if (the_car)
		{
			the_car.drive_type |= the_car.DT_RWD;
		}
	}
}
