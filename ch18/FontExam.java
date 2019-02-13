package ch18;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet {
	private Font font;
	private FontMetrics fm;//글꼴관련 정보를 제공하는 클래스
	private int x=30,y=30;//x=0, y=0;
	private String message;
	private Dimension dim;//객체의 크기값들의 정보를 담는 클래스
	
	@Override
	public void init() {
		message= "그래픽 테스트";
		font = new Font("굴림", Font.ITALIC, 30);
		fm= getFontMetrics(font);//폰트의 가로, 세로 사이즈를 가져오는 메소드
		setSize(400,400);//애플릿 화면 크기
		//글자가 화면에 크기에 맞게 중앙에 위치하고자 하는 처리
		dim=getSize();//화면의 크기 계산해서 Dimension에 저장
		System.out.println("화면의 x사이즈 : "+dim.width);//현재 화면의 가로 사이즈
		System.out.println("화면의 y사이즈 : "+dim.height);//현재 화면의 세로 사이즈
		
		//문자열의 가로 세로 길이 계산해야 환면의 중앙에 위치 가능함.
		//x=dim.width/2
		//y=dim.height/2
		x=(dim.width/2)-(fm.stringWidth(message)/2);//폰트의 가로 길이 값
		y=(dim.height/2)-(fm.getDescent()/2);//폰트의 세로 길이값
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);
		g.drawString(message, x, y);
	}

}
