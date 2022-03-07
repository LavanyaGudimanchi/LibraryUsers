package com.perscholas.libraryapp;

import java.util.Scanner;

public class KidsUsers implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        try {
            while (true) {
                System.out.println("Enter user age");
                Scanner inpputregister = new Scanner(System.in);
                age = inpputregister.nextInt();

                if (age < 12) {
                    System.out.println("You are successfully rigistred as Kids User");
                    break;
                }
                if (age >= 12)
                    System.out.println("Sorry age must be less than 12 to register as a Kid");

            }
        }
            catch(Exception e){
                System.out.println("Please enter valid data");
            }


    }

    @Override
    public void requestBook() {
        try {
            while (true) {
                System.out.println("Enter requested book");
                Scanner inputrequestbook = new Scanner((System.in));
                bookType = inputrequestbook.next();
                if (bookType.equals("Kids")) {
                    System.out.println("Book issued Successfully. Please return book in 10 days.");
                    break;
                } else System.out.println("Please enter Kids");
            }
        } catch (Exception e) {
            System.out.println("Please enter valid data:");

        }
    }


}

