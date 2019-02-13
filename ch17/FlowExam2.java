package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowExam2 extends JFrame {
	public FlowExam2() {
		setLayout(new FlowLayout());
		for(int i=1; i<=12; i++) {
			JButton b=new JButton("button"+i);
			add(b);
		}
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FlowExam2();
	}
}
