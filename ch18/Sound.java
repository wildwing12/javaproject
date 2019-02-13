package ch18;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener{
	private AudioClip audio;//사운드 처리 객체
	private JButton play, stop, loop;
	
	@Override
	public void init() {
		//화면 레이아웃 변경(기본: 보더레이아웃)
		setLayout(new FlowLayout());
		audio= getAudioClip(getClass().getResource("dingdong.wav"));
		
		//
		play = new JButton("play");
		stop= new JButton("stop");
		loop=new JButton("loop");
		add(play);
		add(stop);
		add(loop);
		
		// 버튼 이벤트 기능 추가
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		//getSource()는 Object 타입이어서 형변환해주어야함
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn == stop) {
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}

	
	}
}
