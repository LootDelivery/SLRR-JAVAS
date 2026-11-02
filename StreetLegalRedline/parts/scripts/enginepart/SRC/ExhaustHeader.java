package java.game.parts.enginepart;

import java.render.osd.*;
import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;
import java.game.parts.enginepart.*;
import java.game.parts.rgearpart.*;

public class ExhaustHeader extends EnginePart
{
	float	efficiency = 1.0;

	public ExhaustHeader(){}

	public ExhaustHeader( int id )
	{
		super( id );

		name = "Exhaust header";

		prestige_calc_weight = 20.0;
	}
}

