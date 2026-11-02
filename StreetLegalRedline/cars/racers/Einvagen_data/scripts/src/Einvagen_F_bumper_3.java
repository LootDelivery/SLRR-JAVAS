package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_F_bumper_3 extends Bumper
{
	public Einvagen_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning front bumper";
		description = "Stage 1 replacement front bumper.";

		value = tHUF2USD(144.248);
		brand_new_prestige_value = 80.00;
	}
}
