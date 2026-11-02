package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.rgearpart.*;


public class Enula_F_strut_brace extends StrutBrace
{
	public Enula_F_strut_brace( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR front strut brace";
		description = "A supportive part for the front Ishima Enula WRY/WRZ/WR SuperTurizmo suspensions.";

		value = tHUF2USD(60.108);
		brand_new_prestige_value = 82.94;
	}
}
