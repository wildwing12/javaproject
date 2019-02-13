package pot;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import ch21.DB;
import ch21.oracle.ScoreList;
import ch21.oracle.ScoreSave;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class KinderLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JButton btnLogin;
	private JPasswordField tfPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KinderLogin frame = new KinderLogin();
					frame.setVisible(true);
					frame.setTitle("원아 관리 프로그램");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KinderLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(12, 13, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setBounds(98, 10, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(12, 52, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strId=tfId.getText();
				String strPwd=String.valueOf(tfPwd.getPassword());
				Connection conn=null;
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					conn=DB.dbConn();
					String sql="select*from login where id=? and pwd=? ";
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, strId);
					pstmt.setString(2, strPwd);
					rs=pstmt.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(KinderLogin.this, strId+"님 환영합니다.");
						KindergardenList frm=new KindergardenList();
						frm.setVisible(true);
						//프레임의 좌표지정
						frm.setLocation(200,200);
						dispose();
					}else {
						JOptionPane.showMessageDialog(KinderLogin.this, "아이디와 비밀번호가 일치하지 않습니다.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}finally {
					try {
						if(rs!=null)rs.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						if(pstmt!=null)pstmt.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnLogin.setBounds(58, 88, 97, 23);
		contentPane.add(btnLogin);
		
		tfPwd = new JPasswordField();
		tfPwd.setBounds(98, 49, 116, 21);
		contentPane.add(tfPwd);
	}
}
