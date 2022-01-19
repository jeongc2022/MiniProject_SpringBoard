package net.oracle.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class NamecardSelect {
	static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	static final String USER = "scott";
	static final String PASS = "tiger";
	
	public static void main(String[] args) {
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT NO,NAME,MOBILE,EMAIL,COMPANY " +
				"FROM NAMECARD " +
				"ORDER BY NO DESC";
		
		try {
			// 2. Connection 맺기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL","scott","tiger");
			// 3. SQL 실행
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql)
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
