package org.example.userregister;

public class UserRegistrationInterface {
    public interface Validation{
         boolean checkValidation(String str) throws InvalidUserException;
    }
}
