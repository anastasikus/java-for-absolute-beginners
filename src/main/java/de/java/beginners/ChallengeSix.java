package main.java;

import java.util.Scanner;

public class ChallengeSix {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Statistic tool. Please give a number of students : ");
        int num = scanner.nextInt();
        double [] score = new double[num];
        System.out.print("What is the max score: ");
        double max = scanner.nextDouble();
        System.out.println("Give the note for every students.");

        double sum = 0;
        double [] persent = new double[num];

        for(int i = 0; i < num; i++) {
            System.out.print("Student " + (i+1) + ": " );
            score [i] = scanner.nextDouble();
            sum = sum + score[i];
            persent[i] = score[i] *100 / max;
            System.out.println("Percentage of the exam: " + persent[i] + "%");

        }

        double aver = sum / num;
        System.out.println();
        System.out.format("Averege note: %.2f %", aver);



    }


}
