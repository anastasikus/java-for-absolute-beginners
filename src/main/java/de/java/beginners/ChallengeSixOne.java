package main.java;

import java.util.Scanner;

public class ChallengeSixOne {
    public static void main(String[] args) {
        System.out.println("Welcom to quitz!");
        System.out.println("Answers questions with true oder false");


        String[] questions = {"Q1",
                              "Q2",
                              "Q3",
                              "Q4",
                              "Q5"};
        boolean[] answers = {true,
                             true,
                             false,
                             true,
                             false};
        Scanner scanner = new Scanner(System.in);
        int rightAnswers = 0;

        for (int q = 0; q < questions.length; q++) {
            System.out.print(questions[q] + " :");
            boolean userAnswer = scanner.nextBoolean();
            if (userAnswer == answers[q]) {
                rightAnswers++;
            }
        }
        System.out.println("User has " + rightAnswers + " guess.");
    }

}
