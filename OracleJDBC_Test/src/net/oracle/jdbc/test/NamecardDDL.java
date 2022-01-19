package net.oracle.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NamecardDDL {
	
	public static void main(String[] args) {	// JDBC 프로그래밍
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		String sql = null;
		try {
			// 2. Connection 맺기
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "scott", "tiger");
		// 3. Statement 얻기
			stmt = con.createStatement();
			sql = "CREATE TABLE NAMECARD ( " +
				"NO NUMBER CONSTRAINT PK_NAMECARD PRIMARY KEY, " +
				"NAME VARCHAR2(20) NOT NULL, " +
				"MOBILE VARCHAR2(20) NOT NULL, " +
				"EMAIL VARCHAR2(40), " + 
				"COMPANY VARCHAR2(60))";
			stmt.executeUpdate(sql);
			sql = "CREATE SEQUENCE SEQ_NAMECARD_NO " +
				"INCREMENT BY 1 " +
				"START WITH 1";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
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
