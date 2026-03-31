package com.junit.practice.junitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
	private DatabaseConnection db;
	
	@BeforeEach // this method runs before each test
	void setUp() {
		db = new DatabaseConnection();
		db.connect();
	}
	
	@AfterEach // this method runs after each test
	void tearDown() {
		db.disconnect();
	}
	
	@Test
	void testConnectionEstablished() {
		assertTrue(db.isConnected());
	}
	
	@Test
	void testConnectionClosed() {
		db.disconnect();
		assertFalse(db.isConnected());
	}
}
