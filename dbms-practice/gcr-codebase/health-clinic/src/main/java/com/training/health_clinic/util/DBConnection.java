package com.training.health_clinic.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/health_clinic";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Mehak@123";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
