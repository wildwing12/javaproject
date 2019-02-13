package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClockExam extends JFrame implements Runnable {

	private JPanel contentPane;
	private Calendar cal;
	private String str;
	private JLabel lblTime;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockExam frame = new ClockExam();
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
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton button = new JButton("종료");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(button, BorderLayout.SOUTH);
		
		lblTime = new JLabel("New label");
		lblTime.setForeground(Color.RED);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("굴림", Font.PLAIN, 20));
		contentPane.add(lblTime, BorderLayout.CENTER);
		//백그라운드 쓰레드 생성
		Thread t=new Thread(this);//this는 현재 클래스의 객체를 의미하며 
		//아래 start메소드를 통해서 run메소드를 호출
		//백그라운드 스레드 요청
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			//캘린더 인스턴스 생성(현재 시간 정보가  cal변수에 저장)
			cal=Calendar.getInstance();
			//02d 숫자 2자리, 빈자리는 0으로 채움
			str=String.format("%02d:%02d:%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
					cal.get(Calendar.SECOND));
			lblTime.setText(str);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
