package com.training.health_clinic.appointment;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class RescheduleAppointment {
    public static void execute() throws Exception {
        String sql="UPDATE appointments SET appointment_date=?,appointment_time=? WHERE appointment_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setDate(1,Date.valueOf("2026-02-11"));
        ps.setTime(2,Time.valueOf("11:00:00"));
        ps.setInt(3,1);
        ps.executeUpdate();
        System.out.println("Appointment Rescheduled");
    }
}
