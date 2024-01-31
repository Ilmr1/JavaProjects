public class SportsCar extends Car {
    private static final int ACCELERATION_BONUS = 5; // Additional acceleration
    private static final float FUEL_CONSUMPTION_INCREASE = 1.2f; // Higher fuel consumption

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        super.accelerate(); // Call the base class method

        // Additional acceleration if there's enough fuel
        if (getGasolineLevel() > 0) {
            float extraFuel = 10 * (FUEL_CONSUMPTION_INCREASE - 1);
            float newGasolineLevel = Math.max(0, getGasolineLevel() - extraFuel); // Decrease gasoline more rapidly
            super.speed = Math.min(100, getSpeed() + ACCELERATION_BONUS); // Increase speed (considering max speed)

            // Manually set the reduced gasoline level
            super.gasolineLevel = newGasolineLevel;
        }
    }

    @Override
    public void decelerate(int amount) {
        // Call the base class method with an increased deceleration amount
        super.decelerate(Math.min(100, (int) (amount * 1.5))); // Increase the deceleration effect
    }
}
