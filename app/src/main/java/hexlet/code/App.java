package hexlet.code;

import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");

        int number = sc.nextInt();
        System.out.println("Your choice is: " + number);
        if(number == 1) {Cli.intro();}
        if(number == 0) {sc.close();}
        if(number == 2) {Even.playEvenGame();}
        if(number == 3) {Calculator.calc();}
        if(number == 4) {GCD.greatCD();}



        sc.close();

    }
}
