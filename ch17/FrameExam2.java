package ch17;

import javax.swing.JFrame;

public class FrameExam2 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("프레임 테스트");
		f.setSize(200,300);
		f.setVisible(true);
		
		//창을 닫아도 프로그램은 계속 진행중
		//
		//창다기를 하면 프로그램을 끝냄
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
}
