package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Einvagen_110_GT_exhaust_camshaft extends DOHC_Camshaft
{
	public Einvagen_110_GT_exhaust_camshaft( int id )
	{
		super( id );

		value = tHUF2USD(40);
		brand_new_prestige_value = 11.18;
		setMaxWear(kmToMaxWear(280000.0));

		static_input_lobe_separation	= 265.0;
		static_input_lift_in_open	= 0.0;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 13.5;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 0.0;
		static_input_time_out_duration	= 195.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		name = "Einvagen 110 GT/GTK exhaust camshaft";
		description = "This is the stock exhaust camshaft of the GT and GTK models. \n It "+advanceCapabsToText()+". Can only be used in DOHC heads. Weighs "+massToText(4.0)+". \n Parameters: gross lift is "+liftToText(static_input_lift_out_open)+", duration is "+degToText(static_input_time_out_duration)+".";

		maxRPM = 10000.0;
		inertia = kgToInertia(4.0);
	}
}
