package com.userregistration;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Karthik");
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateLastName("Benki");
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateEmail("karthikmc007@gmail.com");
    }
}
