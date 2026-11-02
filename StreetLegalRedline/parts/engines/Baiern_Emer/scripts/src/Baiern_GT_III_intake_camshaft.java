package java.game.parts.engines.Baiern_Emer;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;
import java.game.parts.enginepart.slidingenginepart.reciprocatingenginepart.camshaft.*;


public class Baiern_GT_III_intake_camshaft extends DOHC_Camshaft
{
	public Baiern_GT_III_intake_camshaft( int id )
	{
		super( id );
		name = "Baiern GT III intake camshaft";
		description = "This shaft is for the GT III 24V DOHC cylinder heads. \n It can be finely adjusted +- 90.0 degrees in 5.0 degree steps, so you can achieve both high RPM peak power or middle range torque. \n Weighs 5.3 kgs (11.7 pounds), gross lift is 11.9 mm (0.47 inch), duration is 232 degrees, lobe center is at 132 degrees ATDC.";

		value = tHUF2USD(195);
		brand_new_prestige_value = 140.51;
		setMaxWear(kmToMaxWear(390000.0));

		static_input_lobe_separation	= 252.0;
		static_input_lift_in_open	= 12.5;
		static_input_lift_in_close	= 0.0;
		static_input_lift_out_open	= 0.0;
		static_input_lift_out_close	= 0.0;
		static_input_time_in_duration	= 272.0;
		static_input_time_out_duration	= 0.0;

		advance_positive_peak		= +15.0;
		advance_negative_peak		= -15.0;
		advance_minimum_step		= 1.0;

		advance				= 0.0;

		maxRPM = 20000.0;
		inertia = kgToInertia(3.3);

		check4warnings();
	}
}
