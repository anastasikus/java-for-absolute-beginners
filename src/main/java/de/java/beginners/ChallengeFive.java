package main.java;

import java.util.Scanner;

public class ChallengeFive {
    public static void main(String[] args) {
        String [] test = new String[5];
        test[3] = "3tes Element";
        System.out.println(test);



        System.out.println("Enter your five favourite food:");
        Scanner scanner = new Scanner(System.in);

        String[] favFood = new String[3];

        for (int i = 0; i < favFood.length; i++) {
            System.out.print("Food nr. " + (i + 1) + " ");
            String input = scanner.nextLine();
            favFood[i] = input;
        }
        System.out.println("Sorry, No more memory available.");

        System.out.print("Your favourite foods are: ");
        for (String food : favFood) {
            System.out.print(food + " ");
        }

       /* double [] arr = new double [5];
        arr[0] = 5.25;
        arr[1] = 10.25;
        arr[2] = 15.25;
        arr[3] = 20.25;
        arr[4] = 25.25;
        double sum = 0;


        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];


        }

        System.out.println(sum);

        double aver = sum / arr.length;

        System.out.println(aver);*/
    }

}        /*int[] b = new int[20];

        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }


        int min = b[0];
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("Min element: " + min + " Max element: " + max);

    }

}*/
