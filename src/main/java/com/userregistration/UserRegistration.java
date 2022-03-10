package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,fname);
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matches(NAME_PATTERN,lName);
    }
}
