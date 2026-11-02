package java.game.parts.wheels.tyres;

import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class tyre_225_55_20_9_0_LOD_CATALOG_GARAGE extends Tyre
{
	public tyre_225_55_20_9_0_LOD_CATALOG_GARAGE ( int id )
	{
		tyre_size_label = "225/55 R20";

		render_types[0]  = 0;		// for  5.0 inch wide rims //
		render_types[1]  = 0;		// for  5.5 inch wide rims //
		render_types[2]  = 0;		// for  6.0 inch wide rims //
		render_types[3]  = 0;		// for  6.5 inch wide rims //
		render_types[4]  = 0;		// for  7.0 inch wide rims //
		render_types[5]  = 0;		// for  7.5 inch wide rims //
		render_types[6]  = parts.wheels:0x000000CAr;	// for  8.0 inch wide rims //
		render_types[7]  = parts.wheels:0x000000C8r;	// for  8.5 inch wide rims //
		render_types[8]  = parts.wheels:0x000003C1r;	// for  9.0 inch wide rims //
		render_types[9]  = parts.wheels:0x000000CCr;	// for  9.5 inch wide rims //
		render_types[10] = parts.wheels:0x000000CEr;	// for 10.0 inch wide rims //
		render_types[11] = parts.wheels:0x000000D0r;	// for 10.5 inch wide rims //
		render_types[12] = parts.wheels:0x000000E1r;	// for 11.0 inch wide rims //
		render_types[13] = parts.wheels:0x000000E3r;	// for 11.5 inch wide rims //
		render_types[14] = parts.wheels:0x000000E5r;	// for 12.0 inch wide rims //
		render_types[15] = 0;		// for 12.5 inch wide rims //
		render_types[16] = 0;		// for 13.0 inch wide rims //
		render_types[17] = 0;		// for 13.5 inch wide rims //
		render_types[18] = 0;		// for 14.0 inch wide rims //
		render_types[19] = 0;		// for 14.5 inch wide rims //
		render_types[20] = 0;		// for 15.0 inch wide rims //
		render_types[21] = parts.wheels:0x000003C1r;	// this rendertype as default //

		SetupTyre(225.0, 55.0, 20.0, 9.0, tcSPORT, 2.0);

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
			SetupTyre(225.0, 55.0, 20.0, rim.rim_width, tcSPORT);
			super.updatevariables();
		}
	}
}
