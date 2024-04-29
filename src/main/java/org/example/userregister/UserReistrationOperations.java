package org.example.userregister;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReistrationOperations  extends UserRegistrationInterface{

//    Scanner sc = new Scanner(System.in);

    Validation FirstName = (first_name) -> {
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        Matcher matcher = pattern.matcher(first_name);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("First Name is Validate Successfully");
        else {
            System.out.println("First Name is Incorrect");
            throw new InvalidUserException("First letter should be capital");
        }
        return checkValid;
    };

    Validation LastName = (last_name)-> {
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        Matcher matcher = pattern.matcher(last_name);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Last Name is Validate Successfully");
        else {
            System.out.println("Last Name is Incorrect");
            throw new InvalidUserException("First letter should be capital");
        }
        return checkValid;
    };

    Validation Email = (email)-> {
        Pattern pattern = Pattern.compile("^[a-z0-9+.-]+@[a-z0-9]*.[a-z.]{2,}[a-z]{2}$");
        Matcher matcher = pattern.matcher(email);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Email is Valid Successfully");
        else {
            System.out.println("Email is Incorrect");
            throw new InvalidUserException("Email should be enter correctly");
        }
        return checkValid;
    };

    Validation MobileNumber = (mobile_number)-> {
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobile_number);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Mobile Number is Valid Successfully");
        else {
            System.out.println("Mobile Number is Incorrect");
            throw new InvalidUserException("Mobile Number should be enter correctly");
        }
        return checkValid;
    };

    Validation Password = (password)->{
        Pattern pattern = Pattern.compile("^(?=.*[A-Z]{1,})(?=.*[0-9]{1,}).*[a-z](?=.*[!@#$%&]{1})(.{7,})$");
        Matcher matcher = pattern.matcher(password);

        boolean checkValid = matcher.matches();

        if(checkValid)
            System.out.println("Password is Valid Successfully");
        else {
            System.out.println("Password is Invalid ");
            throw new InvalidUserException("Password should be enter correctly");
        }
        return checkValid;
    };

}

