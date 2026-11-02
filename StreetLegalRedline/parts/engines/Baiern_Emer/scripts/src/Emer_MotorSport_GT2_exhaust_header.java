package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;


public class Emer_MotorSport_GT2_exhaust_header extends ExhaustHeader
{
	public Emer_MotorSport_GT2_exhaust_header( int id )
	{
		super( id );
		name = "Emer MotorSport Nonus GT2 exhaust header";
		description = "";
		brand_new_prestige_value = 36.01;

		value = tHUF2USD(108.992);
		setMaxWear(kmToMaxWear(200000.0));

		efficiency = 0.95;

		check4warnings();
	}
}
