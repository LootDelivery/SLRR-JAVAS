package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_F_bumper_4 extends Bumper
{
	public Einvagen_F_bumper_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning 2 front bumper";
		description = "Stage 2 replacement front bumper.";

		value = tHUF2USD(115.399);
		brand_new_prestige_value = 100.00;
	}
}
