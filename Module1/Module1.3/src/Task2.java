import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimalNumber = convertion(binaryString);
        System.out.println("Decimal number is: " + decimalNumber);
    }

    private static int convertion(String binaryString) {
        int decimalNumber = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            int bit = binaryString.charAt(i) - '0';

            if (bit < 0 || bit > 1) {
                throw new IllegalArgumentException("Invalid binary number");
            }

            decimalNumber = decimalNumber * 2 + bit;
        }
        return decimalNumber;
    }
}
