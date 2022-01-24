package net.jdbc.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmp {

	public static void main(String[] args) {
		
		Test test = new Test();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT * FROM emp";
		
		try {
			// 데이터베이스를 연결한다.
			conn = test.getConnection();
			// Statement를 가져온다.
			stmt = conn.createStatement();
			
			// SQL문을 실행한다.
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String empno = rs.getString(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(5);
				String sal = rs.getString(6);
				String comm = rs.getString(7);
				String depno = rs.getString(8);
				// 결과를 출력한다.
				System.out.println(
						empno + " : " + ename + " : "	 + job + " : " + mgr
						+ " : " + hiredate + " : " + sal +" : " + comm + " : "
						+ depno);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// ResultSet를 닫는다.
				rs.close();
				// Statement를 닫는다.
				stmt.close();
				// Connection을 닫는다.
				conn.close();
			} catch (Exception e) {}
		}
	} // main()의 끝
} // 클래스의 끝
