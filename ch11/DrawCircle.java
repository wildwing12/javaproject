package ch11;

import java.awt.Graphics;

public class DrawCircle extends Point implements Draw {
	private int width, height;//멤버변수
	public DrawCircle() {//기본생성자
		this(0,0,0,0);
	}
	public DrawCircle(int a, int b, int w, int h) {
		super(a,b);//부모클래스
		width =w;
		height=h;
	}
	@Override
	public void paint(Graphics g) {
		//타원 그리기(x,y,가로,세로)
		g.drawOval(a, b, width, height);

	}

}
