package ch21;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class LoginTest2 extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest2 frame = new LoginTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		lblNewLabel.setBounds(115, 79, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(115, 124, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		userid = new JTextField();
		userid.setBounds(205, 76, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(205, 121, 116, 21);
		contentPane.add(pwd);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("휴먼엑스포", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strUserid = userid.getText();
				String strPwd = String.valueOf(pwd.getPassword());
				Connection conn =null;
				PreparedStatement pstmt = null;
				ResultSet rs=null;
				try {
					FileInputStream fis=new FileInputStream("d:\\db.prop");
					Properties prop=new Properties();
					prop.load(fis);
					String url = prop.getProperty("url");
					String id = prop.getProperty("id");
					String password =prop.getProperty("password");
					conn=DriverManager.getConnection(url, id, password);
					String sql="select*from member where userid =? and pwd=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, strUserid);
					pstmt.setString(2, strPwd);
					rs = pstmt.executeQuery();
					if(rs.next()) {
						lblResult.setText(rs.getString("name")+"님 환영합니다.");
					}else {
						lblResult.setText("아이디 또는 비밀번호가 일치 하지 않습니다.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}finally {
					try {
						if(rs !=null) {
							rs.close();
						}
					} catch (Exception e3) {
						e3.printStackTrace();
					}
					try {
						if(pstmt !=null) {
							pstmt.close();
						}
					} catch (Exception e3) {
						e3.printStackTrace();
					} 
					try {
						conn.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
			}
		});
		btnLogin.setBounds(161, 176, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setForeground(new Color(205, 133, 63));
		lblResult.setBounds(115, 221, 206, 15);
		contentPane.add(lblResult);
	}

}
