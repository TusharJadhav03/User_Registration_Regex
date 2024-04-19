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
}
