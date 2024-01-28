public class CoffeeMaker {
    public enum CoffeeType {
        NORMAL, ESPRESSO
    }

    private CoffeeType coffeeType;
    private int coffeeAmount;
    private boolean isOn;

    // Constructor
    public CoffeeMaker() {
        this.coffeeType = CoffeeType.NORMAL;
        this.coffeeAmount = 10;
        this.isOn = false;


    }
    public void powerSwitch() {
        isOn = !isOn;
        if (isOn) {
            System.out.println("Coffee Maker is ON");
        } else {
            System.out.println("Coffee Maker is OFF");
        }
    }
    public void setCoffeeType(CoffeeType type) {
        if (isOn) {
            this.coffeeType = type;
            System.out.println("Coffee type set to: " + type);
        } else {
            System.out.println("Please turn on the coffee maker first.");
        }
    }

    public void setCoffeeAmount(int amount) {
        if (isOn) {
            if (amount >= 10 && amount <= 80) {
                this.coffeeAmount = amount;
                System.out.println("Coffee amount set to: " + amount + " ml");
            } else {
                System.out.println("Invalid amount. Please select between 10 and 80 ml.");
            }
        } else {
            System.out.println("Please turn on the coffee maker first.");
        }
    }

    public void brewCoffee() {
        if (isOn) {
            System.out.println("Brewing " + coffeeAmount + " ml of " + coffeeType + " coffee.");
        } else {
            System.out.println("Please turn on the coffee maker first.");
        }
    }
}
