package ch17;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MessageExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageExam frame = new MessageExam();
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
	public MessageExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnmMessage = new JButton("Message");
		btnmMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MessageExam.this, "Message");
			}
		});
		contentPane.add(btnmMessage);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MessageExam.this,"종료할까요?", null,
						JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println(result);
				switch(result) {
				case JOptionPane.YES_NO_OPTION:
					JOptionPane.showMessageDialog(MessageExam.this, "프로그램을 종료합니다."); 
					System.exit(0);
					break;
				case JOptionPane.NO_OPTION:
					JOptionPane.showMessageDialog(MessageExam.this, "NO 버튼을 눌렀습니다."); break; 
				case JOptionPane.CANCEL_OPTION:
					JOptionPane.showMessageDialog(MessageExam.this, "Cancel 버튼을 눌렀습니다."); break;
				}
			}
		});
		contentPane.add(btnConfirm);
		
		JButton btnInput = new JButton("Input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog(MessageExam.this,"이름을 입력하세요.");
				JOptionPane.showInputDialog(MessageExam.this, name+"님 환영합니다.");
			}
		});
		contentPane.add(btnInput);
		
		JButton btnOption = new JButton("Option");
		btnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//사용자 정의 버튼
				String[] str= {"추가","수정","삭제"};
				JOptionPane.showOptionDialog(MessageExam.this, "선택하세요", "작업선택", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
						str, str[0]);
				
			}
		});
		contentPane.add(btnOption);
	}

}
