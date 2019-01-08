package ch12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame{
	public InnerExam() {
		super("내부 클래스 테스트");//super()를 썼으므로 상위 클래스 인
		//Frame 클래스의 생서자 호출 및 제목 삽입 기능
		setSize(300,400);//가로 세로의 초기 사이즈 설정
		setVisible(true);//프렘임을 화면에 표시
		
	}//end InnerExam()
	public static void main(String[] args) {
		InnerExam e=new InnerExam();//객체를 생성하자마자 기본 생성자 호출
		e.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			//윈도우 창이 닫힐 때 호출
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//프로그램을 강제 종료를 할때 쓰이는 메소드
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
