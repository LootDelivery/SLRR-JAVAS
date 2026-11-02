package java.game.parts.wheels.tyres;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tyre_285_45_18_11_0_LOD_CATALOG_GARAGE extends Tyre
{
	public tyre_285_45_18_11_0_LOD_CATALOG_GARAGE ( int id )
	{
		tyre_size_label = "285/45 R18";

		render_types[0]  = 0;		// for  5.0 inch wide rims //
		render_types[1]  = 0;		// for  5.5 inch wide rims //
		render_types[2]  = 0;		// for  6.0 inch wide rims //
		render_types[3]  = 0;		// for  6.5 inch wide rims //
		render_types[4]  = 0;		// for  7.0 inch wide rims //
		render_types[5]  = 0;		// for  7.5 inch wide rims //
		render_types[6]  = 0;		// for  8.0 inch wide rims //
		render_types[7]  = 0;		// for  8.5 inch wide rims //
		render_types[8]  = 0;		// for  9.0 inch wide rims //
		render_types[9]  = 0;		// for  9.5 inch wide rims //
		render_types[10] = parts.wheels:0x000001B5r;	// for 10.0 inch wide rims //
		render_types[11] = parts.wheels:0x000001B3r;	// for 10.5 inch wide rims //
		render_types[12] = parts.wheels:0x000003CDr;	// for 11.0 inch wide rims //
		render_types[13] = parts.wheels:0x000001B7r;	// for 11.5 inch wide rims //
		render_types[14] = parts.wheels:0x000001B9r;	// for 12.0 inch wide rims //
		render_types[15] = parts.wheels:0x000001BBr;	// for 12.5 inch wide rims //
		render_types[16] = parts.wheels:0x000001BDr;	// for 13.0 inch wide rims //
		render_types[17] = parts.wheels:0x000001BFr;	// for 13.5 inch wide rims //
		render_types[18] = parts.wheels:0x000001C1r;	// for 14.0 inch wide rims //
		render_types[19] = parts.wheels:0x000001C3r;	// for 14.5 inch wide rims //
		render_types[20] = parts.wheels:0x000001C5r;	// for 15.0 inch wide rims //
		render_types[21] = parts.wheels:0x000003CDr;	// this rendertype as default //

		SetupTyre(285.0, 45.0, 18.0, 11.0, tcSPORT, 2.0);

		calcStuffs();
	}

	public void updatevariables()
	{
		Wheel	rim = partOnSlot(1);

		if (rim)
		{
			int	render_type_index = clampTo((rim.rim_width-5)*2,0,20);

			if (render_types[render_type_index])
				setRenderType(render_types[render_type_index]);
			else
				setRenderType(render_types[21]);
			SetupTyre(285.0, 45.0, 18.0, rim.rim_width, tcSPORT);
			super.updatevariables();
		}
	}
}
