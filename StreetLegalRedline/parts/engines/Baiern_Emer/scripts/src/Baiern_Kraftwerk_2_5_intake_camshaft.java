package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Baiern_Kraftwerk_2_5_intake_camshaft extends DOHC_Camshaft
{
	public Baiern_Kraftwerk_2_5_intake_camshaft( int id )
	{
		super( id );
		name = "Baiern Kraftwerk 2.5 intake camshaft";
		description = "This shaft is for the stock 24V DOHC cylinder heads. \n It can be finely adjusted +- 90.0 degrees in 5.0 degree steps, so you can achieve both high RPM peak power or middle range torque. \n Weighs 5.3 kgs (11.7 pounds), gross lift is 11.9 mm (0.47 inch), duration is 232 degrees, lobe center is at 132 degrees ATDC.";

		value = tHUF2USD(51);
		brand_new_prestige_value = 63.87;
		setMaxWear(kmToMaxWear(380000.0));

		static_input_lobe_separation	= 264.0;
		static_input_lift_in_open	= 11.9;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 232.0;
		static_input_time_out_duration	= 0.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 10000.0;
		inertia = kgToInertia(5.3);

		check4warnings();
	}
}
