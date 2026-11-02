package java.game.parts.bodypart;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.render.osd.*;
import java.game.*;
import java.game.cars.*;
import java.game.parts.*;
import java.game.parts.enginepart.*;
import java.game.parts.rgearpart.*;
import java.game.parts.rgearpart.reciprocatingrgearpart.*;

public class AnimatePart extends BodyPart
{
	// Position Animate
	int		AnimatePosition;

	int		AnimateSlot;
	float	MoveGoal_X;
	float	MoveGoal_Y;
	float	MoveGoal_Z;
	float	RotateGoal_Y;
	float	RotateGoal_P;
	float	RotateGoal_R;

	float	ShakeBySignal;
	float	ShakeMove_X;
	float	ShakeMove_Y;
	float	ShakeMove_Z;
	float	ShakeRotate_Y;
	float	ShakeRotate_P;
	float	ShakeRotate_R;


	int		Signal_Type; // 0-GoPedal, 1-BrakePedal, 2-ClutchPedal, 3-SteeringWheel, 4-HandBrake, 5-NitroButton, 6-HornButton, 7-CarSpeed
	int		Signal_Interpretation; // 0-Analog, 1-Digal
	float	AnimateSpeed; // Only at Digal mode
	float	MinSignalLevel; // If signal level >= MinSignalLevel part will start rotating
	float	MaxSignalLevel; // Only at Analog Mode

	float	Signal, Sig_Multiplier, Shake_Multiplier, progress, lastTime, currTime;
	Thread	PartRegister;// It is need to register animate part in chassis

	public AnimatePart( int id )
	{
		super( id );

		name = "AnimatePart";

		prestige_calc_weight = 20.0;

		catalog_view_ypr = new Ypr( -0.5, -0.7, 0.0 );
	}

	public void install()
	{
		getCar_LocalVersion();
		if(the_car)
		{
			the_car.AnimateParts.addElement(this);
			
			if(PartRegister)
			{
				PartRegister.stop();
				PartRegister = null;
			}
		}
		else
		{
			PartRegister = new Thread( this, "Part Register Thread" );
			PartRegister.setPriority(0);
			PartRegister.start();
		}

		super.install();
	}

	public void remove()
	{
		getCar_LocalVersion();
		if(the_car)
			the_car.AnimateParts.removeElement(this);
	}

	public void falloff()
	{
		remove();
	}

	public void Refresher_Start()
	{
		Sig_Multiplier = 1/(-MinSignalLevel+MaxSignalLevel);
		lastTime = System.simTime();
	}

	public void Refresher_Stop()
	{
		setSlotPos( AnimateSlot, null, null );// Restore to default
	}

