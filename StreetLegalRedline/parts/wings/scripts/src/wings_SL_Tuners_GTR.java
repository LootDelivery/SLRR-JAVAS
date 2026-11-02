package java.game.parts.interior;

import java.game.parts.bodypart.*;


public class wings_SL_Tuners_GTR extends AnimatePart
{
	public wings_SL_Tuners_GTR( int id )
	{
		super( id );
		carCategory = COMMON; // Is visable in part bin for all cars (it isn't private car's part)

		name = "ANIMATE PART - Analog Airbrake";
		description = "A first animate part. By Miran";

		value = tHUF2USD(50.000); //Price
		brand_new_prestige_value = 65.00;// Prestige

		AnimateSlot = 1;

		MoveGoal_X = 0.0;
		MoveGoal_Y = 0.0;
		MoveGoal_Z = 0.0;

		RotateGoal_Y = 0.0;
		RotateGoal_P = 0.8;
		RotateGoal_R = 0.0;

		ShakeBySignal = 0;
		ShakeMove_X= 0.0;
		ShakeMove_Y= 0.0;
		ShakeMove_Z= 0.0;
		ShakeRotate_Y= 0.0;
		ShakeRotate_P= 0.0;
		ShakeRotate_R= 0.0;

		Signal_Type = 1; // 0-GoPedal, 1-BrakePedal, 2-ClutchPedal, 3-SteeringWheel, 4-HandBrake, 5-NitroButton, 6-HornButton, 7-CarSpeed
/*		For SignalTypes: 0, 1, 2, 4, 5, 6  
			Relase = signal 0.0
			Press = signal 1.0
		
		For SignalType Steering Wheel:
			Steer Left = signal 1.0
			Steer 0 = signal 0.0
			Steer Right = signal -1.0		
*/
		
		Signal_Interpretation = 0; // 0-Analog, 1-Digal

		MinSignalLevel = 0.0; // If signal level >= MinSignalLevel part will start animate
		MaxSignalLevel = 1.0; // Only at Analog Mode
	
		AnimateSpeed = 0.0; // Only at Digal mode
	}
}
