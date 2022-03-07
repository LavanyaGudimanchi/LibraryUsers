package com.perscholas.libraryapp;

public class Main {

    public static void main(String[] args) {

	// write your code here
        KidsUsers ku= new KidsUsers();
        ku.registerAccount();
        ku.requestBook();

        AdultUsers au=new AdultUsers();
        au.registerAccount();
        au.requestBook();
    }

}
