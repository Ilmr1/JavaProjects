public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        car.start();
        car.info();
        car.stop();
        car.increaseSpeed();

        motorcycle.start();
        motorcycle.info();
        motorcycle.stop();

        bus.start();
        bus.info();
        bus.stop();
    }
}