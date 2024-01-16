package Moduuli1;
import java.util.Scanner;
public class Farenheit_to_celsius {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperature in celsius: %.1f", celsius);

    }
}

