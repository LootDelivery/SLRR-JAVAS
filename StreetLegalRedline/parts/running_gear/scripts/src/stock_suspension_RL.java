package java.game.parts.running_gear;

import java.game.parts.*;
import java.game.parts.rgearpart.*;

public class stock_suspension_RL extends Suspension
{
	public stock_suspension_RL (){}

	public stock_suspension_RL ( int id )
	{
		super( id );

		name = "Rear left double-wishbone suspension";
		description = "";

		value = 160;
		brand_new_prestige_value = 20.0;
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
				wheel.setArm(0.244, 0.344,0.054,0, 0,0,1);
				wheel.setHub(0.263, 0,-0.125,0, 0,0.143,0, 0.360,0.323,0);
				the_car.setSlotPos(101+wheelID, new Vector3(-0.1,0,0), null );
			}
		}
	}
}
