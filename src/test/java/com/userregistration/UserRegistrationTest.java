package com.userregistration;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Karthik");
    }
}
