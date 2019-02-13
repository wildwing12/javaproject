package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAtion implements ActionListener{
	//멤버변수(필드변수)
	private JFrame f;
	private Color c;
	//component : 화면구성 요소(버튼, 라디오버튼, 체크 박스,,,)
	//container : 다른 컴포넌트를 담을 수 있는 요소
	private Container con;
	public MyColorAtion(JFrame f, Color c) {
		this.f =f;
		con=f.getContentPane();
		this.c=c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
	}
	

}
