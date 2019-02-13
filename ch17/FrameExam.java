package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//awt : java, c 개발
//swing: awt 를 향상시킨 버전, java 로만 개발
public class FrameExam {
	public static void main(String[] args) {
		//Frame 생성 (윈도우창을 띄우는 클래스 )
		Frame f=new Frame("프레임 테스트");
		//프레임의 사이즈를 설정
		f.setSize(200, 300);
		//프레임을 화면에 표시
		f.setVisible(true);//false하면 숨김상태가 됨.
		
		//이벤트소스. 이벤트 리스너(이벤트 핸들러)
		//addOOOListener
		//addMouseLisner, addkeyListener
//		f.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램을 종료 시킴
//				//정상종료 :0 비 정상 종료: -1
//				System.exit(0);
//				
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});//익명(무명) 클레스
		 f.addWindowListener(new WindowAdapter() {
			 @Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		 });
	}
}
