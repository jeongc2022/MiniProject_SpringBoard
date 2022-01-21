package net.jdbc_dbcp.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
// 1
public class Log {		// 1. 로그 파일에 로그 메시지를 입력하기 위한 클래스
	public String logFile = "C:/java/jdbc/connection-pool.log";
	FileWriter fw = null;
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	
	public Log() {
		try {
			fw = new FileWriter(logFile, true);
		}catch (IOException e) {}
	}
	
	public void close() {
		try {
			fw.close();
		} catch (IOException e) {}
	}
	
	public void debug(String msg) {
		try {
			fw.write(new java.util.Date()+ " : ");
			fw.write(msg + LINE_SEPARATOR);
			fw.flush();
		} catch (IOException e) {
			System.out.println("IOException.......!!");
		}
	}
	
	public static void out(String msg) {
		System.out.println(new Date() + ": " + msg);
	}
	
	public static void err(String msg) {
		System.out.println(new Date() + ": " + msg);
	}
	
	public static void err(Throwable e, String msg) {
		System.err.println(new Date() + ": " + msg);
		e.printStackTrace(System.out);
	}
}
