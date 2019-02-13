package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class SQLInsertTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d:\\db.prop");
		//Map 구조처럼  key와 value를 세트로 관리하는 객체
		Properties prop = new Properties();
		//db.prop파일을 읽어서 key,value 구조로 변환
		prop.load(fis);
		String driver = prop.getProperty("driver");
		String url= prop.getProperty("url");
		String id= prop.getProperty("id");
		String password=prop.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(id);
		System.out.println(password);
		Connection conn=null;
		//Statement보다 향상된 방법
		PreparedStatement stmt=null;
	
		try {
			Class.forName(driver);//jdbc driver 로딩,JDK1.6부터 생략 가능
			//DB접속
			conn=DriverManager.getConnection(url, id, password);
			String title="명품 Java";
			String publisher="영진출판사";
			String year="2018";
			int price =30000;
			String sql="insert into books(title, publisher, year, price)"
					+ " values (?,?,?,?)";
			stmt=conn.prepareStatement(sql);//sql 실행준비
			stmt.setString(1, title);//첫번째 물음표에 (?)에 입력될 값
			stmt.setString(2, publisher);
			stmt.setString(3, year);
			stmt.setInt(4, price);
			stmt.executeLargeUpdate();//sql실행(데이터 변경:executeLargeUpdate())
			System.out.println("데이터가 추가되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null) stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
