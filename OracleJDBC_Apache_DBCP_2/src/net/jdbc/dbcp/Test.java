package net.jdbc.dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Test {		// 2
	
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
	private static final String USER = "scott";
	private static final String PASS = "tiger";
	
	private DataSource dataSource;
	
	public Test() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUsername(USER);
		ds.setPassword(PASS);
		ds.setUrl(URL);
		
		this.dataSource = ds;
	}
	
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
