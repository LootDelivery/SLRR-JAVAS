package java.game;

import java.render.osd.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;
import java.game.parts.rgearpart.*;

import java.game.parts.rgearpart.reciprocatingrgearpart.brake.*;

public class MW_Disc_Brake extends DiscBrake
{
	public MW_Disc_Brake ( int id )
	{
		super( id );

		diam_mm				= 360.0;
		friction_disc		= RT_VENTEDGROOVED;
		friction_pad		= BP_BLACK_STUFF;
		number_of_calipers	= 3.0;
		force			= CL_FORCE_1;

		name_prefix = "MW-Tunners";
		brand_prestige_factor = 2.3;
		calcStuffs();

		renderID_FL = MW_Mod:0x00000085r;
		renderID_FR = MW_Mod:0x00000087r;
		renderID_RL = MW_Mod:0x00000089r;
		renderID_RR = MW_Mod:0x00000091r;
	}
}
