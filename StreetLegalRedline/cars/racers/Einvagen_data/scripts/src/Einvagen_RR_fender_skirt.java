package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_RR_fender_skirt extends DecorativeBodyPart
{
	public Einvagen_RR_fender_skirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen OCA Tuning rear right fender skirt";
		description = "A decorative part that can be installed to all Einvagen GTs. It's attached to the chassis on the right side.";

		value = tHUF2USD(14.424);
		brand_new_prestige_value = 60.00;
	}
}
