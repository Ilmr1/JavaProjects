public class VehicleDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.info();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.info();

        Bus bus = new Bus();
        bus.start();
        bus.stop();
        bus.info();
    }
}
