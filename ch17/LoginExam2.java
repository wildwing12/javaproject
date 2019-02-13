package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LoginExam2 extends JFrame {

	private JPanel contentPane;
	private JTextField userId;
	private JPasswordField pwd;
	private JButton btnLogin;
	private Map<String,String> map;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam2 frame = new LoginExam2();
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
	public LoginExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(61, 87, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(61, 131, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		userId = new JTextField();
		userId.setBounds(183, 84, 116, 21);
		contentPane.add(userId);
		userId.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(183, 128, 116, 21);
		contentPane.add(pwd);
		
		map=new HashMap<>();
		map.put("lee@naver.com", "1234");
		map.put("kim@nate.com", "2345");
		map.put("park@daum.net", "3456");
		map.put("kang@gmail.com", "4567");
		
		btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=userId.getText();
				String pw=String.valueOf(pwd.getPassword());
				String strId=map.get(id);
				if(strId!=null&&strId.equals(pw)) {
					lblResult.setForeground(Color.BLUE);
					lblResult.setText(id+"님환영합니다.");
					
				}else {
					lblResult.setForeground(Color.RED);
					lblResult.setText("아이디 또는 비밀번호가 일치 하지 않습니다.");
					
				}
				
			}
		});
		btnLogin.setBounds(183, 193, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("굴림", Font.BOLD, 15));
		lblResult.setBounds(0, 226, 422, 26);
		contentPane.add(lblResult);
	}

}
