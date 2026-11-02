package java.game.parts.wheels.tyres;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tyre_265_45_18_10_5_LOD_CATALOG_GARAGE extends Tyre
{
	public tyre_265_45_18_10_5_LOD_CATALOG_GARAGE ( int id )
	{
		tyre_size_label = "265/45 R18";

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
		render_types[10] = parts.wheels:0x00000177r;	// for 10.0 inch wide rims //
		render_types[11] = parts.wheels:0x000003CBr;	// for 10.5 inch wide rims //
		render_types[12] = parts.wheels:0x00000179r;	// for 11.0 inch wide rims //
		render_types[13] = parts.wheels:0x0000017Br;	// for 11.5 inch wide rims //
		render_types[14] = parts.wheels:0x0000017Dr;	// for 12.0 inch wide rims //
		render_types[15] = parts.wheels:0x0000017Fr;	// for 12.5 inch wide rims //
		render_types[16] = parts.wheels:0x00000181r;	// for 13.0 inch wide rims //
		render_types[17] = parts.wheels:0x00000183r;	// for 13.5 inch wide rims //
		render_types[18] = parts.wheels:0x00000185r;	// for 14.0 inch wide rims //
		render_types[19] = 0;		// for 14.5 inch wide rims //
		render_types[20] = 0;		// for 15.0 inch wide rims //
		render_types[21] = parts.wheels:0x000003CBr;	// this rendertype as default //

		SetupTyre(265.0, 45.0, 18.0, 10.5, tcSPORT, 2.0);

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
			SetupTyre(265.0, 45.0, 18.0, rim.rim_width, tcSPORT);
			super.updatevariables();
		}
	}
}
