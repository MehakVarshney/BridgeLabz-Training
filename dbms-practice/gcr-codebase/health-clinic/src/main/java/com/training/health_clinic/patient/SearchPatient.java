package com.training.health_clinic.patient;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class SearchPatient {
    public static void execute() throws Exception {
        String sql="SELECT * FROM patients WHERE name LIKE ?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"%Test%");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("patient_id")+" "+rs.getString("name"));
        }
    }
}
