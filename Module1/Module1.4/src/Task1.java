import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        String[] firstNames = {"Olli", "Matti", "Maija", "Jukka", "Liisa", "Anna", "Antti", "Tuomas", "Timo", "Minna"};
        String[] lastNames = {"Virtanen", "Korhonen", "Mäkinen", "Nieminen", "Mäkelä", "Hämäläinen", "Laine", "Heikkinen", "Koskinen", "Järvinen"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Montako nimeä generoidaan?:");
        int numberOfNames = scanner.nextInt();

        Random random = new Random();

        for (int i = 0; i < numberOfNames; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];

            System.out.println(firstName + " " + lastName);
        }
        scanner.close();

    }
}
