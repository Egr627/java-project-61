package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        greatCD();
    }

    public static int gcd(int number, int number2) {
        while (number2 != 0) {
            int idk = number2;
            number2 = number % number2;
            number = idk;
        }
        return number;

    }

    public static void greatCD() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswersNeeded = 3;
        int correctAnswers = 0;

        while (correctAnswers < correctAnswersNeeded) {
            int number = random.nextInt(100) + 1;
            int number2 = random.nextInt(50) + 1;
            int calcGCD = gcd(number, number2);
            System.out.println("Question: " + number + " " + number2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer != calcGCD) {
                System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was " + "'" + calcGCD + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
            correctAnswers++;
        }


        System.out.println("Congratulations, " + name + "!");
        scanner.close();

    }
}


