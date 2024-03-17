import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        // Filter out even numbers
        numbers.removeIf(n -> n % 2 == 0);

        // Double the value of odd numbers
        numbers.replaceAll(n -> n * 2);

        // Calculate the sum of all numbers
        int sum = numbers.stream().reduce(0, Integer::sum);

        // Print the modified list and the sum
        System.out.println("Modified list: " + numbers);
        System.out.println("Sum: " + sum);
    }
}