package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExam3 extends JFrame {
	private JButton button1, button2,  button3,  button4,  button5,  button6; 
	public EventExam3() {
		setLayout(new FlowLayout());
		button1=new JButton("Red");
		button2=new JButton("Green");
		button3=new JButton("Blue");
		button4=new JButton("White");
		button5=new JButton("Yelow");
		button6=new JButton("Cyan");
		//프레임에 버튼을 붙임
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		//버튼 클릭에 이벤트 기능 추가
		//버튼을 누루면 MyColorAction 클래스에 구현한 actionPerformed()호출
		button1.addActionListener(new MyColorAtion(this, Color.red));
		button2.addActionListener(new MyColorAtion(this, Color.green));
		button3.addActionListener(new MyColorAtion(this, Color.BLUE));
		button4.addActionListener(new MyColorAtion(this, Color.white));
		button5.addActionListener(new MyColorAtion(this, Color.yellow));
		button6.addActionListener(new MyColorAtion(this, Color.CYAN));
		
		
		
		
		
		setSize(450,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new EventExam3();
	}
}
