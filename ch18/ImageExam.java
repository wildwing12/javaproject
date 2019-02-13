package ch18;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageExam extends JFrame implements ActionListener {
	//멤버(필드)변수
	Image curImg;
	Panel p, view;
	JButton btnNormal, btnPart, btnScale, btnHori, btnVert, btnAll;
	Dimension d;//화면의 가로,세로 길이등의 정보를 저장하는 클래스
	int command;
	static final int SHOW_NORM = 0;
	static final int SHOW_PART = 1;
	static final int SHOW_SCALE = 2;
	static final int SHOW_HORI = 3;
	static final int SHOW_VERT = 4;
	static final int SHOW_ALL = 5;
	
	public ImageExam() {
		//이미지의 경로(상대경로)
		curImg =  Toolkit.getDefaultToolkit().getImage(getClass().getResource("flower.jpg"));
		//절대경로를 사용할 경우
//		curImg = Toolkit.getDefaultToolkit().getImage("D:\\work_java\\javaProject\\src\\ch18\\flower.jpg");	
		p = new Panel();
		btnNormal = new JButton("정상 그림");
		p.add(btnNormal);
		p.add(btnPart = new JButton("그림 일부"));
		p.add(btnScale = new JButton("축소"));
		p.add(btnHori = new JButton("좌우뒤집기"));
		p.add(btnVert = new JButton("상하뒤집기"));
		p.add(btnAll = new JButton("전부뒤집기"));
		//패널을 North에 배치
		add(p, BorderLayout.NORTH);
		//이벤트 리스너 연결
		this.btnNormal.addActionListener(this);
		this.btnPart.addActionListener(this);
		this.btnScale.addActionListener(this);
		this.btnHori.addActionListener(this);
		this.btnVert.addActionListener(this);
		this.btnAll.addActionListener(this);
		//프레임 설정
		this.setSize(600, 400);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		if (btn == btnNormal) {//정상그림 버튼
			command =SHOW_NORM;
		}else if (btn == btnPart) {//부분그림 버튼
			command = SHOW_PART;
		}else if (btn == btnScale) {//축소그림 버튼
			command = SHOW_SCALE;
		}else if (btn == btnHori) {//좌우뒤집기
			command = SHOW_HORI;
		}else if (btn == btnVert) {//상하뒤집기
			command = SHOW_VERT;
		}else if (btn == btnAll) {//모두뒤집기
			command = SHOW_ALL;
		}
		repaint();//paint()호출
	}//end actionPerformed()
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		d = p.getSize();//패널의 사이즈값을 디멘젼에 전달
		switch(command) {
		case SHOW_NORM:
			g.drawImage(curImg, 0, d.height, this);
			//d.height은 버튼이 위치한 패널의 높이(폭)만큼 y좌표값을 조정
			break;
		case SHOW_PART: //부분그림
			g.drawImage(curImg, 0, d.height, 100, d.height+100, 60, 
					60, 120, 120, this);
			break;
		case SHOW_SCALE: //축소
			g.drawImage(curImg, 0, d.height, curImg.getWidth(this)/2, 
					d.height+curImg.getHeight(this)/2, 0, 0, 
					curImg.getWidth(this), curImg.getHeight(this), this);
			break;
		case SHOW_HORI: //좌우뒤집기
			g.drawImage(curImg, curImg.getWidth(this), d.height, 0, 
					d.height+curImg.getHeight(this), 0, 0, curImg.getWidth(this), 
					curImg.getHeight(this), this);
			break;
		case SHOW_VERT: //상하뒤집기
			g.drawImage(curImg, 0, d.height+curImg.getHeight(this), 
					curImg.getWidth(this), d.height, 0, 0,
					curImg.getWidth(this), curImg.getHeight(this), this);
			break;
		case SHOW_ALL: //모두 뒤집기
			g.drawImage(curImg, curImg.getWidth(this), d.height+curImg.getHeight(this), 
					0, d.height, 0, 0, curImg.getWidth(this), 
					curImg.getHeight(this), this);
			break;
		}
	}//end paint()
	public static void main(String[] args) {
		new ImageExam();
	}

}
