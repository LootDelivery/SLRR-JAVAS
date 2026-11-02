package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_taillights extends Taillights
{
	public Nonus_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus right taillights";
		description = "";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(43.783);
	}
}
