package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_FL_fender_skirt extends DecorativeBodyPart
{
	public Einvagen_FL_fender_skirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning front left fender skirt";
		description = "A decorative part that is attachable to the stock front left Einvagen GT quarter panel.";

		value = tHUF2USD(14.424);
		brand_new_prestige_value = 60.00;
	}
}
