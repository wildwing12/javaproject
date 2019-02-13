package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventExam extends Frame{
	//이벤트 처리 하는 방법 
	//1.WindowLIstener 익명 내부 클래스로 구현
	//2.윈도우 아답터 익명 내부 클래스로 구현
	//3.외부 파일에서 구현 
	public EventExam() {
		setSize(300, 300);
		setVisible(true);
		//이벤트 소스.이벤트 리스너(이벤트 핸들러)
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
//		this.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//정상 종료는 0, 비정상 종료는 -1
//				System.exit(0);
//			}
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});//익명 내부 클래스, 이벤트 처리기
		
	}
	public static void main(String[] args) {
		new EventExam();
	}
}
