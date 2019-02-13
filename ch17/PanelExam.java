package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame {
	public PanelExam() {
		JPanel p= new JPanel();//패널 생성
		p.setBackground(Color.red);//패널의 배경색상 설정
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		
		p.add(button1);
		p.add(button6);
		
		add(p, BorderLayout.NORTH);//패널을 북쪽 영역에 add
		add(button2);//위치 생략하면 Center로 배치
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		setSize(300, 300);//화면 사이즈 설정
		setVisible(true);//프레임을 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		public static void main(String[] args) {
			new PanelExam();
		}
}
