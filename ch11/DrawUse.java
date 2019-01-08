package ch11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//Applet:웹 브라우저에서 실행되는 자바 클래스
public class DrawUse extends Applet{
	Draw shape1;//인터페이스 데이터 타입
	Draw shape2;//인터페이스 데이터 타입
	public DrawUse(){
		shape1= new DrawCircle(30,30,60,80);
		shape2 = new DrawLine(10,20,150,100);
		setBackground(Color.yellow);//배경 색상 설정						
	}
	@Override
	public void paint(Graphics g) {//paint메소드가  main메소드 역할
		g.drawString("자바 그래픽", 100, 60);//문자열, x,y좌표
		shape1.paint(g);
		shape2.paint(g)
		;
	}

}
