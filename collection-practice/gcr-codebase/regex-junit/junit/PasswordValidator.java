package com.junit.practice.junitTesting;

public class PasswordValidator {

    public boolean isValid(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*\\d.*");
    }
}
