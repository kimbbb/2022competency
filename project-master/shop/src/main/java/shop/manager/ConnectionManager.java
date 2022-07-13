package shop.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.mariadb.jdbc.Statement;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		String url = "jdbc:mariadb://localhost:3306/shop";
		String uid = "kihee";
		String pass = "iloveyou7";
		return DriverManager.getConnection(url, uid, pass);
	}
	
	public static void close(Connection con) {
		try {
			con.close();
		} 
		catch (Exception e) {}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		}
		catch (Exception e) {}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		}
		catch (Exception e) {}
	}
}
