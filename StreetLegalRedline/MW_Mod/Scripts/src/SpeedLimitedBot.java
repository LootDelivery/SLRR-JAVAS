package java.game;

import java.io.*;
import java.util.*;
import java.game.parts.*;

/**
 * Small AI movement prototype:
 * - drives a Bot to one fixed point 10 metres ahead;
 * - applies a proportional service-brake limiter around 6 km/h;
 * - leaves the original Bot.java unchanged.
 *
 * Replace new Bot(...) with new SpeedLimitedBot(...) for the test bot,
 * then call driveForwardTenMeters() after createCar(...).
 */
public class SpeedLimitedBot extends Bot
{
	final static int SPEED_LIMIT_TIMER_ID = 97;
	final static float SPEED_LIMIT_TIMER_INTERVAL = 0.10;

	final static float DEFAULT_SPEED_LIMIT_KMH = 6.0;
	final static float ENGAGE_MARGIN_MPS = 0.08;
	final static float RELEASE_MARGIN_MPS = 0.12;
	final static float BRAKE_GAIN = 1.50;
	final static float MIN_BRAKE = 0.08;
	final static float MAX_BRAKE = 0.55;

	float speedLimitKmh = DEFAULT_SPEED_LIMIT_KMH;
	int speedLimiterActive;
	int speedLimiterBraking;
	int speedTimerScheduled;

	public SpeedLimitedBot( int savefileid, int rndseed, float level )
	{
		super( savefileid, rndseed, level );
	}

	public SpeedLimitedBot( int savefileid, int rndseed, float col, float opti, float eng, float ai )
	{
		super( savefileid, rndseed, col, opti, eng, ai );
	}

	/**
	 * Set the maximum speed used by the limiter.
	 * This is a cap, not a guaranteed cruise speed.
	 */
	public void setSpeedLimitKmh( float kmh )
	{
		if( kmh < 0.5 )
			kmh = 0.5;

		speedLimitKmh = kmh;
	}

	/**
	 * Compute one fixed target point in front of the current car position.
	 * SLRR's zero-yaw forward direction is -Z.
	 */
	public void driveForwardTenMeters()
	{
		if( !car || !brain )
			return;

		Vector3 position = car.getPos();
		Ypr orientation = car.getOri();

		float yaw = orientation.y;
		float distance = 10.0;

		// The -sin/-cos signs match the game's Nevada start heading
		// and its first checkpoint direction.
		float dx = -(float)Math.sin( yaw ) * distance;
		float dz = -(float)Math.cos( yaw ) * distance;

		Vector3 destination = new Vector3(
			position.x + dx,
			position.y,
			position.z + dz
		);

		driveStraightTo( destination );
	}

	/**
	 * Any direct GoToTarget call through this subclass also gets the limiter.
	 */
	public void driveStraightTo( Vector3 destination )
	{
		startSpeedLimiter();
		super.driveStraightTo( destination );
	}

	private void startSpeedLimiter()
	{
		if( !car || !car.chassis )
			return;

		speedLimiterActive = 1;

		if( !speedTimerScheduled )
		{
			speedTimerScheduled = 1;
			setEventMask( EVENT_COMMAND | EVENT_TIME );
			addTimer( SPEED_LIMIT_TIMER_INTERVAL, SPEED_LIMIT_TIMER_ID );
		}
	}

	private void stopSpeedLimiter()
	{
		speedLimiterActive = 0;

		if( speedLimiterBraking )
			setWheelBrake( 0.0 );

		speedLimiterBraking = 0;
	}

	public void stop()
	{
		stopSpeedLimiter();
		super.stop();
	}

	public void leaveCar( int leaveInTraffic )
	{
		stopSpeedLimiter();
		super.leaveCar( leaveInTraffic );
	}

	/**
	 * Timer parameter 97 is reserved for the limiter. Bot.java uses 0 for
	 * its existing traffic re-join timer, so the two timer jobs stay distinct.
	 */
	public void handleEvent( GameRef obj_ref, int event, int param )
	{
		if( event == EVENT_TIME && param == SPEED_LIMIT_TIMER_ID )
		{
			if( speedLimiterActive )
			{
				updateSpeedLimiter();

				setEventMask( EVENT_COMMAND | EVENT_TIME );
				addTimer( SPEED_LIMIT_TIMER_INTERVAL, SPEED_LIMIT_TIMER_ID );
			}
			else
			{
				speedTimerScheduled = 0;
			}
			return;
		}

		super.handleEvent( obj_ref, event, param );

		// Bot.handleEvent() clears EVENT_TIME for its own timer.
		// Re-enable it when our independent limiter timer is still running.
		if( event == EVENT_TIME && speedLimiterActive )
			setEventMask( EVENT_COMMAND | EVENT_TIME );
	}

	private void updateSpeedLimiter()
	{
		if( !car || !car.chassis )
		{
			stopSpeedLimiter();
			return;
		}

		// getSpeedSquare() is based on metres/second squared.
		float targetSpeedMps = speedLimitKmh / 3.6;
		float speedSquare = car.getSpeedSquare();
		if( speedSquare < 0.0 )
			speedSquare = 0.0;

		float currentSpeedMps = (float)Math.sqrt( speedSquare );

		if( !speedLimiterBraking )
		{
			if( currentSpeedMps <= targetSpeedMps + ENGAGE_MARGIN_MPS )
				return;

			speedLimiterBraking = 1;
		}

		// Hysteresis prevents rapid brake on/off chatter at the limit.
		if( currentSpeedMps <= targetSpeedMps - RELEASE_MARGIN_MPS )
		{
			setWheelBrake( 0.0 );
			speedLimiterBraking = 0;
			return;
		}

		float brake = ( currentSpeedMps - targetSpeedMps ) * BRAKE_GAIN;
		if( brake < MIN_BRAKE )
			brake = MIN_BRAKE;
		if( brake > MAX_BRAKE )
			brake = MAX_BRAKE;

		setWheelBrake( brake );
	}

	private void setWheelBrake( float brake )
	{
		if( !car || !car.chassis )
			return;

		int wheelCount = car.chassis.getWheels();
		for( int i = 0; i < wheelCount; i++ )
		{
			WheelRef wheel = car.chassis.getWheel( i );
			if( wheel )
				wheel.setBrake( brake );
		}
	}
}
