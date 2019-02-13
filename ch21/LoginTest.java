package ch21;

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

public class LoginTest extends JFrame {

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
					LoginTest frame = new LoginTest();
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
	public LoginTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(51, 27, 57, 15);
		contentPane.add(lblNewLabel);
		
		userid = new JTextField();
		userid.setBounds(146, 24, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(51, 71, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		pwd = new JPasswordField();
		pwd.setBounds(146, 68, 116, 21);
		contentPane.add(pwd);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사용자가 입력한 아이디, 비밀번호를 저장
				String strUserid = userid.getText();
				String strPwd = String.valueOf(pwd.getPassword());
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					//properties 파일을 로딩
					FileInputStream fis = 
							new FileInputStream("d:\\db.prop");
					Properties prop = new Properties();
					prop.load(fis);
					String url=prop.getProperty("url");
					String id=prop.getProperty("id");
					String password = prop.getProperty("password");
					
					//mySql server에 접속
					conn = DriverManager.getConnection(url, id, password);
					String sql = "select * from member where userid=? "
							+ "and pwd=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, strUserid);
					pstmt.setString(2, strPwd);
					rs = pstmt.executeQuery();
					if(rs.next()) {//레코드가 존재하면
						lblResult.setText(rs.getString("name")+"님 환영합니다.");
						
					}else {
						lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				} finally {
					try {
						if(rs!=null)
							rs.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
					try {
						if(pstmt!=null)
							pstmt.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
					try {
						if(conn!=null)
							conn.close();
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
			}
		});
		btnLogin.setBounds(146, 113, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(51, 172, 335, 15);
		contentPane.add(lblResult);
	}
}
