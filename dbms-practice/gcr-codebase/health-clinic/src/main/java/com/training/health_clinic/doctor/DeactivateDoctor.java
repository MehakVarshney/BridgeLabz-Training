
package com.training.health_clinic.doctor;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class DeactivateDoctor {
    public static void execute() throws Exception {
        String sql="UPDATE doctors SET is_active=false WHERE doctor_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ps.executeUpdate();
        System.out.println("Doctor Deactivated");
    }
}
