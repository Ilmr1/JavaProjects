interface Vehicle {
    void start();
    void stop();
    void info();

    void increaseSpeed();
    void lowerSpeed();
}

interface ElectricVehicle extends Vehicle {
    void charge();
    boolean isElectric();
}

abstract class AbstractVehicle implements Vehicle {
    String info;
    int maxSpeed;
    int currentSpeed = 0;

    public AbstractVehicle(String info, int maxSpeed) {
        this.info = info;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Vehicle has strated...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle has stopped...");
    }

    @Override
    public void info() {
        System.out.println(info + " Huippunopeus: " + maxSpeed);
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Vehicle is increasing speed.");
        while (currentSpeed < maxSpeed) {
            currentSpeed += 30;
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

abstract class AbstractElectricVehicle extends AbstractVehicle implements ElectricVehicle {
    public AbstractElectricVehicle(String info, int maxSpeed) {
        super(info, maxSpeed);
    }


    @Override
    public void charge() {
        System.out.println("Electric vehicle is charging...");
    }

    @Override
    public boolean isElectric() {
        return true;
    }
}
class Car extends AbstractVehicle {
    public Car() {
        super("Volkswagen Golf, 2.5l, 2003", 280);
    }
}

class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Aerox, 1.2l, 2012", 60);
    }
}

class Bus extends AbstractVehicle {
    public Bus() {
        super("Volvo, 10.0l, 2014", 150);
    }
}

class ElectricCar extends AbstractElectricVehicle {
    public ElectricCar() {
        super("Tesla, 80kwh, 2024", 200);
    }
}

class ElectricMotorcycle extends AbstractElectricVehicle {
    public ElectricMotorcycle() {
        super("TeslaMopo, 20kwh, 2024", 125);
    }
}