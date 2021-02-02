package de.java.beginners;

import java.util.Scanner;

public class ChallangeTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How much is the total bill?");

        double totalBill = scanner.nextDouble();

        System.out.println("What is the number of People?");

        int numberOfPeople = scanner.nextInt();

        double eachPay = totalBill/numberOfPeople;

        System.out.format("You should pay €%.2f", eachPay);
    }

}
