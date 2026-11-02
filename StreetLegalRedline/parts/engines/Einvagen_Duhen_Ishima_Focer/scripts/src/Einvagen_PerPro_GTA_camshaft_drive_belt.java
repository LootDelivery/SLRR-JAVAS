package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.cars.*;


public class Einvagen_PerPro_GTA_camshaft_drive_belt extends Part
{
	public Einvagen_PerPro_GTA_camshaft_drive_belt( int id )
	{
		super( id );
		name = "Einvagen PerPro GTA camshaft drive belt";
		description = "";
		brand_new_prestige_value = 3.35;

		value = tHUF2USD(2.5);
		setMaxWear(kmToMaxWear(18000.0));
	}
}
