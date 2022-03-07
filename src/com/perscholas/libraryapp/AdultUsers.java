package com.perscholas.libraryapp;

import java.util.Scanner;

public class AdultUsers implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        while (true) {
            System.out.println("Enter user age:");
            Scanner inputuser = new Scanner(System.in);
            age = inputuser.nextInt();
            try {
                if (age > 12) {
                    System.out.println("You are successfully rigistred as a Adult");
                    break;
                }
                if (age < 12)
                    System.out.println("Sorry you must be atleast 12 above to reigister as a Adult");

            } catch (Exception e) {
                System.out.println("Please enter only Numbers");
            }

        }
    }

    @Override
    public void requestBook() {
        try {
            while (true) {

                System.out.println("Enter book type:");
                Scanner inputbooktype = new Scanner((System.in));
                bookType = inputbooktype.next();

                if (bookType.equals("fiction")) {
                    System.out.println("Book issued successfully.Please return book in 7 days");
                    break;
                } else
                    System.out.println("Please enter fiction:");
            }
            }
        catch(Exception e){
                System.out.println("Please enter valid data");
            }


    }



}
