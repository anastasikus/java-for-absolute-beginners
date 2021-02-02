package de.java.beginners;

import java.util.Random;

public class ChallengeFiveOne {
    public static void main(String[] args) {
        //1. create an array of type int of length 5
        //2. put 75 at index 0
        //3. put 100 at last index of array
        //4 create another array of type int length 10 and fill it with random values (use java.util.Random)
        //5. search the minimum of the array

        int[] b = new int[5];
        b[0] = 75;
        System.out.println(b[0]);
        b[b.length - 1] = 100;
        System.out.println(b[4]);

        int[] s = new int[10];
        Random random = new Random();

        for (int i = 0; i < s.length; i++) {
            s[i] = random.nextInt(100);
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

        int min = s[0];

        for (int i = 0; i < s.length; i++) {
            if (s[i] < min) {
                min = s[i];
            }
        }


        System.out.println("Min: " + min);


        // 0 -> 0 < 10
        // 1 -> 1 < 10
        // 8 -> 8 < 10
        // 9 -> 9 < 10


    }
}
