package java.game.parts.engines.Einvagen_Duhen_Ishima_Focer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Shimutshibu_intake_camshaft extends DOHC_Camshaft
{
	public Shimutshibu_intake_camshaft( int id )
	{
		super( id );
		name = "Shimutshibu intake camshaft";
		description = "";
		brand_new_prestige_value = 17.09;

		value = tHUF2USD(80);
		setMaxWear(kmToMaxWear(410000.0));

		static_input_lobe_separation	= 242.0;
		static_input_lift_in_open	= 13.5;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 224.0;
		static_input_time_out_duration	= 0.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		name = "Shimutshibu Focer EC224-135 intake camshaft";
		description = "This is the stock exhaust camshaft for all Focer engines. \n It "+advanceCapabsToText()+". Can only be used in DOHC heads. Weighs "+massToText(4.0)+". \n Parameters: gross lift is "+liftToText(static_input_lift_in_open)+", duration is "+degToText(static_input_time_in_duration)+".";

		maxRPM = 10000.0;
		inertia = kgToInertia(4.0);
	}
}
