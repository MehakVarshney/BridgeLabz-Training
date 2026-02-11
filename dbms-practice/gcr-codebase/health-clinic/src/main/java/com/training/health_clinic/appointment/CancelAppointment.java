package com.training.health_clinic.appointment;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class CancelAppointment {
    public static void execute() throws Exception {
        String sql="UPDATE appointments SET status='CANCELLED' WHERE appointment_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ps.executeUpdate();
        System.out.println("Appointment Cancelled");
    }
}
