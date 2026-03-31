
package com.training.health_clinic.patient;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class PatientVisitHistory {
    public static void execute() throws Exception {
        String sql = "SELECT v.visit_date,v.diagnosis FROM visits v JOIN appointments a ON v.appointment_id=a.appointment_id WHERE a.patient_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getDate(1)+" "+rs.getString(2));
        }
    }
}
