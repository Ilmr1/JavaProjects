import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FibonacciGenerator {
    private static final Logger LOGGER = Logger.getLogger(FibonacciGenerator.class.getName());
    public static void main(String[] args) {
        String filename = "fibonacci.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;

            for (int i = 1; i <= 100; i++) {
                BigInteger temp = a;
                a = b;
                b = temp.add(b);

                bw.write(a.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "exception occurred", e);
        }
    }
}