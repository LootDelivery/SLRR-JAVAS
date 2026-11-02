package java.game.parts.running_gear.rr_susp;

import java.game.parts.*;
import java.game.parts.rgearpart.*;

public class SunStrip_20_RR_trailing_arm extends Suspension
{
	public SunStrip_20_RR_trailing_arm ( int id )
	{
		super( id );

		name = "Duhen Racing SunStrip 2.0 CDVC rear right trailing-arm";

		value = tHUF2USD(77.0);
		brand_new_prestige_value = 40.0;

		VICx =  0.880;
		VICy =  0.010;

		LICy =  0.100;
		LICz = -0.600;

		camber = -1.5;
		toe    = -2.0;

		side   = SD_RIGHT;
	}

	public void updatevariables()
	{
		if (!the_car)
			getCar_LocalVersion();
		if (the_car)
		{
			int wheelID = getWheelID();
			WheelRef wheel = the_car.getWheel(wheelID);
			if (wheel)
			{
				wheel.setArm( 0.420,
				             -0.352, 0.24-0.058,-0.176,
				             -0.904, 0.000, 1.077);
				wheel.setHub(-1.000,
				             -0.121, 0.000, 0.000,
				              0.000, 0.000, 0.000,
				              0.000, 0.000, 0.000);

				the_car.setSlotPos(101+wheelID, new Vector3( 0.024,0,0), null );
				the_car.setSlotPos(111+wheelID, new Vector3( 0.013,0,0), null );

				setRollCenter(wheel);
				setSuspensionGeometry(wheel);
			}
		}
	}
}
