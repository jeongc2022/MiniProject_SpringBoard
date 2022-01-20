package net.oracle.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoinTable {
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
		ResultSet rs = null;
		String sql = "SELECT ENAME,JOB,D.DEPTNO,DNAME " +
				"FROM EMP E, DEPT D " +
				"WHERE E.DEPTNO = D.DEPTNO " +
				"AND D.LOC = 'DALLAS'";
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "scott", "tiger");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String deptno = rs.getString("deptno");
				String dname = rs.getString("dname");
				System.out.println(ename + " " + job + " " + deptno + " " + dname);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(sql);
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
