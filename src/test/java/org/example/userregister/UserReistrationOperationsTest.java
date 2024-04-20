package org.example.userregister;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserReistrationOperationsTest {

    UserReistrationOperations userReistrationOperations = new UserReistrationOperations();

    @Test
    void firstNameValid() {
        boolean validTest = userReistrationOperations.FirstName("Tushar");
        assertTrue(validTest);

    }

    @Test
    void lastNameValid() {
        boolean validTest = userReistrationOperations.LastName("Jadhav");
        assertTrue(validTest);
    }

    @Test
    void emailValid() {
        boolean validTest = userReistrationOperations.Email("tushar.jadhav.work@gmail.com");
        assertTrue(validTest);
    }

    @Test
    void mobileNumberValid() {
        boolean validTest = userReistrationOperations.MobileNumber("91 8108342983");
        assertTrue(validTest);
    }

    @Test
    void passwordValid() {
        boolean validTest = userReistrationOperations.Password("Tushar@1999");
        assertTrue(validTest);
    }


    @Test
    void firstNameInvalid(){
        boolean invalidTest = userReistrationOperations.FirstName("tushar");
        assertFalse(invalidTest);
    }

    @Test
    void lastNameInvalid(){
        boolean invalidTest = userReistrationOperations.LastName("jadhav");
        assertFalse(invalidTest);
    }

    @Test
    void emailInvalid(){
        boolean invalidTest = userReistrationOperations.Email("tushar.jadhav.#.@gmail.com");
        assertFalse(invalidTest);
    }

    @Test
    void mobileNumberInvalid(){
        boolean invalidTest = userReistrationOperations.MobileNumber("8108342983");
        assertFalse(invalidTest);
    }

    @Test
    void passwordInvalid(){
        boolean invalidTest = userReistrationOperations.Password("tushar@1999");
        assertFalse(invalidTest);
    }
}