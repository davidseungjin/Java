package com.david;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("000 000 0011");


    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter actiona: (6 to show available actions)");
            int action = scanner.nextInt();

            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    printContacts();
                    break;
            }
        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void startPhone(){
        System.out.println("Starting phone... ");
    }

    private static void printActions(){
        System.out.println("\n Available actions: \n press");
        System.out.println("0 ~ to shutdown\n" +
                            "1 - to print contact\n" +
                            "2 - to add a new contact\n" +
                            "3 - update existing an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}
