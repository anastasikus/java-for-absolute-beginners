package de.java.beginners;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ChallengeThree {
    public static void main(String[] args) {


      /*  int x = 7;
        int y = 7;

        // x > y
        // x < y
        // x == y

        if (x > y) {
            System.out.println("x > y");
        } else if (x < y) {
            System.out.println("x < y");
        } else {
            System.out.println("x = y. There is no difference.");
        }

        System.out.println("The differnce is " + (x-y)); */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom to the game!");
        System.out.println("Let's guess the number from 1 till 5. You have two attempts.");
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);


        if (number == randomNumber) {
            System.out.println("Correct! Aren’t you lucky.");
        } else {
            System.out.print("One more time. Enter your number: ");
            number = scanner.nextInt();
            randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

            if (number == randomNumber) {
                System.out.println("Correct! Aren’t you lucky. The second attemp was correct");
            } else {
                System.out.println("Hard luck! Maybe next time.");
            }
        }
    }
}

