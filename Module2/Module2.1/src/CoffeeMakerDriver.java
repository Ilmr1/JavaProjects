import java.util.Scanner;

public class CoffeeMakerDriver {

    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Turning on the coffee maker...");
        myCoffeeMaker.powerSwitch();

        while (true) {
            try {
                System.out.println("Select coffee type (1 for Normal, 2 for Espresso):");
                int coffeeTypeInput = scanner.nextInt();
                CoffeeMaker.CoffeeType coffeeType = (coffeeTypeInput == 2) ? CoffeeMaker.CoffeeType.ESPRESSO : CoffeeMaker.CoffeeType.NORMAL;
                myCoffeeMaker.setCoffeeType(coffeeType);

                System.out.println("Enter coffee amount in ml (10 to 80):");
                int coffeeAmount = scanner.nextInt();
                if (coffeeAmount < 10 || coffeeAmount > 80) {
                    System.out.println("Invalid amount. Please select between 10 and 80 ml.");
                    continue;
                }
                myCoffeeMaker.setCoffeeAmount(coffeeAmount);

                System.out.println("Brewing your coffee...");
                myCoffeeMaker.brewCoffee();

                System.out.println("Do you want to brew another coffee? (yes/no):");
                String continueBrewing = scanner.next();
                if (!continueBrewing.equalsIgnoreCase("yes")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
        }

        scanner.close();

        System.out.println("Turning off the coffee maker...");
        myCoffeeMaker.powerSwitch();
    }
}
