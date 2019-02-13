package ch21.oracle;
//transaction 거래 처리 단위
//insert, delete, update :레코드를 변경하는 작업
//commit, rollback
//만약 a,b,c,=> 성공, 
//a,b=>성공, c => 실패시 소시에서도 트랜잭션 처리를 해주어야 한다.

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch21.DB;

public class TransactionExam {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean success=false;
		try {
			conn=DB.hrConn();
			conn.setAutoCommit(false);//auto commit  해제
			StringBuilder sb= new StringBuilder();
			sb.append("insert into emp_copy(empno, ename, sal) ");
			sb.append(" values (?,?,?) ");
			pstmt=conn.prepareStatement(sb.toString());
			long start=System.currentTimeMillis();//현재 시각
			for(int i=1; i<=1000; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "kim");
				pstmt.setInt(3, 4500);
				System.out.println(i);
//				pstmt.executeUpdate();//DB서버에 부하가 많이 걸림
				pstmt.addBatch();//일괄처리 작업 추가				
			}
			pstmt.executeBatch();//일괄처리 작업실행
			success=true;
			long end =System.currentTimeMillis();//끝난 현재 시각
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(success) {
					System.out.println("커밋 되었습니다.");
					conn.commit();
				}else {
					System.out.println("롤백되었습니다.");
					conn.rollback();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
