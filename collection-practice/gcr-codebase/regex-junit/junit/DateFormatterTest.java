package com.junit.practice.junitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("01-01-2025", formatter.formatDate("2025-01-01"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(Exception.class,
                () -> formatter.formatDate("01-01-2025"));
    }
}

