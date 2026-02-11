
package com.training.health_clinic.doctor;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class AddDoctor {
    public static void execute() throws Exception {
        String sql="INSERT INTO doctors(name,contact,consultation_fee,specialty_id) VALUES(?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"Dr Smith");
        ps.setString(2,"8888888888");
        ps.setDouble(3,500);
        ps.setInt(4,1);
        ps.executeUpdate();
        System.out.println("Doctor Added");
    }
}
