package com.junit.practice.junitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileProcessorTest {

    private final FileProcessor processor = new FileProcessor();
    private final String fileName = "test.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(fileName, "Hello");
        assertEquals("Hello", processor.readFromFile(fileName));
        assertTrue(Files.exists(Path.of(fileName)));
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class,
                () -> processor.readFromFile("missing.txt"));
    }
}
