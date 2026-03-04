package com.anant.social_media;

import java.util.Scanner;

public class Google extends Login {

    public Google(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public boolean createLogin() {
        if(isValid()){
            System.out.println("Hi "+ getName()+", Google welcomes you.");
        }
        else {
            System.out.println("Invalid username or password \n \t Try again...");
            return false;
        }
        return true;
    }
    public static void sendEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mail address you want to send: ");
        String mail = sc.nextLine();
        System.out.print("Enter the message you want to send: ");
        String prompt = sc.nextLine();
        System.out.println("Your email to " + mail+ " sent successfully." );
    }
}
