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

public class Pneumatic_SA extends Pneumatic_ShockAbsorber
{
	public Pneumatic_SA( int id )
	{
		super( id );

		name = "Pneumatic Shock Absorber";
		description = "This is a adjustable pneumatic shock absorber desinged for a car tunning. It is very universal: you can set the best parameters for yours low rider.";
		
		prestige_calc_weight = 200.0;
		value = tHUF2USD(420.10);

		type = 0;
		damping		= 5000.0;// N/(m/s)
		Up_length = 0.20; // m
		Down_length = 0.30; // m
	}
}