package com.training.health_clinic.billing;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class RecordPayment {
    public static void execute() throws Exception {
        String sql="UPDATE bills SET payment_status='PAID' WHERE bill_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,1);
        ps.executeUpdate();
        System.out.println("Payment Recorded");
    }
}
