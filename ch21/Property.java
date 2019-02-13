package ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

//중요정보를 소스에 직접 쓰게 되면 위험하기 때문에 별도의 Property파일로 
//저장할 필요가 있다.
public class Property {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			FileInputStream fis = new FileInputStream("d:\\db.prop");
			//key=value 구조(hashMap구조)로 저장된 파일을 읽거나 쓰기 위한 객체
			Properties prop= new Properties();
			prop.load(fis);
			System.out.println(prop);
			//값을 불러올때:프로퍼티객체.getproperty(변수명)
			String password=prop.getProperty("password");
			System.out.println("password : "+password);
			//값을 기록할때 :프로퍼티객체.setProperty("key", "value")
			prop.setProperty("pwd", "java1234");
			FileOutputStream fos=new FileOutputStream("d:\\db.prop");
			prop.store(fos, "test");
			System.out.println("변경된 내용이  db.prop  파일에 잘 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
