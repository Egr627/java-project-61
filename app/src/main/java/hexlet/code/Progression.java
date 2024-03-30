package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {

    }

    public static void vars(){
        int progrStart =  random.nextInt(100) + 1;
        int progrLength = random.nextInt(10-5+1) + 5;//min =5, max = 10;
        int step = random.nextInt(7-2+1) + 2;
        int[] progrBody = new int[progrLength];
        progrBody[0] = progrStart;
        //step
        //replace with ..
        //make .. appear randomly
        //connect .. with the missing number

    }


    public static void playEvenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?.");

        int correctAnswersNeeded = 3;
        int correctAnswers = 0;

        while (correctAnswers < correctAnswersNeeded) {

        }
    }
}



