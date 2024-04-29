package org.example.userregister;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {

        UserReistrationOperations uro = new UserReistrationOperations();

        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to User Registration ***");

        while(true) {
            System.out.println("\n 1.First Name Validation \n 2.Last Name Validation \n 3.Email Validation \n 4.Mobile Number Validation \n 5.Password Validation \n 0.Exit");
            System.out.println("Enter your choice :");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Welcome to First Name Validation");
                    System.out.println("Enter a First Name : ");
                    String first_name = sc.nextLine();
//                    uro.FirstName(first_name);
                    uro.FirstName.checkValidation(first_name);
                    break;

                case "2":
                    System.out.println("Welcome to Last Name Validation");
                    System.out.println("Enter a Last Name : ");
                    String last_name = sc.nextLine();
//                    uro.LastName(last_name);
                    uro.LastName.checkValidation(last_name);
                    break;

                case "3":
                    System.out.println("Welcome to Email Validation");
                    System.out.println("Enter a Email : ");
                    String email = sc.nextLine();
//                        uro.Email(email);
                    uro.Email.checkValidation(email);

                    break;

                case "4":
                    System.out.println("Welcome to Mobile Number Validation");
                    System.out.println("Enter a Mobile Number : ");
                    String mobile_number = sc.nextLine();
                    uro.MobileNumber.checkValidation(mobile_number);
                    break;

                case "5":
                    System.out.println("Welcome to Password Validation");
                    System.out.println("Enter a Password : ");
                    String password = sc.nextLine();
//                    uro.Password(password);
                    uro.Password.checkValidation(password);
                    break;

                case "0":
                    System.exit(0);
                    break;
                }
            }

        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}