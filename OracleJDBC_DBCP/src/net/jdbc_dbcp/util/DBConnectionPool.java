package net.jdbc_dbcp.util;

import java.sql.Connection;
import java.util.Vector;

// Connection Pool을 관리하는 클래스
public class DBConnectionPool {	// 2. 특정 데이터베이스에 대한 커넥션 객체를 풀로 관리하는 클래스
	// 현재 사용중인 Connection 개수
	private int checkedOut;
	
	// Free Connection List
	private Vector<Connection> freeConeections = new Vector<Connection>();
}
