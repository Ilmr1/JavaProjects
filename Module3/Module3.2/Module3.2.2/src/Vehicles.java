interface Vehicle {
    void start();
    void stop();
    void info();
    void increaseSpeed();
    void lowerSpeed();
}

abstract class AbstractVehicle implements Vehicle {
    String info;
    int maxSpeed;
    int currentSpeed;

    public AbstractVehicle(String information, int maxSpeed, int currentSpeed) {
        this.info = information;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    @Override
    public void info() {
        System.out.println(info + " Huippunopeus: " + maxSpeed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Vehicle is increasing speed...");
        while (currentSpeed < maxSpeed) {
            currentSpeed+=25;
            System.out.println(currentSpeed + " Kmh");
        }
        System.out.println("Vehicle is at max speed.");
    }

    @Override
    public void lowerSpeed() {
        System.out.println("Vehicle is decreasing speed...");
        if (currentSpeed > 0) {
            currentSpeed--;
            System.out.println(currentSpeed + " Kmh");
        }
    }
}

class Car extends AbstractVehicle {
    public Car() {
        super("Volkswagen Golf, 2.5l, 2003", 280, 0);
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Aerox, 1.2l, 2012", 60, 0);
    }
}

class Bus extends AbstractVehicle {
    public Bus() {
        super("Volvo, 10.0l, 2014", 150, 0);
    }
}