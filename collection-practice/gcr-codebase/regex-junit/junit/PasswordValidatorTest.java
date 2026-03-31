package com.junit.practice.junitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong1Pass"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(validator.isValid("weak"));
    }
}

