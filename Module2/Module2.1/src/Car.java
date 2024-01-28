public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;  // New instance variable for tank capacity
    private float topSpeed;      // New instance variable for top speed

    // Existing constructor
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
    }

    // New constructor with tank capacity and top speed
    public Car(String typeName, float tankCapacity, float topSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;

        // Initialize other fields to default values
        speed = 0;
        gasolineLevel = 0;
    }

    // Implementation of methods
    public void accelerate() {
        if (gasolineLevel > 0 && speed < topSpeed)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (amount > 0)
            speed = Math.max(0, speed - amount);
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    // New getters and setters for tankCapacity and topSpeed
    public float getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(float tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }
}
