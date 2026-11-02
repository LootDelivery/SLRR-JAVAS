package java.game.parts.running_gear.rl_susp;

import java.game.parts.*;
import java.game.parts.rgearpart.*;

public class Nonus_SGT_RL_trailing_arm extends Suspension
{
	public Nonus_SGT_RL_trailing_arm ( int id )
	{
		super( id );

		name = "Emer Nonus StreetGT rear left trailing-arm";

		value = tHUF2USD(83.0);
		brand_new_prestige_value = 46.0;

		VICx =  1.180;
		VICy = -0.100;

		LICy =  0.050;
		LICz = -1.350;

		camber = -2.5;
		toe    = -2.0;

		side   = SD_LEFT;
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
				              0.352, 0.24-0.058,-0.176,
				              0.904, 0.000, 1.077);
				wheel.setHub(-1.000,
				              0.121, 0.000, 0.000,
				              0.000, 0.000, 0.000,
				              0.000, 0.000, 0.000);
				                        
				the_car.setSlotPos(101+wheelID, new Vector3(-0.024,0,0), null );
				the_car.setSlotPos(111+wheelID, new Vector3(-0.013,0,0), null );

				setRollCenter(wheel);
				setSuspensionGeometry(wheel);
			}
		}
	}
}
