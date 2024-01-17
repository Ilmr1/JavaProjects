import java.util.Scanner;
import java.lang.Math;

public class Quadratic_equation_solver {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            double rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are: " + rootOne + " and " + rootTwo);
        }else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is:" + root);
        }else {
            System.out.println("No real roots!");
        }
    }

}

