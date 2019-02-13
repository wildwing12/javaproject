package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExam4 extends JFrame{
	private JButton button1, button2, button3, button4, button5, button6, button7,button8, button9;
	public EventExam4() {
		setLayout(new FlowLayout());
		button1=new JButton("Red");
		button2=new JButton("Green");
		button3=new JButton("Blue");
		button4=new JButton("White");
		button5=new JButton("Yelow");
		button6=new JButton("Cyan");
		button7=new JButton("Pink");
		button8=new JButton("Orange");
		button9=new JButton("Magenta");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		
		button1.addActionListener(new MyColorAtion(this, Color.red));
		button2.addActionListener(new MyColorAtion(this, Color.green));
		button3.addActionListener(new MyColorAtion(this, Color.BLUE));
		button4.addActionListener(new MyColorAtion(this, Color.white));
		button5.addActionListener(new MyColorAtion(this, Color.yellow));
		button6.addActionListener(new MyColorAtion(this, Color.CYAN));
		button7.addActionListener(new MyColorAtion(this, Color.PINK));
		button8.addActionListener(new MyColorAtion(this, Color.ORANGE));
		button9.addActionListener(new MyColorAtion(this, Color.MAGENTA));
		
		setSize(450, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new EventExam4();
	}
}
