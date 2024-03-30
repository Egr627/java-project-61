package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operators = {"+", "-", "*"};


        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswersNeeded = 3;
        int correctAnswers = 0;



        while (correctAnswers < correctAnswersNeeded) {
            int number = random.nextInt(20) + 1;
            int number2 = random.nextInt(15) + 1;
            int operatorIndex = random.nextInt(operators.length);

            int correctAnswer = 0;

            String randOperator = operators[operatorIndex];
            System.out.println("Question: " + number + randOperator + number2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            switch (randOperator) {
                case "+":
                    correctAnswer = number + number2;
                    break;
                case "-":
                    correctAnswer = number - number2;
                    break;
                case "*":
                    correctAnswer = number * number2;
                    break;
            }

              if (userAnswer == correctAnswer) {
                System.out.println("Correct");
            correctAnswers++;} else{System.out.println("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");

            break;}

            }

            if(correctAnswersNeeded == correctAnswers){System.out.println("Congratulations, " + name + "!");}

        }
    }


