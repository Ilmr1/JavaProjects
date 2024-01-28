public class Task4CarDriver {

    public static void main(String[] args) {
        Task4Car myCar = new Task4Car(50, 200);

        if (myCar.setCruiseControlSpeed(150)) {
            System.out.println("Cruise control set to 150.");
        } else {
            System.out.println("Failed to set cruise control.");
        }

        boolean cruiseControlActivated = myCar.turnOnCruiseControl();
        if (cruiseControlActivated) {
            System.out.println("Cruise control activated.");
        } else {
            System.out.println("Unable to activate cruise control.");
        }

        System.out.println("Current target speed: " + myCar.getCruiseControlSpeed());

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control deactivated.");
    }
}
