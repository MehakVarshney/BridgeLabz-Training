package com.training.health_clinic.appointment;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class BookAppointment {
    public static void execute() throws Exception {
        String sql="INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ps.setInt(2,1);
        ps.setDate(3,Date.valueOf("2026-02-10"));
        ps.setTime(4,Time.valueOf("10:00:00"));
        ps.setString(5,"SCHEDULED");
        ps.executeUpdate();
        System.out.println("Appointment Booked");
    }
}
