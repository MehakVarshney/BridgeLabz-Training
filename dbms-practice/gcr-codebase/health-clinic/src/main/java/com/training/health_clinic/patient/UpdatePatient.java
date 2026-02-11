
package com.training.health_clinic.patient;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class UpdatePatient {
    public static void execute() throws Exception {
        String sql="UPDATE patients SET address=? WHERE patient_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"Surat");
        ps.setInt(2,1);
        ps.executeUpdate();
        System.out.println("Patient Updated");
    }
}
