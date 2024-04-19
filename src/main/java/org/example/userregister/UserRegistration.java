package org.example.userregister;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {

        UserReistrationOperations uro = new UserReistrationOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to User Registration ***");
        int num =1;

        while(num>0){
            System.out.println("1.First Name Validation 0.Exit");
            System.out.println("Enter your choice :");
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Welcome to First Name Validation");
                    uro.FirstName();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}