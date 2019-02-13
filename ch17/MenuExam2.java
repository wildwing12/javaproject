package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuExam2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuExam2 frame = new MenuExam2();
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
	public MenuExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menyFile = new JMenu("파일");
		menuBar.add(menyFile);
		
		JMenuItem miNewFile = new JMenuItem("새파일");
		menyFile.add(miNewFile);
		
		JMenuItem miOpen = new JMenuItem("열기");
		menyFile.add(miOpen);
		
		JMenuItem miSave = new JMenuItem("저장");
		menyFile.add(miSave);
		
		JMenuItem miExit = new JMenuItem("종료");
		menyFile.add(miExit);
		
		JMenu miEdit = new JMenu("편집");
		menuBar.add(miEdit);
		
		JMenuItem miCancel = new JMenuItem("실행취소");
		miEdit.add(miCancel);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("복사");
		miEdit.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("붙여넣기");
		miEdit.add(mntmNewMenuItem_6);
		
		JMenu menuForm = new JMenu("서식");
		menuBar.add(menuForm);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("자동줄바꿈");
		menuForm.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("글꼴");
		menuForm.add(mntmNewMenuItem_8);
		
		JMenu miHelp = new JMenu("도움말");
		menuBar.add(miHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
