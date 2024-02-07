public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();
        ElectricCar electricCar = new ElectricCar();
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();

        electricCar.start();
        electricCar.charge();
        electricCar.info();
        electricCar.calculateFuelEfficiency();

        motorcycle.start();
        motorcycle.info();
        motorcycle.stop();
        motorcycle.calculateFuelEfficiency();

        bus.start();
        bus.info();
        bus.stop();
    }
}