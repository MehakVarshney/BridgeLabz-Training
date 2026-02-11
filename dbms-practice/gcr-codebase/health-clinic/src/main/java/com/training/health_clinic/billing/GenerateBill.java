package com.training.health_clinic.billing;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class GenerateBill {
    public static void execute() throws Exception {
        String sql="INSERT INTO bills(visit_id,total_amount,payment_status) VALUES(?,?,?)";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ps.setDouble(2,500);
        ps.setString(3,"UNPAID");
        ps.executeUpdate();
        System.out.println("Bill Generated");
    }
}
