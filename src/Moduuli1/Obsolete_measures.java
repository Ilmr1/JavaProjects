package Moduuli1;
import java.util.Scanner;

public class Obsolete_measures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for conversion
        final double GRAMS_PER_LUOTI = 13.28;
        final int LUOTI_PER_NAULA = 32;
        final int NAULA_PER_LEIVISKA = 20;

        System.out.print("Weight (g): ");
        double weightGrams = scanner.nextDouble();

        // Convert to medieval units
        double totalLuoti = weightGrams / GRAMS_PER_LUOTI;
        int leiviska = (int) (totalLuoti / (LUOTI_PER_NAULA * NAULA_PER_LEIVISKA));
        totalLuoti %= (LUOTI_PER_NAULA * NAULA_PER_LEIVISKA);
        int naula = (int) (totalLuoti / LUOTI_PER_NAULA);
        double luoti = totalLuoti % LUOTI_PER_NAULA;

        System.out.println(weightGrams + " grams is " + leiviska + " leiviskä, " + naula + " naula, and " + String.format("%.2f", luoti) + " luoti.");
    }
}
