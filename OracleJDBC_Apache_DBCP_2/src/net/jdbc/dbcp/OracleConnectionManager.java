package net.jdbc.dbcp;

import org.apache.commons.dbcp2.BasicDataSource;

public class OracleConnectionManager extends ConnectionManager {	// 5

	public OracleConnectionManager() {
		super("oracle");
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String driverType = "jdbc:oracle:thin";
		String url = driverType + ":@" + dbServer + ":" + port + ":" + dbName;
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUsername("scott");
		ds.setPassword("tiger");
		ds.setUrl(url);
		
		this.dataSource = ds;
	}

}
