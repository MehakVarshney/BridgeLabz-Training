package com.training.health_clinic.patient;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class RegisterPatient {
    public static void execute() throws Exception {
        String sql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"Test Patient");
        ps.setDate(2, Date.valueOf("1999-01-01"));
        ps.setString(3,"9999999959");
        ps.setString(4,"test@gmail.com");
        ps.setString(5,"Ahmedabad");
        ps.setString(6,"A+");
        ps.executeUpdate();
        System.out.println("Patient Registered");
    }
}
