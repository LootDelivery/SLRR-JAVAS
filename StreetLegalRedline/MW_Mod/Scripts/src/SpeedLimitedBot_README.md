# SpeedLimitedBot prototype

This prototype adds a separate `SpeedLimitedBot` subclass. It does not edit or replace the existing `Bot.java`.

## Behaviour

- Calls the existing `AI_GoToTarget` command through `Bot.driveStraightTo()`.
- `driveForwardTenMeters()` calculates one fixed point 10 metres ahead of the car's current position.
- A timer samples `Vehicle.getSpeedSquare()` every 0.10 seconds.
- When the car exceeds the configured limit, the script applies a proportional service-brake value to all available wheels through `WheelRef.setBrake()`.
- Default limit: **6 km/h**. This is a maximum-speed cap, not a guarantee that the AI will maintain exactly 6 km/h.
- Calling `stop()` or `leaveCar()` releases any brake pressure applied by this limiter.

## Integration

Put `SpeedLimitedBot.java` in the mod source directory:

`MW_Mod/Scripts/src/SpeedLimitedBot.java`

In the code that creates the test bot, replace only the constructor type:

```java
Bot bot = new SpeedLimitedBot( savefileid, rndseed, level );
// Keep the existing createCar(...) / enterCar(...) setup.
bot.createCar( map );

// Call after the car and BOTBRAIN have been created:
((SpeedLimitedBot)bot).driveForwardTenMeters();
```

Alternatively declare the variable as `SpeedLimitedBot` directly.

The class also overrides `driveStraightTo(Vector3)`, so an explicitly supplied target is limited too.

## Important test notes

- The speed conversion uses the same physical scale indicated by `TestTrack.java`: its squared-speed thresholds are labelled approximately 40 km/h and 50 km/h.
- The forward vector assumes the SLRR convention used by the Nevada track start: at zero yaw, forward is along `-Z`.
- Brake values are initially kept in the 0.08–0.55 range. The exact response of `setBrake()` against simultaneous BOTBRAIN throttle/brake control must be verified in-game.
- This is a source-level prototype. It has not been compiled or tested in the game runtime in this session.
