package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Einvagen_supercharger_drive_belt extends Part
{
	public Einvagen_supercharger_drive_belt( int id )
	{
		super( id );
		name = "Einvagen supercharger drive belt";
		description = "";
		brand_new_prestige_value = 3.35;

		value = tHUF2USD(8.5);
		setMaxWear(kmToMaxWear(55000.0));
	}
}
