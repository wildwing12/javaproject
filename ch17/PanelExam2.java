package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam2 extends JFrame {
	public PanelExam2() {
		JButton button1=new JButton("버튼1");
		JButton button2=new JButton("버튼2");
		JButton button3=new JButton("버튼3");
		JButton button4=new JButton("버튼4");
		JButton button5=new JButton("버튼5");
		JButton button6=new JButton("버튼6");
		JButton button7=new JButton("버튼7");
		JButton button8=new JButton("버튼8");
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
//		p1.setBackground(Color.red);
		p2.setBackground(Color.YELLOW);
		p3.setBackground(Color.BLUE);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.EAST);
		
		
		p1.add(button1);
		p1.add(button2);
		p2.add(button3);
		p2.add(button4);
		add(button5);
		p3.add(button6);
		p3.add(button7);
		add(button8, "South");
		
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new PanelExam2();
	}
	
}
