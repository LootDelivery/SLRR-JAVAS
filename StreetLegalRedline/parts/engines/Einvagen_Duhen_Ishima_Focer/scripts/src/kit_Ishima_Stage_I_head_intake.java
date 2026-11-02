package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Ishima_Stage_I_head_intake extends Set
{
	public kit_Ishima_Stage_I_head_intake( int id )
	{
		super( id );
		name = "Stage I japanese inline-4 head+intake kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000E9r ); // Ishima_WR_head_cylinder_head
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000102r ); // Shimutshibu_exhaust_camshaft
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000103r ); // Shimutshibu_intake_camshaft
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000ECr ); // Ishima_camshaft_bearing_bridge
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000EEr ); // Ishima_WRZ_cylinder_head_cover
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000C6r ); // Duhen_SolarTunnel_intake_manifold
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F3r ); // Ishima_FN_rail_fuel_rail
	}
}
