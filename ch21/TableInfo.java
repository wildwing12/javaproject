package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TableInfo {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;//select문을 쓸때 사용
		ResultSetMetaData meta=null;//테이블에 대한 부가적인 정보 설명 데이터
		try {
			conn=DB.dbConn();
			String sql="select*from score";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			//ResultSet 으로 부터 메타데이터(테이블의 정보)를 가져옴
			meta=rs.getMetaData();
			int clos=meta.getColumnCount();//컬럼의 갯수
			System.out.println("필드명\t\t자료형\tnull여부");
			for(int i=1; i<clos; i++) {//db의 필드 인덱스는 1부터 시작
				String colName = meta.getColumnName(i);//i번째 컬럼의 이름
				String conType=meta.getColumnTypeName(i);//i번째 컴럼의 타입 이름
				int inNull=meta.isNullable(i);//i번째 컬럼의 null허용 여부(0:not null, 1:null)
				System.out.println(colName+"\t\t"+conType+"\t"+inNull);
				
			}//end for
			
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
