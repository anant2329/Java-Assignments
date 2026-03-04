package com.anant.social_media;

import java.util.Scanner;

public class FaceBook extends Login {

    public FaceBook(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public boolean createLogin() {
        if (isValid()){
            System.out.println("Hello "+ getName() + " FaceBook successfully created your profile");
        }
        else {
            System.out.println("Invalid username or password\n \t Try again...");
            return false;
        }
        return true;
    }
    public static void friendRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your friend name: ");
        String friendName = sc.nextLine();
        System.out.println("FaceBook friend "+friendName+" requested. Will notify you once accepted");
    }
}
