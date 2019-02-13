package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxExam frame = new CheckBoxExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CheckBoxExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JCheckBox ckJava = new JCheckBox("Java");
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//getStateChange() 체크 박스 체크 상태를 나타냄
				System.out.println(e.getStateChange());//콘솔화면에 출력
				//append(문자열): 문자 추가
				//setText(문자열): 문자 변경.  setText(""):화면 클리어
				//getText();문자값을 가져올때
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("Java를 신청했습니다.\n");
				}else {
					ta.append("Java를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckC = new JCheckBox("C");
		ckC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("C를 신청했습니다.\n");
				}else {
					ta.append("C를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckC);
		
		JCheckBox ckIot = new JCheckBox("Iot");
		ckIot.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("Iot를 신청했습니다.\n");
				}else {
					ta.append("Iot를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckIot);
		
		JCheckBox ckDb = new JCheckBox("DB");
		ckDb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("DB를 신청하셨습니다.\n");
				}else {
					ta.append("DB를 취소하셨습니다.\n");
				}
			}
		});
		panel.add(ckDb);
		
		JCheckBox ckHtml = new JCheckBox("HTML");
		ckHtml.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("HTML을 신청하셨습니다.\n");
				}else {
					ta.append("HTML을 취소하셨습니다.\n");
				}
			}
		});
		panel.add(ckHtml);
		
		JCheckBox ckJsp = new JCheckBox("JSP");
		ckJsp.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.append("JSP를 신청하셨습니다.\n");
				}else {
					ta.append("JSP를 취소하셔습니다.\n");
				}
					
			}
		});
		panel.add(ckJsp);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JButton BtEx = new JButton("종료");
		BtEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(BtEx, BorderLayout.SOUTH);
	}

}
