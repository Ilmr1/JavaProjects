public class Task4Car {

    private boolean cruiseControlOn;
    private float cruiseControlSpeed;
    private final float CRUISE_CONTROL_MIN_SPEED = 30; // Minimum speed for cruise control
    private final float CRUISE_CONTROL_MAX_SPEED = 150; // Maximum speed for cruise control

    // Existing constructors and methods...

    // Cruise control methods
    public boolean setCruiseControlSpeed(float targetSpeed) {
        if (targetSpeed >= CRUISE_CONTROL_MIN_SPEED && targetSpeed <= CRUISE_CONTROL_MAX_SPEED) {
            cruiseControlSpeed = targetSpeed;
            return true;
        }
        return false;
    }

    public float getCruiseControlSpeed() {
        return cruiseControlSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (speed >= CRUISE_CONTROL_MIN_SPEED && speed <= CRUISE_CONTROL_MAX_SPEED) {
            cruiseControlOn = true;
            // Logic to adjust speed to match cruise control speed
            // This could involve calling accelerate() or decelerate() until speed matches cruiseControlSpeed
            // If this is not possible due to constraints (like gasoline level), set cruiseControlOn to false and return false
            return true;
        }
        return false;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    // Modify accelerate and decelerate methods to take cruise control into account if necessary
}
