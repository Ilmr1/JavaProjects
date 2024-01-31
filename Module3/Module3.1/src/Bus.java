public class Bus extends Car {
    private int passengerCount;
    private int maxCapacity;

    public Bus(String typeName, int maxCapacity) {
        super(typeName);
        this.maxCapacity = maxCapacity;
        this.passengerCount = 0;
    }

    public boolean passengerEnter(int numberOfPassengers) {
        if (numberOfPassengers <= 0) {
            System.out.println("Invalid number of passengers.");
            return false;
        }

        if (passengerCount + numberOfPassengers > maxCapacity) {
            System.out.println("Not enough space for " + numberOfPassengers + " passengers. Maximum capacity is " + maxCapacity + ".");
            return false;
        }

        passengerCount += numberOfPassengers;
        System.out.println(numberOfPassengers + " passengers entered the bus. Total passengers: " + passengerCount);
        return true;
    }

    public boolean passengerExit(int numberOfPassengers) {
        if (numberOfPassengers <= 0) {
            System.out.println("Invalid number of passengers.");
            return false;
        }

        if (numberOfPassengers > passengerCount) {
            System.out.println("There are only " + passengerCount + " passengers in the bus.");
            return false;
        }

        passengerCount -= numberOfPassengers;
        System.out.println(numberOfPassengers + " passengers exited the bus. Total passengers: " + passengerCount);
        return true;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    // Other methods of Car class can be used as is or overridden if needed
}
