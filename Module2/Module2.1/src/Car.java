public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;

    // Existing constructor
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
    }


    public Car(String typeName, float tankCapacity, float topSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;

        speed = 0;
        gasolineLevel = 0;
    }

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
