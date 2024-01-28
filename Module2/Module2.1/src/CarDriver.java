public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 50.0f, 180.0f);

        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h, tank capacity: " + myCar.getTankCapacity() + " liters, top speed: " + myCar.getTopSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h, tank capacity: " + myCar.getTankCapacity() + " liters, top speed: " + myCar.getTopSpeed() + " km/h");
        }
    }
}
