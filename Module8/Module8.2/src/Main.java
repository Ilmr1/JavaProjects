import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15, 3, 12};

        double mean = Arrays.stream(numbers).average().orElse(Double.NaN);

        System.out.println("Mean: " + mean);
    }
}