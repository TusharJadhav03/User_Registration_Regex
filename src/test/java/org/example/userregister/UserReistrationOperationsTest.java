package org.example.userregister;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserReistrationOperationsTest {

    UserReistrationOperations userReistrationOperations = new UserReistrationOperations();

    @Test
    void firstNameValid() {
        try{
//            assertTrue(userReistrationOperations.FirstName("Tushar"));
            assertTrue(userReistrationOperations.FirstName.checkValidation("Tushar"));
        }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void lastNameValid() {
        try {
//            assertTrue(userReistrationOperations.LastName("Jadhav"));
            assertTrue(userReistrationOperations.LastName.checkValidation("Jadhav"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void emailValid() {
        try {
//            assertTrue(userReistrationOperations.Email("tushar.jadhav.work@gmail.com"));
            assertTrue(userReistrationOperations.Email.checkValidation("tushar.jadhav.work@gmail.com"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void mobileNumberValid() {
        try {
//            assertTrue(userReistrationOperations.MobileNumber("91 8108342983"));
            assertTrue(userReistrationOperations.MobileNumber.checkValidation("91 8108342983"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void passwordValid() {
        try {
//            assertTrue(userReistrationOperations.Password("Tushar@1999"));
            assertTrue(userReistrationOperations.Password.checkValidation("Tushar@1999"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }


    @Test
    void firstNameInvalid(){
        try {
//            assertFalse(userReistrationOperations.FirstName("tushar"));
              assertFalse(userReistrationOperations.FirstName.checkValidation("tushar"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void lastNameInvalid(){
        try {
//            assertFalse(userReistrationOperations.LastName("jadhav"));
            assertFalse(userReistrationOperations.LastName.checkValidation("jadhav"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void emailInvalid(){
        try {
//            assertFalse(userReistrationOperations.Email("tushar.jadhav.#.@gmail.com"));
            assertFalse(userReistrationOperations.Email.checkValidation("tushar.jadhav.#.@gmail.com"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void mobileNumberInvalid(){
        try {
//            assertFalse(userReistrationOperations.MobileNumber("8108342983"));
            assertFalse(userReistrationOperations.MobileNumber.checkValidation("8108342983"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }

    @Test
    void passwordInvalid(){
        try {
//            assertFalse(userReistrationOperations.Password("tushar@1999"));
            assertFalse(userReistrationOperations.Password.checkValidation("tushar@1999"));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }


    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    void emailMultipleEntry(String emailId){
        try {
//            assertTrue(userReistrationOperations.Email(emailId));
            assertTrue(userReistrationOperations.Email.checkValidation(emailId));
            }
        catch (InvalidUserException e){
            System.out.println("Exception occurs"+e);
        }
    }


}