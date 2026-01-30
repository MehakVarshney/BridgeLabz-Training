package com.junit.practice.junitTesting;

public class DatabaseConnection {
	private boolean connected;
	
	public void connect() {
		// Simulate database connection
		connected = true;
	}
	
	public void disconnect() {
		// Simulate closing database connection
		connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
}
