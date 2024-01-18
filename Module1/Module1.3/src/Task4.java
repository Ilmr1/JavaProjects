import java.util.Scanner;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int score = 0;

            for (int i = 0; i < 10 ;i++) {
                int a = 1 + random.nextInt(10);
                int b = 1 + random.nextInt(10);
                int correctAnswer = a * b;

                System.out.println("How much is " + a + " x " + b + "?");
                int answer = scanner.nextInt();

                if (answer == correctAnswer) {
                    System.out.print("Correct! ");
                    score++;

                } else {
                    System.out.print("Incorrect! Correct answer is " + correctAnswer + ". ");

                }
            }
            if (score == 10) {
            System.out.println("Congrats! You got all answers correct!");
            break;
        } else {
            System.out.println("Your score is " + score + "/10");
        }
    }
    scanner.close();
    }
}
