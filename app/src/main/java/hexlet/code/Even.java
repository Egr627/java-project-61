package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        playEvenGame();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void playEvenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersNeeded = 3;
        int correctAnswers = 0;

        while (correctAnswers < correctAnswersNeeded) {
            int number = random.nextInt(100) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            String correctAnswer = isEven(number) ? "yes" : "no";
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return; // End the game immediately
            }

            System.out.println("Correct!");
            correctAnswers++;
        }

        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}

