package main.java;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ChallengeFour {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

        System.out.println("Beginn your game!");
        int myNumber;
        int randomNumber;
        System.out.print("Enter a number from 1 to 100: ");
        myNumber = scanner.nextInt();

        do {
            randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

            System.out.println(randomNumber);
            int num = randomNumber;

                    if (myNumber == num) {
                        System.out.println("Correct");
                    } else if (myNumber > num) {
                        System.out.println("HIGHER");


                    } else if (myNumber < num) {
                        System.out.println("LOWER");
                    }
                } while (randomNumber != myNumber);





       /* int count= 1;

        for (int i = 1; i < 41; i++) {
            System.out.println(i);

            if (count == 3) {
                System.out.println("Quack");
                count = 0;
            }
            count++;*/

        }
       /* Scanner scanner = new Scanner(System.in);

        String password;


         do {
            System.out.print("Enter your password: ");
            password = scanner.next();



        } while (!password.equals("shark50"));

        System.out.println("ACCESS APPROVED");*/



/*for (int i = 0; i < 11; i++) {
    System.out.print(i + ", ");
}
System.out.print("\b\b.");*/
    }









