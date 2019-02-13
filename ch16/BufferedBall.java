package ch16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class BufferedBall extends Applet implements Runnable, ComponentListener{
	private int x,y;
	private int mx=2, my=3;
	private int width=200, height=200;
	//더블 버퍼링 (double buffering)을 위한 변수 추가
	private Graphics bg;
	private Image offScreen;//백그라운드 이미지 객체
	private Dimension dim;//화면의 가로, 세로 사이즈를 저장하는 객체
	
	@Override
	//애플릿을 초기화 시키는 메소드
	public void init() {
		setSize(300,300);//애플릿의 가로, 세로 길이 설정
		dim=getSize();//애플릿의 가로, 세로 길이를 Dimension객체에 저장
		offScreen=createImage(dim.width,dim.height);//화면사이즈만큼
		//백그라운드 그래픽 영역 생성
		bg=offScreen.getGraphics();
		
		//화면에 변화를 감지하는 이벤트 처리 기능 추가
		this.addComponentListener(this);
		Thread t= new Thread(this);
		t.start();
	}
	
	@Override
	public void paint(Graphics g) {
		//백그라운드 메모리에 그래픽 출력
		bg.setColor(Color.WHITE);
		// fillRect(x,y,width,heigh)-사각형을 그리는 method
		bg.fillRect(0, 0, getWidth(), getHeight());
		bg.setColor(Color.green);
		bg.fillOval(x, y, 30, 30);
		g.drawImage(offScreen, 0, 0, this);
		
	}//end paint()
	@Override
	public void run() {
		while(true) {//무한반복
			if(x>(width-30) || x<0) {
				mx=-mx;
			}
			x=x+mx;
			if(y>(height-30) || y<0) {
				my=-my;
			}
			y=y+my;
			repaint();//화면을 새로 그림=>paint()가 호출됨
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void componentResized(ComponentEvent e) {
		width=getWidth();
		height=getHeight();
		System.out.println("가로:"+width+"세로:"+height);
		
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
