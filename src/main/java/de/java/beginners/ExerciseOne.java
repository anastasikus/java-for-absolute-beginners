package de.java.beginners;

import java.util.Scanner;

public class ExerciseOne {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        insertTestName();
        do {
            System.out.println();
            displayGuests();
            displayMenu();
            int option = getOption();
            if (option == 1) {
                addGuest();
            } else if (option == 2) {
                removeGuest();
            } else if (option == 3) {
                renameGuest();
            } else if (option == 4) {
                insertGuest();
            } else if (option == 5) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);
    }

    static void displayGuests() {
        System.out.println("_____________________\n- Guests -\n");
        boolean guestFound = false;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println(i + 1 + ". " + guests[i]);
                guestFound = true;
            }
        }
        if (!guestFound) {
            System.out.println("Guest list is empty.");
        }
    }

    static void displayMenu() {
        System.out.println("_________________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Insert Guest");
        System.out.println("5 - Exit");

    }

    static int getOption() {
        System.out.print("Option: ");
        return scanner.nextInt();
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                guests[i] = name;
                break;
            }
        }
    }

    static void renameGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        System.out.print("Name: ");
        scanner.nextLine();
        guests[num - 1] = scanner.nextLine();
    }

    static void removeGuest() {

        System.out.print("Number: ");
        int number = scanner.nextInt();
        boolean guestFound = false;
        int i;
        if (number > guests.length || number < 0 || guests[number - 1] == null) {
            System.out.println("Error. There is no guest with that number.");
        } else {
            for (i = 0; i < guests.length; i++) {
                if (guests[i] != null && guests[i] == guests[number - 1]) {
                    guests[i] = null;
                    guestFound = true;
                    break;
                }
            }
            if (guestFound) {
                for (int count = i + 1; count < guests.length; count++) {
                    guests[i] = guests[count];
                    i++;
                }
                guests[i] = null;
            }
        }
    }

    static void insertGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        for (int i = guests.length - 1; i > num - 1; i--) {
            guests[i] = guests[i - 1];
        }
        guests[num - 1] = name;

    }

    static void insertTestName() {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }
}









