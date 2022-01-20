package net.oracle.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsingPreparedStatement {
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
		PreparedStatement pstmt = null;
		String sql = "UPDATE NAMECARD SET COMPANY=? WHERE NO=?";
		try {
			// 2. 커넥션 맺기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "scott", "tiger");
			// 3. SQL 실행
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "율도국");
			pstmt.setInt(2, 1);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(sql);
		} finally  {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
