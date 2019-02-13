package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ProductDAO {
	public Vector ProductList() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select*from product";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row=new Vector();
				row.add(rs.getString("product_no"));
				row.add(rs.getString("plocal"));
				row.add(rs.getString("pname"));
				row.add(rs.getString("company"));
				row.add(rs.getInt("uprice"));
				row.add(rs.getInt("acc"));
				row.add(rs.getInt("sprice"));
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
	public Vector searchProduct(String company) {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="selcet*from product where company like ? order by sprice";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+company+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("product_no"));
				row.add(rs.getString("plocal"));
				row.add(rs.getString("pname"));
				row.add(rs.getString("company"));
				row.add(rs.getInt("uprice"));
				row.add(rs.getInt("acc"));
				row.add(rs.getInt("sprice"));
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
	public int insertProduct(ProductDTO dto) {
		int result =0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into product (product_no, plocal, pname, company, uprice, acc, sprice) values (?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct_no());
			pstmt.setString(2, dto.getPlocal());
			pstmt.setString(3, dto.getPname());
			pstmt.setString(4, dto.getCompany());
			pstmt.setInt(5, dto.getUprice());
			pstmt.setInt(6, dto.getAcc());
			pstmt.setInt(7, dto.getSprice());
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
	public int deleteProduck(String product_no) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from product where product_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, product_no);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;	
	}
	public int updateProduct(ProductDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update Product set plocal=?, pname=?, company=?, uprice=?, acc=? where product_no=? ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPlocal());
			pstmt.setString(2, dto.getPname());
			pstmt.setString(3, dto.getCompany());
			pstmt.setInt(4, dto.getUprice());
			pstmt.setInt(5, dto.getAcc());
			pstmt.setString(6, dto.getProduct_no());
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
