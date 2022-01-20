package net.oracle.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.net.ns.Message11;

public class TransactionPairs {
	static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	static final String USER = "scott";
	static final String PASS = "tiger";
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE account SET balance = balance + ? WHERE accountno = ?";
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "scott", "tiger");
			
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, -1500);
			pstmt.setString(2, "111");
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 1500);
			pstmt.setString(2, "222");
			pstmt.executeUpdate();
			
			con.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();		// 예외가 발생하면 롤백
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