	public void Refresh()
	{
		if( Signal_Type == 0 ) Signal = Input.getInput( Input.AXIS_THROTTLE )/127.0;// Go Pedal 
		else
		if( Signal_Type == 1 ) Signal = Input.getInput( Input.AXIS_BRAKE )/127.0;// Brake Pedal
		else
		if( Signal_Type == 2 ) Signal = Input.getInput( Input.AXIS_CLUTCH )/127.0;// Clutch Pedal
		else
		if( Signal_Type == 3 ) Signal = Input.getInput( Input.AXIS_TURN_LEFTRIGHT )/127.0;// Steering Wheel
		else
		if( Signal_Type == 4 ) Signal = Input.getInput( Input.AXIS_NITRO )/127.0;// Hand Brake
		else
		if( Signal_Type == 5 ) Signal = Input.getInput( Input.AXIS_HANDBRAKE )/127.0;// Nitro Button
		else
		if( Signal_Type == 6 ) Signal = Input.getInput( Input.AXIS_HORN )/127.0;// Horn Button
		else
		if( Signal_Type == 7 )// Car Speed
		{
			if( GameLogic.player.car )
				Signal = Math.sqrt( GameLogic.player.car.getSpeedSquare())*3.6; // Km\h
		}

		if( Signal_Interpretation == 0 )// Analog
		{
			float TempSig;

			if( Signal_Type == 3 )// Steering
			{
				if( Signal > MaxSignalLevel ) TempSig = 0.5;
				else
				if( Signal < MinSignalLevel ) TempSig = -0.5;
				else
					TempSig = (Signal-MinSignalLevel)*Sig_Multiplier-0.5;
			}
			else // Other
			{
				if( Signal > MaxSignalLevel ) TempSig = 1;
				else
				if( Signal < MinSignalLevel ) TempSig = 0;
				else
					TempSig = (Signal-MinSignalLevel)*Sig_Multiplier;
			}

			if(ShakeBySignal) Shake_Multiplier = TempSig;
			else Shake_Multiplier = 1;

			setSlotPos( AnimateSlot, new Vector3( MoveGoal_X*TempSig+(Shake_Multiplier*(ShakeMove_X*Math.random()-ShakeMove_X/2)), MoveGoal_Y*TempSig+(Shake_Multiplier*(ShakeMove_Y*Math.random()-ShakeMove_Y/2)), MoveGoal_Z*TempSig+(Shake_Multiplier*(ShakeMove_Z*Math.random()-ShakeMove_Z/2))), new Ypr( RotateGoal_Y*TempSig+(Shake_Multiplier*(ShakeRotate_Y*Math.random()-ShakeRotate_Y/2)), RotateGoal_P*TempSig+(Shake_Multiplier*(ShakeRotate_P*Math.random()-ShakeRotate_P/2)), RotateGoal_R*TempSig+(Shake_Multiplier*(ShakeRotate_R*Math.random()-ShakeRotate_R/2))) );// Set Pos
			
			//GameLogic.garage.infoline.changeText( "Signal: " + Signal + ", TempSig: " + TempSig );// Debug Text
		}
		else// Digal
		{	
			currTime = System.simTime(); // Speed control

			if( Signal_Type == 3 )// Steering
			{
				if( Signal > MaxSignalLevel )
				{
					if( progress < -MinSignalLevel+MaxSignalLevel/2 )
					{
						progress += AnimateSpeed*(currTime-lastTime);
						Shake_Multiplier = 1;
					}
				}
				else
				if( Signal < MinSignalLevel )
				{
					if( progress > -(-MinSignalLevel+MaxSignalLevel/2) )
					{
						progress -= AnimateSpeed*(currTime-lastTime);
						Shake_Multiplier = 1;
					}
				}
				else
				{
					if( progress > 2*AnimateSpeed*(currTime-lastTime) )
					{
						progress -= AnimateSpeed*(currTime-lastTime);
						Shake_Multiplier = 1;
					}
					else
					if( progress < -2*AnimateSpeed*(currTime-lastTime) )
					{
						progress += AnimateSpeed*(currTime-lastTime);
						Shake_Multiplier = 1;
					}
					else
					{
						progress = 0;

						if(ShakeBySignal) Shake_Multiplier = 0;
						else Shake_Multiplier = 1;
					}
				}
			}
			else//Other
			{
				if( Signal > MinSignalLevel )
				{
					if( progress < 1 )
					{
						progress += AnimateSpeed*(currTime-lastTime);
						Shake_Multiplier = 1;
					}
				}
				else
				{
					if( progress > 2*AnimateSpeed*(currTime-lastTime) )
					{
						progress -= AnimateSpeed*(currTime-lastTime);
						Shake_Multiplier = 1;
					}
					else
					{
						progress = 0;

						if(ShakeBySignal) Shake_Multiplier = 0;
						else Shake_Multiplier = 1;
					}
				}

			}
			
			lastTime = currTime;
			setSlotPos( AnimateSlot, new Vector3( MoveGoal_X*progress+(Shake_Multiplier*(ShakeMove_X*Math.random()-ShakeMove_X/2)), MoveGoal_Y*progress+(Shake_Multiplier*(ShakeMove_Y*Math.random()-ShakeMove_Y/2)), MoveGoal_Z*progress+(Shake_Multiplier*(ShakeMove_Z*Math.random()-ShakeMove_Z/2))), new Ypr( RotateGoal_Y*progress+(Shake_Multiplier*(ShakeRotate_Y*Math.random()-ShakeRotate_Y/2)), RotateGoal_P*progress+(Shake_Multiplier*(ShakeRotate_P*Math.random()-ShakeRotate_P/2)), RotateGoal_R*progress+(Shake_Multiplier*(ShakeRotate_R*Math.random()-ShakeRotate_R/2))) );// Set Pos
		
			//GameLogic.garage.infoline.changeText( "Signal: " + Signal + ", progress: " + progress + ", TimeStep:" + (currTime-lastTime) );// Debug Text
		}
	}

// If part is creating from save and isn't attaching to chassis while the_car no exist,and part can't be register in it
	public void run()// Wait and check the_car is exist, if yes register this animate part and end thread
	{
		for(;;)
		{
			if( the_car )
			{			
				the_car.AnimateParts.addElement(this);// Register part
			
				PartRegister.stop(); // End thread
				PartRegister = null;
			}
			else
				PartRegister.sleep(70);
		}
	}
}