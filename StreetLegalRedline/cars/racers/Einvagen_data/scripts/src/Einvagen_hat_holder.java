package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.*;


public class Einvagen_hat_holder extends Part
{
	public Einvagen_hat_holder( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT hat holder";
		description = "The stock hat holder for the GT models. It's easter egg code is EE-EV110-140HH";

		value = tHUF2USD(16.690);
		brand_new_prestige_value = 18.60;
	}
}
