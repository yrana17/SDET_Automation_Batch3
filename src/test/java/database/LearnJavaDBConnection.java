package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LearnJavaDBConnection {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Connection conn;
		Statement stmt;
		ResultSet rs;

		try {
			String url = "jdbc:ucanaccess://" + "src/main/resources/ST_Database.accdb";
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

			conn = DriverManager.getConnection(url, "", "");

			if (!conn.isClosed() || conn != null)
				System.out.println("MS Access Connection established successfully");
			else
				System.out.println("MS Access Connection failed");

			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from Emp_Detail");

			while (rs.next()) {
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					String colName = rs.getMetaData().getColumnName(i);
					String colVal = rs.getString(i);
					System.out.println("Column Name:" + colName + " -------Value:" + colVal);
				}
			}

			rs.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
