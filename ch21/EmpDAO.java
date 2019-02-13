package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class EmpDAO {
	public Vector searchEmp(String ename) {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select empno, ename, hiredate, sal from emp where ename like ? order by ename ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ename+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row=new Vector();
				row.add(rs.getInt("empno"));
				row.add(rs.getString("ename"));
				row.add(rs.getDate("hiredate"));
				row.add(rs.getInt("sal"));
				items.add(row);
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
	public Vector listEmp() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();//mysql 에 처리 접속.
			//DB.java 내의 static으로 처리된 메스드 접근은  new를 하지 않고
			//클래스 이름. 메소드이름으로 접근 가능
			String sql="select*from emp";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row =new Vector();
				row.add(rs.getInt("empno"));
				row.add(rs.getString("ename"));
				row.add(rs.getDate("hiredate"));
				row.add(rs.getInt("sal"));
				items.add(row);
//				int empno=rs.getInt("empno");
//				String ename=rs.getNString("ename");
//				Date hiredate = rs.getDate("hiredate");
//				int sal=rs.getInt("sal");
//				items.add(new EmpDTO(empno, ename, hiredate, sal));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs !=null)rs.close();
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
		}//end finally
		return items;
	}

	public int insertEmp(EmpDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into emp (empno,ename,hiredate,sal) "
					+ " values(?,?,?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
			result=pstmt.executeUpdate();//insert, delete....
			
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

	public int deleteEmp(int empno) {
		int result = 0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from emp where empno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,empno);
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
	//update
	public int updateEmp(EmpDTO dto) {
		int result=0;
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update emp set ename=?, hiredate=?, sal=? where empno=? ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEname());
			pstmt.setDate(2, dto.getHiredate());
			pstmt.setInt(3, dto.getSal());
			pstmt.setInt(4, dto.getEmpno());
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
