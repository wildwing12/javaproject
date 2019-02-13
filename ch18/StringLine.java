package ch18;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet{
	@Override
	public void init() {
		getContentPane().setBackground(new Color(255,255,255));//배경색상
		setSize(300,300);//애플릿의 화면 사이즈
		
	}
	@Override
	public void paint(Graphics g) {	//색상 설정, 안쓰면 기본색은 검은색
		super.paint(g);
		g.setColor(Color.blue);
		g.drawLine(250, 50, 30, 160);
		g.setColor(Color.red);
		g.drawString("RedString", 10, 50);
		g.setColor(Color.green);
		g.drawString("Green String", 10, 80);
		g.setColor(Color.BLUE);
		g.drawString("Blue String",	10, 110);
	}
}
