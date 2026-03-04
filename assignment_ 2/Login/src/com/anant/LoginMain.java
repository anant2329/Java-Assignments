package com.anant;

import com.anant.social_media.FaceBook;
import com.anant.social_media.Google;
import com.anant.social_media.Login;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter your Username : ");
        String username = sc.nextLine();

        System.out.print("Enter your Password : ");
        String password = sc.nextLine();

        System.out.print("Choose where you want to login (facebook/ google):  ");
        String choise = sc.nextLine();
        Login login;
        if (choise.equalsIgnoreCase("facebook")) {
            login = new FaceBook(name, username, password);
            if(login.createLogin()) {
                FaceBook.friendRequest();
            }
        }
        else if (choise.equalsIgnoreCase("google")) {
            login = new Google(name, username, password);
            if (login.createLogin()) {
                Google.sendEmail();
            }
        }
        else {
            System.out.println("Invalid choice\n \t Try again...");
        }
    }
}
