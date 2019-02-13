package ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase2 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost/java?serverTimezone=UTC";
		String jd="java";
		String password="java1234";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, jd, password);
			String sql="select*from bookExam";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt("id");
				String title = rs.getString("title");
				String author= rs.getString("author");
				String bookdate=rs.getString("bookdate");
				int price=rs.getInt("price");
				System.out.println(id+"\t"+title+"\t"+author+"\t"+bookdate+"\t"+price);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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
