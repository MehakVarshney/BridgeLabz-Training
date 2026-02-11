
package  com.training.health_clinic.doctor;
import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class UpdateDoctorSpecialty {
    public static void execute() throws Exception {
        String sql="UPDATE doctors SET specialty_id=? WHERE doctor_id=?";
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,2);
        ps.setInt(2,1);
        ps.executeUpdate();
        System.out.println("Specialty Updated");
    }
}
