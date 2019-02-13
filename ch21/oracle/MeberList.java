package ch21.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MeberList {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		//jdbc:ora
		String id = "java";//오라클 접속 아이디
		String pwd="java1234";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);//생략가능
			conn=DriverManager.getConnection(url, id, pwd);
			System.out.println("오라클 서버에 접속되었습니다.");
			String sql="select*from member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("아이디\t이름\t비번");
			while (rs.next()) {
				String userid=rs.getString("userid");
				String password=rs.getString("passwd");
				String name=rs.getString("name");
				System.out.println(userid+"\t"+password+"\t"+name);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
