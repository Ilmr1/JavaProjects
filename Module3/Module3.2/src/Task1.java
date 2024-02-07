interface vehicle {
    void start();
    void stop();
    void info();
}

class Car implements vehicle {
    public void start() {
        System.out.println("Car has started");
    }
    public void stop() {
            System.out.println("Car has stopped");
    }
    public void info() {
        System.out.println("Info:");
        System.out.println("Type: Car");
        System.out.println("Fuel: Petrol");
        System.out.println("Color: Red");
        System.out.println();
    }
}

class Motorcycle implements vehicle {
    public void start() {
        System.out.println("Motorcycle has started");
    }
    public void stop() {
        System.out.println("Motorcycle has stopped");
    }
    public void info() {
        System.out.println("Info:");
        System.out.println("Type: Motorcycle");
        System.out.println("Fuel: Gasoline");
        System.out.println("Color: Black");
        System.out.println();
    }
}

class Bus implements vehicle {
    public void start() {
        System.out.println("Bus has started");
    }
    public void stop() {
        System.out.println("Bus has stopped");
    }
    public void info() {
        System.out.println("Info:");
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Capacity: 40 passengers");
    }
}