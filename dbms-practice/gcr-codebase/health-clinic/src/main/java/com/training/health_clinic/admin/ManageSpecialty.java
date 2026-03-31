package com.training.health_clinic.admin;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class ManageSpecialty {
    public static void execute() throws Exception {
        String sql="INSERT INTO specialties(name) VALUES(?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"Cardiology");
        ps.executeUpdate();
        System.out.println("Specialty Added");
    }
}
