
package com.training.health_clinic.visit;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class RecordVisit {
    public static void execute() throws Exception {
        Connection con = DBConnection.getConnection();
        con.setAutoCommit(false);
        try {
            String vsql = "INSERT INTO visits(appointment_id,diagnosis,notes,visit_date) VALUES(?,?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(vsql);
            ps1.setInt(1,1);
            ps1.setString(2,"Viral Fever");
            ps1.setString(3,"Rest advised");
            ps1.setDate(4,new Date(System.currentTimeMillis()));
            ps1.executeUpdate();

            String asql = "UPDATE appointments SET status='COMPLETED' WHERE appointment_id=?";
            PreparedStatement ps2 = con.prepareStatement(asql);
            ps2.setInt(1,1);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Visit Recorded Successfully");
        } catch(Exception e) {
            con.rollback();
            throw e;
        }
    }
}
