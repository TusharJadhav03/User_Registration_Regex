package org.example.userregister;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {

        UserReistrationOperations uro = new UserReistrationOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to User Registration ***");
        int num =1;

        while(num>0){
            System.out.println("\n 1.First Name Validation \n 2.Last Name Validation \n 0.Exit");
            System.out.println("Enter your choice :");
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Welcome to First Name Validation");
                    uro.FirstName();
                    break;

                case 2:
                    System.out.println("Welcome to Last Name Validation");
                    uro.LastName();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}