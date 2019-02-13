package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
//	static :인스턴트를 만들지 않고 호출 가능, 자주 쓰는 메소드 는 
//	static 만들어 처리하면 좋다.
	public static Connection dbConn() {
		Connection conn=null;
		try {
			FileInputStream fis= new FileInputStream("d:\\db.prop");
			Properties prop=new Properties();
			prop.load(fis);
			String url=prop.getProperty("url");
			String id=prop.getProperty("id");
			String password=prop.getProperty("password");
			conn=DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//oracle 접속 메소드
	public static Connection oraConn() {
		Connection conn=null;
		try {
			FileInputStream fis= new FileInputStream("d:\\oracle.prop");
			Properties prop=new Properties();
			prop.load(fis);
			String url=prop.getProperty("url");
			String id=prop.getProperty("id");
			String password=prop.getProperty("password");
			conn=DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//오라클의 hr계정접속
	public static Connection hrConn() {
		Connection conn=null;
		try {
			FileInputStream fis= new FileInputStream("d:\\hr.prop");
			Properties prop=new Properties();
			prop.load(fis);
			String url=prop.getProperty("url");
			String id=prop.getProperty("id");
			String password=prop.getProperty("password");
			conn=DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
