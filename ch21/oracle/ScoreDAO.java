package ch21.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import ch21.DB;

public class ScoreDAO {
	public Vector listScroe() {
		//arraylist는  Jtable과 잘 호환이 안되서 벡터 씀
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.oraConn();
			//String 방식 보다는 StringBuilder가 효율적
			StringBuilder sb= new StringBuilder();
			sb.append(" select student_no,name,kor,eng,mat,(kor+eng+mat)  tot, round((kor+eng+mat)/3.0,2)  avg from score "); 
			//끈어 쓰려면 sb.append해서 계속 가따 쓰면됨
			sb.append(" order by name " );
			pstmt= conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector row =new Vector();
				String student_no=rs.getString("student_no");
				//rs.getString(1);해도 되지만 가독성이 떨어짐
				String name =rs.getString("name");
				int kor=rs.getInt("kor");
				int eng=rs.getInt("eng");
				int mat=rs.getInt("mat");
				int tot=rs.getInt("tot");
				double avg=rs.getDouble("avg");
				row.add(student_no);
				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(mat);
				row.add(tot);
				row.add(avg);
				items.add(row);//벡터에 1개으 행(레코드)를 추가(2차원 벡터)
				//2차원 배열화 시킴
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
			} catch (SQLException e) {				
				e.printStackTrace();
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
		return items;
	}
	public int insertScore (ScoreDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.oraConn();
			StringBuilder sb=new StringBuilder();
			sb.append(" insert into score (student_no, name,kor,eng,mat ) ");
			sb.append(" values (?,?,?,?,?)");
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getStudent_no());
			pstmt.setString(2,dto.getName());
			pstmt.setInt(3,dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());
			//affected rows(영향을 받은 행의 수)
			//성공하면 1, 실패하면 0이 리턴
			result =pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		return result;	
	}
	/*[레코드를 전달하는 방법]
//	1.primary key만 전달하는 방법
//	2.선택한 행을 dto로 전달 - 여러 사용자가 사용중에 중간에 변경이 있을경우 반영이 제대로 안되는 문제가 생김
//	3.static 변수에 저장- 코드 양이 줄지만 객체지향 방식에는 안 맞는 편법, 또한 무거운 데이터가 들어가면 메모리 낭비가 심함.
 *  4.
 */
	public int updateScore(ScoreDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.oraConn();
			StringBuilder sb=new StringBuilder();
			sb.append(" update score set ");
			sb.append(" name=?, kor=?, eng=?, mat=? ");
			sb.append(" where student_no=? ");
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMat());
			pstmt.setString(5, dto.getStudent_no());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		return result;
	}
	//학번 키만 받아서 출력 하는 메소드
	
	public ScoreDTO viewScore(String student_no) {
		ScoreDTO dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.oraConn();
			StringBuilder sb=new StringBuilder();
			sb.append("select student_no,name,kor,eng,mat");
			sb.append(",(kor+eng+mat) tot");
			sb.append(", round((kor+eng+mat)/3.0, 2) avg ");
			sb.append(" from score ");
			sb.append(" where student_no=?");
			//끈어 쓰려면 sb.append해서 계속 가따 쓰면됨
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, student_no);
			rs=pstmt.executeQuery();
			if(rs.next()) {//레코드가 한개이기 때문에 if문만 쓰면됨)
				String name=rs.getString("name");
				int kor=rs.getInt("kor");
				int eng=rs.getInt("eng");
				int mat=rs.getInt("mat");
				dto =new ScoreDTO(student_no, name, kor, eng, mat);		
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
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
		return dto;
	}
	public int deleteScore(String student_no) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.oraConn();
			StringBuilder sb=new StringBuilder();
			sb.append("delete from score where student_no=? ");
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, student_no);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		return result;
	}
}
