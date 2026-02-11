package com.training.health_clinic.admin;

import java.sql.*;
import com.training.health_clinic.util.DBConnection;

public class DatabaseBackup {
	public static void execute() throws Exception {
		Connection con = DBConnection.getConnection();
		DatabaseMetaData meta = con.getMetaData();
		ResultSet rs = meta.getTables(null, null, "%", new String[] { "TABLE" });
		while (rs.next()) {
			System.out.println("Backup table: " + rs.getString("TABLE_NAME"));
		}
	}
}
