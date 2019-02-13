package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//1.기본 BorderLayout
//2.JScrollPane을 center에 배치
//3.
public class TableExam1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableExam1 frame = new TableExam1();
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
	public TableExam1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		// 코드추가
		// 표의 제목 열(title)
		String[] title = { "번호", "이름", "입사일자" };
		// 표의 데이터(rows)
		String[][] data = { { "1", "kim", "2019-01-01" }
							, { "2", "park", "2017-02-01" },
							{ "3", "hong", "2018-03-01" }
							};
		//new JTable(rows, header)
		table = new JTable(data, title);
		scrollPane.setViewportView(table);
	}

}
