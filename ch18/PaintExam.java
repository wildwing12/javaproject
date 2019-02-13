package ch18;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame {
	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창닫기, 프로그램 종료
		setSize(300,300);//프레임의 사이즈 
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);//JFrame의 paint()가 실행됨
		//drawString("문자열", x좌표, y좌표) :그래픽인데 문자열 형태로 출력하는 메소드
		g.drawString("hello Java",10, 60);
		g.setColor(Color.BLUE);//전에 지정한 색에 적용
		g.drawOval(30, 100, 50, 50);//원을 그리는 것임
		g.fillOval(100, 100, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillRect(200, 200, 60, 60);
		g.drawRect(100, 200, 60, 60);
		System.out.println("paint 호출");
	}
	
	public static void main(String[] args) {//==> 결과 값은 글자이나 이것은 그래픽으로 되어 있음 
		new PaintExam();
	}
}
