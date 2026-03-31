
package com.training.health_clinic.visit;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class AddPrescription {
    public static void execute() throws Exception {
        String sql="INSERT INTO prescriptions(visit_id,medicine,dosage,duration) VALUES(?,?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ps.setString(2,"Paracetamol");
        ps.setString(3,"650mg");
        ps.setString(4,"5 days");
        ps.executeUpdate();
        System.out.println("Prescription Added");
    }
}
