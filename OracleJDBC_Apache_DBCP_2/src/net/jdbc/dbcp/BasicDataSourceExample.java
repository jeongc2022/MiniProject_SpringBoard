 package net.jdbc.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;


public class BasicDataSourceExample {	// 1
	
	public void main(String[] args) {
		// First we set up the BasicDataSource.
		// Normally this would be handle auto-maticallyu by
		// an external configuration, but int this example we'll
		// do it manually.
		//
		System.out.println("Setting up data source");
		DataSource dataSource = setupDataSource("jdbc:oracle:thin:217.0.0.1:@127.0.0.1:1521:ORCL");
		System.out.println("Done");
		
		// 
		// Now we can use JDBC DataSource as normally would.
		//
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
			System.out.println("Creating connection");
			conn = dataSource.getConnection();
			System.out.println("Creating statement.");
			stmt = conn.createStatement();
			System.out.println("Excuting statement.");
			rset = stmt.executeQuery("SELECT * FROM dept");
			System.out.println("Results:");
			int numcols = rset.getMetaData().getColumnCount();
			while(rset.next()) {
				for(int i=1;i<=numcols;i++) {
					System.out.print("\t" + rset.getString(i));
				}
				System.out.println("");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { if (rset != null) rset.close(); } catch (Exception e) {}
			try { if (stmt != null) stmt.close(); } catch (Exception e) {}
			try { if (conn != null) conn.close(); } catch (Exception e) {}
		} 
	}
	
	 public static DataSource setupDataSource(String connectURI) {
		 BasicDataSource ds = new BasicDataSource();
		 ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		 ds.setUsername("scott");
		 ds.setPassword("tiger");
		 ds.setUrl(connectURI);
		 return ds;
	 }
	 
	 public static void printDataSource(DataSource ds) {
		 BasicDataSource bds = (BasicDataSource) ds;
		 System.out.println("NumActive: " + bds.getNumActive());
		 System.out.println("NumIdle: " + bds.getNumIdle());
	 }
	 
	 public static void shutdownDataSource(DataSource ds) throws SQLException {
		BasicDataSource bds = (BasicDataSource) ds; 
		bds.close();
	 }
}
