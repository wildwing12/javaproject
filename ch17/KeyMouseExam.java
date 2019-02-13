package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
//MouseListener :마이수 이벤트 처리를 위한 리스너(인터페이스)
//MouseMotionListener :마우스 이동 이벤트 처리를 위한 리스너(인터페이스)
//KeyListener :키보드 이벤트 처리를 위한 리스너
public class KeyMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
	private int x, y;//이미지를 출력할 x,y좌표값
	private int width, height;//가로, 세로 사이즈
	private Image img;//이미지 car.gif를 사용하기 위한 변수
	private boolean flag=false;//이미지가 처음 실행할때 안보이게
	//boolean으로 false처리
	
	//애플릿을 초기화하는 코드
	@Override
	public void init() {
		setSize(300,300);//화면 사이즈 설정
		//이미지를 불러오는 코드
		img= Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재 클래스에 마우스 이벤트 기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		//현재 클래스에 키이벤트 기능을 추가
		this.addKeyListener(this);
		//키입력 맏을 수 있도록 설정
		setFocusable(true);
		//현재 화면에 키 입력을 요청
		requestFocus();
		
	}//init()
	//화면 출력 method
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로, 세로 길이 계산
		width=img.getWidth(null);
		height=img.getHeight(null);
		System.out.println(width+","+height);
		if(flag) {//마우스를 클릭했을때 true로 변경 하여 실행
			g.drawImage(img, x, y, this);
		}
	}//end paint()
	
	@Override
	public void keyTyped(KeyEvent e) {
		// 키보드의 키를 입력하면 호출

	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌려져 있을때 호출
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//문자
		switch(e.getKeyCode()) {//키 코드값에 따라 분기
		case KeyEvent.VK_UP://화살표 위쪽 키를 눌렀을 때
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN: 
			y=Math.min(300-height, y=5); break;
		case KeyEvent.VK_LEFT://왼쪽 키를 눌렀을때
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT://오른쪽 키를 눌렀을때
			x=Math.min(300-width, x=5); break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키보드의 키를 땔때에 호출

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// 컴포넌트 상에서 마우스 버튼을 눌러 드래그했을 때 호출
		System.out.println("mouse drag :x"+x+",y:"+y);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스 커서가 컴퍼넌트 상에 이동했지만 버튼이 작동하지 않은 경우 호출
		x=e.getX();
		y=e.getY();
		System.out.println("mouse move :x :"+x+",y:"+y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;//클릭할때 그림을 true로 설정해서 보이게 함.
		//마우스 클릭 좌표 저장
		x = e.getX();
		y = e.getY();
		//그래픽 갱신 요청
		repaint();//paint()호출
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 컴포넌트 상에 마우스를 버튼을 눌렀을 때에 호출

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//컴포넌트 상에 mouse button을 떼어 놓아지면 호출

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 컴포넌트에 들어갔을때 호출

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴포넌트를 종료할때 호출

	}

}
