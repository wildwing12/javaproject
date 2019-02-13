package pot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import ch21.DB;

public class KindergardenDAO {
	public Vector kinderList() {
		Vector items=new Vector ();
		Connection conn=null;
		PreparedStatement pstmt= null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select*from children order by chnum";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row=new Vector();
				row.add(rs.getString("chnum"));
				row.add(rs.getString("chname"));
				row.add(rs.getString("chsex"));
				row.add(rs.getString("chbirthday"));
				row.add(rs.getDouble("height"));
				row.add(rs.getDouble("weight"));
				row.add(rs.getString("chaddr"));
				row.add(rs.getString("charactor"));
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
	public Vector searchKindergarden(String chname ) {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select*from children where chname like ? order by chnum asc";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+chname+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row= new Vector();
				row.add(rs.getString("chnum"));
				row.add(rs.getString("chname"));
				row.add(rs.getString("chsex"));
				row.add(rs.getString("chbirthday"));
				row.add(rs.getDouble("height"));
				row.add(rs.getDouble("weight"));
				row.add(rs.getString("chaddr"));
				row.add(rs.getString("charactor"));
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
	public int insertKindergarden(KindergardenDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into children values (?,?,?,?,?,?,?,?);";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getChnum());
			pstmt.setString(2, dto.getChname());
			pstmt.setString(3, dto.getChsex());
			pstmt.setDate(4, dto.getChbirthday());
			pstmt.setDouble(5, dto.getHeight());
			pstmt.setDouble(6, dto.getWeight());
			pstmt.setString(7, dto.getChaddr());
			pstmt.setString(8, dto.getCharactor());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
	public int deleteKindergarden(String chnum) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from children where chnum=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, chnum);
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
	public int updateKindergarden(KindergardenDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update children set chname=?, chsex=?, chbirthday=?, height=?, weight=?, chaddr=?, charactor=? where chnum=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getChname());
			pstmt.setString(2, dto.getChsex());
			pstmt.setDate(3, dto.getChbirthday());
			pstmt.setDouble(4, dto.getHeight());
			pstmt.setDouble(5, dto.getWeight());
			pstmt.setString(6, dto.getChaddr());
			pstmt.setString(7, dto.getCharactor());
			pstmt.setString(8, dto.getChnum());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		return result;
		
		
	}
}
