package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class Baiern_Kraftwerk_2_5_cylinder_head_cover extends Part
{
	public Baiern_Kraftwerk_2_5_cylinder_head_cover( int id )
	{
		super( id );
		name = "Baiern Kraftwerk 2.5 cylinder head cover";
		description = "A stylish light alloy valve cover painted to black with the Baiern, 6 cylinder and 2.5 logos polished.";

		value = tHUF2USD(15);
		brand_new_prestige_value = 38.32;
		setMaxWear(kmToMaxWear(1000000.0));

		check4warnings();
	}
}
