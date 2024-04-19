package org.example.userregister;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReistrationOperations {

    Scanner sc = new Scanner(System.in);
    public void FirstName(){
        System.out.println("Enter a First Name : ");
        String first_name = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        Matcher matcher = pattern.matcher(first_name);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("First Name is Validate Successfully");
        else
            System.out.println("First Name is Incorrect");
    }

    public void LastName(){
        System.out.println("Enter a Last Name : ");
        String last_name = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        Matcher matcher = pattern.matcher(last_name);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Last Name is Validate Successfully");
        else
            System.out.println("Last Name is Incorrect");
    }

    public void Email(){
        System.out.println("Enter a Email : ");
        String email = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-z0-9.]+@[a-z]+.[a-z]{2,}.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Email is Valid Successfully");
        else
            System.out.println("Email is Incorrect");
        }

    public void MobileNumber(){
        System.out.println("Enter a Mobile Number");
        String mobile_number = sc.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]{2} \\d{10}$");
        Matcher matcher = pattern.matcher(mobile_number);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Mobile Number is Valid Successfully");
        else
            System.out.println("Mobile Number is Incorrect");
        }


    }

