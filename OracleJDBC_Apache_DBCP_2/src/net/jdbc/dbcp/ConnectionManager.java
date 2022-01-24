package net.jdbc.dbcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

public class ConnectionManager {	// 4
	protected String poolName, dbServer, dbName, port, userID, passwd;
	protected int maxConn, initConn, maxWait;
	protected DataSource dataSource;
	
	public ConnectionManager(String pool) {
		String configFile = pool + ".properties";
		Properties properties = readProperties(configFile);
		
		dbServer = properties.getProperty("dbServer");
		port = properties.getProperty("port");
		dbName = properties.getProperty("dbName");
		userID = properties.getProperty("userID");
		passwd = properties.getProperty("passwd");
		maxConn = Integer.parseInt(properties.getProperty("maxConn"));
		initConn = Integer.parseInt(properties.getProperty("initConn"));
		maxWait = Integer.parseInt(properties.getProperty("maxWait"));
	}
	
	protected synchronized Properties readProperties(String configFile) {
		Properties properties = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(configFile);
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		return properties;
	}
	
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
