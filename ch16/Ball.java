package ch16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Ball extends Applet implements Runnable, ComponentListener {

	private int x,y;//좌표 값
	private int mx=2, my=3;//x축 2, y축 3 움직임
	private int width=200, height=200; //화면 사이즈
	
	//애플릿을 초기화 시키는 method
	@Override
	public void init() {
		//화면의 변화를 감지하는 이벤트 처리 가능( 예를 들어 마우스를 누른다던지 키보드를 누른다든지 등등이 이벤트 처리레)
		//이벤트 소스.이벤트리스너(이벤트 핸들러): 이벤트 핸들러로 움직여
		this.addComponentListener(this);//여기서 this는 에플릿을 말함. A is a B(Applet)
		//여기서 this는 Applet을 가리킴
		//새로운 스레드를 생성
		Thread t=new Thread(this);
		//새로운 작업 단위가 할당되고 run()이 실행됨
		t.start();
		
	}
	@Override
	public void paint(Graphics g) {
		//Graphics 자바의 그래픽 처리 클래스
		g.setColor(Color.BLUE);//색상 변경
		g.fillOval(x, y, 30, 30);
		//fillOval(시작  x, 시작 y, 가로 길이값, 새로 길이 값)-타원을 그리는 메소드
		
	}//end paint
	@Override
	public void run() {
		while(true) { //무한반복
			//x,y 좌표값 변경
			if(x>(width-30)||x<0) {//공이 벽에 맞았을 때 좌표가
				//오른쪽 벽에서 -30만큼 공포인터가 있어야 하고 x가 음수면 
				//안된다.
				mx = -mx;//방향을 반대로 바꿈 즉, x축 2씩 증가하던것을 
				//반대로 감소 2씩 감소 시킴
				}
			x=x+mx;//x좌표에 가중치 부여
			if(y>(height-30)|| y<0){//공이 y축 벽에 맞았을 때 
				//좌표가 하단 벽에서 -30만큼 공 포인터가 이써야 하고 y가
				//음사가 되면 안된다.
				my=-my;
				
			}
			y=y+my;//y좌표의 가중치 부여
			repaint();//화면을 새로 그림=> paint()가 자동호출
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//end run()
	
	@Override
	public void componentResized(ComponentEvent e) {
		//화면의 가로, 세로 사이즈를 저장(화면 크기가 바뀌 더라도 바뀌더라도 출력되게 해줌
		width=getWidth();
		height=getHeight();
		
		System.out.println("가로 : "+width+"세로 : "+height);
		
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
