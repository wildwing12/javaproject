package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonEventExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEventExam frame = new ButtonEventExam();
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
	public ButtonEventExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//FowLayout 으로 변경
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		//버튼 객체 생성
		JButton btnYellow = new JButton("Yellow");
		//버튼에 이벤트 기능 추가
		//이벤트 소스. 이벤트 리스너(이벤트 핸들러)
		btnYellow.addActionListener(new ActionListener() {
			//버튼클릭 이벤트가 발생했을 때 자동 호출
			//이벤트가 발생하면 이벤트에 관련된 정보들이
			//매개변수  e에 전달됨
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.YELLOW);
				//JPanel의 배경색상 변경
			}
		});
		contentPane.add(btnYellow);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		contentPane.add(btnRed);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		contentPane.add(btnGreen);
		
		JButton btnCyan = new JButton("Cyan");
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.CYAN);
			}
		});
		contentPane.add(btnCyan);
	}

}
