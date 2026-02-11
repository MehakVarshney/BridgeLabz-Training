
package com.training.health_clinic.doctor;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class ViewDoctorBySpecialty {
    public static void execute() throws Exception {
        String sql="SELECT d.name FROM doctors d JOIN specialties s ON d.specialty_id=s.specialty_id WHERE s.name=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1,"Cardiology");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
    }
}
