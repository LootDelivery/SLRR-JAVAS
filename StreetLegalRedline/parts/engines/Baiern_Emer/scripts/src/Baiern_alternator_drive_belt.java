package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;

public class Baiern_alternator_drive_belt extends Part
{
	public Baiern_alternator_drive_belt( int id )
	{
		super( id );
		name = "Baiern alternator drive belt";
		description = "You need this belt for driving the alternator. It can be used with all Baiern and 100% compatible alternators.";

		value = tHUF2USD(1.1);
		brand_new_prestige_value = 25.55;
		setMaxWear(kmToMaxWear(30000.0));

		check4warnings();
	}
}
