package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.validateFirstName("Karthik");
        Assertions.assertTrue(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.validateLastName("Benki");
        Assertions.assertTrue(lastName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("karthikmc007@gmail.com");
        Assertions.assertTrue(email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 9538463948");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithOutSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("919538463948");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("9195");
        Assertions.assertFalse(phoneNumber);
    }
}
