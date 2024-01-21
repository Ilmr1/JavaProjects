import java.util.Scanner;
import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int[] newArray = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (set.add(originalArray[i])) {
                newArray[count++] = originalArray[i];
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
