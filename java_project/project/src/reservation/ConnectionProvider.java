package reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection getConnection() throws SQLException {
		// String jdbcUr1 = "jdbc:oracle:thin:@[주소]:[포트]:[데이터베이스]";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "SIN";
		String pw = "admin";

		return DriverManager.getConnection(jdbcUrl, user, pw);
	}
}