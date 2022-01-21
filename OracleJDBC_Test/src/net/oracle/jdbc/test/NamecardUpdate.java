package net.oracle.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NamecardUpdate {
	static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	static final String USER = "scott";
	static final String PASS = "tiger";
	
	public static void main(String[] args) {
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		String sql = "UPDATE NAMECARD " +
	            "SET EMAIL ='gildonghong@gmail.org' " +
	            "WHERE NO = 1";
		try {
			// Connection 맺기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "scott", "tiger");
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(sql);
		}finally {
			try {
				stmt.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 

	}

}
