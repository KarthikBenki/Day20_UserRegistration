package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,fname);
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,lName);
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matches(EMAIL_PATTERN,email);
    }
}
