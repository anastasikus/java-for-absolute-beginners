package de.java.beginners;

import java.util.Scanner;

public class exs1 {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        guests[0] = "Jacob";
        //guests[1] = "Edward";
        //guests[2] = "Rose";
        //guests[3] = "Molly";
        //guests[4] = "Christopher";

        do {
            System.out.println();
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }

            } else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                boolean guestFound = false;
                int i;
                for (i = 0; i < guests.length; i++) {
                    if (guests[i] != null && guests[i].equalsIgnoreCase(name)) {
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
            } else if (option == 3) {
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
        System.out.println("______________________\n- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Remove Guest");
        System.out.println("3 - Exit");
    }

    static int getOption() {
        System.out.print("Option: ");
        return scanner.nextInt();
    }
}









