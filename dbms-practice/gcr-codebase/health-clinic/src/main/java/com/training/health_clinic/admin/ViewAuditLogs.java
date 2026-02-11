package com.training.health_clinic.admin;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class ViewAuditLogs {
    public static void execute() throws Exception {
        String sql="SELECT * FROM audit_log ORDER BY action_time DESC";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("table_name")+" "+rs.getString("operation"));
        }
    }
}
