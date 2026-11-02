package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Focer_WRC_engine extends Set
{
	public kit_Focer_WRC_engine( int id )
	{
		super( id );
		name = "380HP Shimutshibu engine kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F9r ); // Shimutshibu_RC_B94S200_block
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F5r ); // Shimutshibu_72er_crankshaft
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FBr ); // Shimutshibu_crankshaft_bearing_bridge
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FCr ); // Shimutshibu_oil_pan
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F6r ); // Shimutshibu_149er_connecting_rods
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F8r ); // Shimutshibu_94er_LC_pistons
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FDr ); // Shimutshibu_alternator
		inv.insertItem( parts.engines.Baiern_Emer:0x00000045r ); // Baiern_Kraftwerk_2_5_flywheel
		inv.insertItem( parts.engines.Baiern_Emer:0x00000043r ); // Baiern_Kraftwerk_clutch
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000FAr ); // Shimutshibu_RC_T5600R1_transmission
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000101r ); // Shimutshibu_RC_X8550SR5_transmission_RWD_extension
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000100r ); // Shimutshibu_RC_DDSB8C_cylinder_head
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000102r ); // Shimutshibu_exhaust_camshaft
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000103r ); // Shimutshibu_intake_camshaft
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000104r ); // Shimutshibu_camshaft_bearing_bridge
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000107r ); // Shimutshibu_WRC_cylinder_head_cover
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000108r ); // Shimutshibu_camshaft_drive_belt
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Ar ); // Shimutshibu_RC_23W44EX_exhaust_header
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Dr ); // Shimutshibu_RC_MWFCR22W12_turbocharger
                inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000054r ); // Turbocharger_air_out_pipe
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000055r ); // Turbocharger_exhaust_pipe
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000109r ); // Shimutshibu_RC_HIB535T4_intake_manifold
		inv.insertItem( parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000010Br ); // Shimutshibu_RC_IR4P4SI_fuel_rail
	}
}
