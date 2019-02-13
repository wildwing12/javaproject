package ch17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderExam extends JFrame {
	public BorderExam() {
		setTitle("Borderlayout 테스트");// 타이틀 설정
		JButton button1 = new JButton("버튼1");// 버튼 생성
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		this.add(button1);// this(프레임)
////		this.add(button2);
////		this.add(button3);
//		
////		this.add(button4);
////		this.add(button5);
////		this.add(button6);
		
		add(button2, "North");
		add(button3, "South");
		add(button4, "East");
		add(button5, "West");
		add(button6, "West");

		JPanel p = new JPanel();
		p.add(button5);
		p.add(button6);
		add(p, "West");

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new BorderExam();// 생성자가 자동으로 호출
		//BorderLayout이 기본 레이아웃이기 때문에 Center에 배치됨.
		//한 영역에 컴포넌트를 한개만 배치가 됨.
		
	}

}
